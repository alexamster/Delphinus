package com.delphinus.demo.test

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @RequestMapping("/")
    fun index(): String {
        return "Greetings from Spring Boot!"
    }
}
