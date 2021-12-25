package com.abc.demo;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.kinesis.KinesisClient;
import software.amazon.awssdk.services.kinesis.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] arges) {
        KinesisClient kinesisClient = KinesisClient.builder()
                .region(Region.AP_NORTHEAST_1)
                .build();
        getDataFromKinesisDataStream(kinesisClient, "KinesisDataStreamDemo");
        kinesisClient.close();
    }

    public static void getDataFromKinesisDataStream(KinesisClient kinesisClient, String streamName) {
        DescribeStreamRequest describeStreamRequest = DescribeStreamRequest.builder()
                .streamName(streamName)
                .build();

        DescribeStreamResponse streamResponse = kinesisClient.describeStream(describeStreamRequest);
        List<Shard> shards = new ArrayList<>(streamResponse.streamDescription().shards());
        String lastShardId = shards.get(shards.size() - 1).shardId();

        GetShardIteratorRequest itReq = GetShardIteratorRequest.builder()
                .streamName(streamName)
                .shardIteratorType(ShardIteratorType.TRIM_HORIZON)
                .shardId(lastShardId)
                .build();

        GetShardIteratorResponse shardIteratorResult = kinesisClient.getShardIterator(itReq);
        String shardIterator = shardIteratorResult.shardIterator();

        GetRecordsRequest recordsRequest = GetRecordsRequest.builder()
                .shardIterator(shardIterator)
                .limit(1000) // Set maximum records to return to 1000.
                .build();

        GetRecordsResponse result = kinesisClient.getRecords(recordsRequest);

        List<Record> records = result.records();
        for (Record record : records) {
            System.out.println(new String(record.data().asByteArray()));
        }
    }

}
