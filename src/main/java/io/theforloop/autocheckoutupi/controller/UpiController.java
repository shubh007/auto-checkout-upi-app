package io.theforloop.autocheckoutupi.controller;

import io.theforloop.autocheckoutupi.pojo.ReqPay;
import io.theforloop.autocheckoutupi.pojo.RespPay;
import io.theforloop.autocheckoutupi.pojo.ValidateAddressReq;
import io.theforloop.autocheckoutupi.pojo.ValidateAddressResp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpiController {

    @PostMapping("valProduct")
    public ValidateAddressResp validateAddress(@RequestBody ValidateAddressReq validateAddressReq){
        ValidateAddressResp validateAddressResp = new ValidateAddressResp();
        validateAddressResp.setAmount(validateAddressReq.getAmount());
        validateAddressResp.setProductName("DEF");
        validateAddressResp.setVpaAddress(validateAddressReq.getVpaAddress());
        return validateAddressResp;
    }

    @PostMapping("reqPay")
    public RespPay RequestPay(@RequestBody ReqPay reqPay){
        RespPay respPay = new RespPay();
        respPay.setAmount(reqPay.getAmount());
        respPay.setProductName(reqPay.getProductName());
        respPay.setStatus(true);
        respPay.setVpaAddress(reqPay.getVpaAddress());
        return respPay;
    }
}
