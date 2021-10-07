package com.mwas.microservices.msproducts.productsservice.entry.controllers;

import com.mwas.microservices.msproducts.productsservice.datalayer.Product;
import com.mwas.microservices.msproducts.productsservice.models.pojos.AddProduct;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ProductGetController {

    @RequestMapping(method = RequestMethod.GET, value="/product/allproducts")

    @ResponseBody
    public List<Product> getAllProducts() {
        return AddProduct.getInstance().getProductRecords();
    }

}
