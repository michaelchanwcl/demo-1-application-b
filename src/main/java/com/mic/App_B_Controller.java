package com.mic;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App_B_Controller {

    @PostMapping("/b")
    public App_B_ResponseDTO post(@RequestBody App_B_RequestDTO requestDTO) {
        App_B_ResponseDTO appBResponseDTO = new App_B_ResponseDTO();
        appBResponseDTO.setA("Test by Michael with input=[" + requestDTO.getA() + "]");
        return appBResponseDTO;
    }
}
