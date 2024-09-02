package com.example.aiDemo;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {
    @Bean
    ChatClient chatClientConfig(ChatClient.Builder builder){
        return builder.build();
    }
}
