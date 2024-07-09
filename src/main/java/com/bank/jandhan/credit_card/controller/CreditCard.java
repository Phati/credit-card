package com.bank.jandhan.credit_card.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {
    public String paymentid;
    public String sourceid;
    public int customerid;
    public String objectid;
    public String currency;
    public int billerid;
    public String billerName;
    public String billerCategory;
    public String paymentType;
    public String billerStatus;
    public String paymentstatus;
    public String errorCode;
    public String errorMessage;
    public String description;
    public String billid;
    public String accountno;
    public String balance;
    public String shortname;
    public String validationid;
    public String fee;
    public String debitAmt;
    public String scheduleDate;
    public String orderId;
}
