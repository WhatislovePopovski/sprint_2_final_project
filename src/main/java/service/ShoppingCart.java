package service;

import model.Food;

public class ShoppingCart {
    private Food[] cart;

    public ShoppingCart(Food[] cart){
        this.cart = cart;
    }

    public double getSumNoDiscount(){
        double totalSumNoDiscount = 0.0;
        for(int i = 0; i < cart.length; i++){
            totalSumNoDiscount += cart[i].getAmount() * cart[i].getPrice();
        }
        return totalSumNoDiscount;
    }

    public double getSumWithDiscount(){
        double totalSumWithDiscount = 0.0;
        for(int i = 0; i < cart.length; i++){
            totalSumWithDiscount += (cart[i].getAmount() * cart[i].getPrice() * (100 - cart[i].getDiscount()) / 100);
        }
        return totalSumWithDiscount;
    }

    public double getSumVegetarianNoDiscount(){
        double sumVegetarianNoDiscount = 0.0;

        for (int i = 0; i < cart.length; i++){
            if(cart[i].isVegetarian()){
                sumVegetarianNoDiscount += cart[i].getAmount() * cart[i].getPrice();
            }
        }
        return sumVegetarianNoDiscount;
    }
}
