package com.mic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App_B_Controller {

    private static final Logger log = LoggerFactory.getLogger(App_B_Controller.class);

    @PostMapping("/b")
    public App_B_ResponseDTO post(@RequestBody App_B_RequestDTO requestDTO) {
        App_B_ResponseDTO appBResponseDTO = new App_B_ResponseDTO();
        appBResponseDTO.setA("Test by Michael with input=[" + requestDTO.getA() + "]");
        log.info("Completed App B and return with result=[" + appBResponseDTO.getA() + "]");
        return appBResponseDTO;
    }
}
