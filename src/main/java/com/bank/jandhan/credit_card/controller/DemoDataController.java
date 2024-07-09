package com.bank.jandhan.credit_card.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
public class DemoDataController {

    @Autowired
    CreditCardData creditCardData;

    @GetMapping("/credit-card")
    public ResponseEntity<?> getLoanApplication() throws JsonProcessingException {
        log.info("Credit card  api called");

        return new ResponseEntity<>(creditCardData.getCreditCardList(), HttpStatus.OK);
    }


}
