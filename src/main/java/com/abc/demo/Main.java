package com.abc.demo;

import software.amazon.awssdk.core.SdkBytes;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.kinesis.KinesisClient;
import software.amazon.awssdk.services.kinesis.model.PutRecordRequest;
import software.amazon.awssdk.services.kinesis.model.PutRecordResponse;

import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] arges) {
        KinesisClient kinesisClient = KinesisClient.builder()
                .region(Region.AP_NORTHEAST_1)
                .build();

        String data = "Hello world";

        PutRecordRequest putRecordRequest = PutRecordRequest.builder()
                .streamName("KinesisDataStreamDemo")
                .partitionKey("demo-001")
                .data(SdkBytes.fromString(data, StandardCharsets.UTF_8))
                .build();

        PutRecordResponse putRecordResponse = kinesisClient.putRecord(putRecordRequest);
        String sequenceNumber = putRecordResponse.sequenceNumber();
        System.out.println(sequenceNumber);
    }
}
