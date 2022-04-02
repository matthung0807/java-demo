package com.abc.demo;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.GetQueueUrlRequest;
import software.amazon.awssdk.services.sqs.model.GetQueueUrlResponse;
import software.amazon.awssdk.services.sqs.model.SendMessageRequest;
import software.amazon.awssdk.services.sqs.model.SendMessageResponse;

public class Main {

    public static void main(String[] arges) {
        SqsClient sqsClient = SqsClient.builder()
                .region(Region.AP_NORTHEAST_1)
                .build();
        String queueUrl = getQueueUrl(sqsClient);
        String message = "hello world from java";
        SendMessageResponse sendMessageResponse = sendMessageToSQS(sqsClient, queueUrl, message);
        System.out.println(sendMessageResponse.messageId());

    }

    public static String getQueueUrl(SqsClient sqsClient) {
        GetQueueUrlResponse getQueueUrlResponse =
                sqsClient.getQueueUrl(
                        GetQueueUrlRequest.builder()
                                .queueName("DemoQueue")
                                .build());
        return getQueueUrlResponse.queueUrl();
    }

    public static SendMessageResponse sendMessageToSQS(SqsClient sqsClient, String queueUrl, String message) {
        SendMessageRequest sendMessageRequest = SendMessageRequest.builder()
                .queueUrl(queueUrl)
                .messageBody(message)
                .build();
        return sqsClient.sendMessage(sendMessageRequest);

    }

}
