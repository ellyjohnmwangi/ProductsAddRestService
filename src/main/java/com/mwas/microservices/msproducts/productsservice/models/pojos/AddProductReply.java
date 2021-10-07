package com.mwas.microservices.msproducts.productsservice.models.pojos;

public class AddProductReply {
    String name;
    int amount;
    String id;
    String registrationStatus;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getId() {
        return id;
    }
    public void setId(String Id) {
        this.id = Id;
    }
    public String getRegistrationStatus() {
        return registrationStatus;
    }
    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

}
