package com.abc.demo;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.*;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] arges) {
        SqsClient sqsClient = SqsClient.builder()
                .region(Region.AP_NORTHEAST_1)
                .build();
        String queueUrl = getQueueUrl(sqsClient);
        List<Message> messageList = getMessageListFromSQS(sqsClient, queueUrl);
        System.out.println(messageList.size());
        if (!messageList.isEmpty()) {
            var message = messageList.get(0);
            System.out.println(message.messageId());
            System.out.println(message.body());
        }

    }

    public static String getQueueUrl(SqsClient sqsClient) {
        GetQueueUrlResponse getQueueUrlResponse =
                sqsClient.getQueueUrl(
                        GetQueueUrlRequest.builder()
                                .queueName("DemoQueue")
                                .build());
        return getQueueUrlResponse.queueUrl();
    }

    public static List<Message> getMessageListFromSQS(SqsClient sqsClient, String queueUrl) {
        try {
            ReceiveMessageRequest receiveMessageRequest = ReceiveMessageRequest.builder()
                    .queueUrl(queueUrl)
                    .maxNumberOfMessages(1)
                    .visibilityTimeout(5)
                    .build();
            return sqsClient.receiveMessage(receiveMessageRequest).messages();
        } catch (SqsException e) {
            System.err.println(e.awsErrorDetails().errorMessage());
        }
        return Collections.emptyList();
    }

}
