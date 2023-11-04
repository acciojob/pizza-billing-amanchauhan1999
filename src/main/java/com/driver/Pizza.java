package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private boolean cheeze = true;
    private  boolean vegtoppings = true;
    private  boolean nonvegtoppings = true;
    private boolean take = true;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if (isVeg){
            price = 300;
            bill = "Base Price Of The Pizza: 300"+System.lineSeparator();
        }else{
            price =400;
            bill = "Base Price Of The Pizza: 400"+System.lineSeparator();
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (cheeze) {
            price = price + 80;
            cheeze = false;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            if (vegtoppings){
            price = price+70;
            vegtoppings = false;
            bill += "Extra Toppings Added: 70"+System.lineSeparator();
            }
        }else {
            if (nonvegtoppings){
            price = price + 120;
            nonvegtoppings = false;
            bill += "Extra Toppings Added: 120"+System.lineSeparator();
            }
        }
    }

    public void addTakeaway(){
       if (take){
           price = price+20;
           take = false;
       }

    }

    public String getBill(){
        if (!cheeze){
            bill += "Extra Cheese Added: 80"+System.lineSeparator();
        }if (!vegtoppings){
            bill += "Extra Toppings Added: 70"+System.lineSeparator();
        }if (!nonvegtoppings){
            bill += "Extra Toppings Added: 120"+System.lineSeparator();
        }if (!take){
            bill += "Paperbag Added: 20"+System.lineSeparator();
        }
        bill += "Total Price: "+getPrice()+System.lineSeparator();
        return this.bill;
    }
}
