package com.example.aiDemo.controller;

import com.example.aiDemo.AiConfig;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AiController {

    private final ChatClient cc;

    AiController(ChatClient cc){
        this.cc = cc;
    }

    @GetMapping("/myChatBot")
    Map<String, String> chatBot(@RequestParam(value=" message", defaultValue = "Tell me your name")String message){
        return Map.of("myMsg",
                cc.prompt().user(message).call().content());
    }
}
