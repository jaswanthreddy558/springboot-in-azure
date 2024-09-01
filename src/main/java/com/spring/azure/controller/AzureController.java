package com.spring.azure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud")
public class AzureController {
    @GetMapping("azure")
    public String getAllCommentsByTutorialId() {

        return "Welcome To Azure World";
    }
}
