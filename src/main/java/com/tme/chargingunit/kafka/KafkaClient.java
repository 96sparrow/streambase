package com.tme.chargingunit.kafka;

public interface KafkaClient {
    /**
     * @param message to be sent
     * @return result received from sending a message
     */
    String sendKafkaMsg(String msg);
    
    
}
