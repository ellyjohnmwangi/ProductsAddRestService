package com.mwas.microservices.msproducts.productsservice.entry.controllers;

import com.mwas.microservices.msproducts.productsservice.datalayer.Product;
import com.mwas.microservices.msproducts.productsservice.models.pojos.AddProduct;
import com.mwas.microservices.msproducts.productsservice.models.pojos.AddProductReply;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class ProductPostController {

    @RequestMapping(method = RequestMethod.POST, value="/add/product")

    @ResponseBody
    public AddProductReply addProduct(@RequestBody Product product){
        System.out.println("In addProduct");
        AddProductReply prodaddreply = new AddProductReply();
        AddProduct.getInstance().add(product);
        //We are setting the below value just to reply a message back to the caller
        prodaddreply.setName(product.getName());
        prodaddreply.setAmount(product.getAmount());
        prodaddreply.setId(product.getId());
        prodaddreply.setRegistrationStatus("Successful");

        return prodaddreply;
    }

}