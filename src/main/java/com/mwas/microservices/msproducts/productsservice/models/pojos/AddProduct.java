package com.mwas.microservices.msproducts.productsservice.models.pojos;

import com.mwas.microservices.msproducts.productsservice.datalayer.Product;
import java.util.ArrayList;
import java.util.List;

public class AddProduct{

    private List<Product> productRecords;

    private static AddProduct addprd = null;

    private AddProduct(){
        productRecords = new ArrayList<Product>();
    }

    public static AddProduct getInstance() {

        if(addprd == null) {
            addprd = new AddProduct();
            return addprd;
        }
        else {
            return addprd;
        }
    }

    public void add(Product prd) {
        productRecords.add(prd);
    }

    public String upDateProduct(Product prd) {

        for(int i=0; i<productRecords.size(); i++)
        {
            Product prdt = productRecords.get(i);
            if(prdt.getId().equals(prd.getId())) {
                productRecords.set(i, prd);//update the new record
                return "Update successful";
            }
        }

        return "Update un-successful";
    }

    public String deleteProduct(String registrationNumber) {

        for(int i=0; i<productRecords.size(); i++)
        {
            Product prdt = productRecords.get(i);
            if(prdt.getId().equals(prdt.getId())){
                productRecords.remove(i);//update the new record
                return "Delete successful";
            }
        }

        return "Delete un-successful";
    }

    public List<Product> getProductRecords() {
        return productRecords;
    }

}
