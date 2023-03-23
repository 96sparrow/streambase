package com.tme.chargingunit.kafka;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class KafkaClientImplTest {
    private final KafkaClientImpl kafkaClientImpl = new KafkaClientImpl();
    
    @Test
        public void kafkaClientStringTest() {
            String testKafkaMsgContent = "testKafkaMsg";
            assertTrue(kafkaClientImpl.sendKafkaMsg(testKafkaMsgContent).contains(testKafkaMsgContent));
        }
    
    
    
}
