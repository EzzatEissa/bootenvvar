package com.test.env.var.envvar.contoller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @Value("${ezzat.name:noname}")
    private String userName;

    @Value("${EZZAT_NAME:noname}")
    private String userName2;

    @GetMapping("/")
    public String getUserName() {
        return userName + userName2;
    }
}
