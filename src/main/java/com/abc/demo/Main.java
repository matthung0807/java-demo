package com.abc.demo;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.ListObjectsRequest;
import software.amazon.awssdk.services.s3.model.ListObjectsResponse;
import software.amazon.awssdk.services.s3.model.S3Object;

import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] arges) {
        S3Client s3Client = S3Client.builder()
                .region(Region.AP_NORTHEAST_1)
                .build();

        ListObjectsRequest listObjectsRequest = ListObjectsRequest.builder()
                .bucket("s3-demo-bucket-202112151320") // bucket name
                .build();

        ListObjectsResponse res = s3Client.listObjects(listObjectsRequest);
        List<S3Object> s3ObjectList = res.contents();

        for (S3Object s3Object : s3ObjectList) {
            System.out.print("key=" + s3Object.key());
        }
    }
}
