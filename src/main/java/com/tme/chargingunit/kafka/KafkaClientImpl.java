package com.tme.chargingunit.kafka;

public class KafkaClientImpl implements KafkaClient{

    @Override
    public String sendKafkaMsg(String msg) {
        System.out.println("\nsendKafkaMsg method has initiated\n");
        return "Kafka msg successfully sent: " + msg;
    }
    
}
