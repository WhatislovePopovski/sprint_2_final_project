package model;

public class Meat extends Food{
    public Meat(int amount, double price, boolean isVegetarian){
        super(amount, price, false);
    }

    @Override
    public  double getDiscount(){
        return 0.0;
    }
}
