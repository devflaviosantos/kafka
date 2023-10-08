package com.devflaviosantos.paymentservice.config;

import java.util.HashMap;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
public class KafkaAdminConfig {
	
	private final KafkaProperties kafkaProperties;
	
	
	@Bean
	public KafkaAdmin kafkaAdmin() {
		var configs = new HashMap<String, Object>();
		configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaProperties.getBootstrapServers());
		return new KafkaAdmin(configs);
	}
	
	@Bean
	public KafkaAdmin.NewTopics newTopics(){
		return new KafkaAdmin.NewTopics(
				TopicBuilder.name("payment-topic").partitions(1).build()
				);
	}
}
