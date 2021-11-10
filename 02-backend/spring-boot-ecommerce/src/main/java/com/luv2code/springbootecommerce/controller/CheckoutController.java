package com.luv2code.springbootecommerce.controller;

import com.luv2code.springbootecommerce.dto.Purchase;
import com.luv2code.springbootecommerce.dto.PurchaseResponse;
import com.luv2code.springbootecommerce.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// @CrossOrigin("http://localhost:4200") -- not required as cross origin has been added to MyDataRestConfig.configureRepositoryRestConfiguration()
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    @Autowired
    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;

    }

}
