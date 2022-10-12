package com.rajesh;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    HealthyBurger(String meat,double price){
        super("Healthy",meat,"Brown rye",price);
    }
    public void addHealthAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddition2(String name,double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double HamburgerPrice =  super.itemizeHamburger();
        if(healthyExtra1Name!=null){
            HamburgerPrice += healthyExtra1Price;
            System.out.println("Added " + healthyExtra1Name + " extra on "+healthyExtra1Price);
        }
        if(healthyExtra2Name!=null){
            HamburgerPrice += healthyExtra2Price;
            System.out.println("Added " + healthyExtra2Name + " extra on "+healthyExtra2Price);
        }
        return HamburgerPrice;
    }

}
