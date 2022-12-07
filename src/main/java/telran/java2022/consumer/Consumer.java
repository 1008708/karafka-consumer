package telran.java2022.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@KafkaListener(topics = "8vqspdeu-default")
	public void testConsumer(String message) {
		System.out.println(message);
	}
}
