package com.tme.chargingunit.kafka;

public final class KafkaClientFactory {

    private KafkaClientFactory() {
    }
    
    /**
     * 
     * @return an instance of KafkaClientImpl
     */
    public static KafkaClient createKafkaClient() {
        return new KafkaClientImpl();
    }
}
