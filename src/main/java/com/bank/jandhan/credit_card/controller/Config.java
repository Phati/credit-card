package com.bank.jandhan.credit_card.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class Config {
    ObjectMapper objectMapper = new ObjectMapper();


    @Bean("creditCard")
    @Primary
    public CreditCardData getCreditCards() throws IOException {
        CreditCardData creditCardData = new CreditCardData();
        try(InputStream inputStream = getClass().getResourceAsStream("/data.json")){
            String content;
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            content = reader.lines().collect(Collectors.joining(System.lineSeparator()));
            List<CreditCard> creditCardList = objectMapper.readValue(content, new TypeReference<>() {});
            creditCardData.setCreditCardList(creditCardList);
        }catch (Exception e){
            e.printStackTrace();
        }

        return creditCardData;
    }
}
