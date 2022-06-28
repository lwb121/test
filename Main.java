package com.company;

public class Main {

    public static void main(String[] args) {
        Fruits fruits = new Fruits(1,2,4);
        Double oneMoney = getOneMoney(fruits);
        Double twoMoney = getTwoMoney(fruits);
        Double threeMoney = getThreeMoney(fruits);
        Double fourMoney = getFourMoney(fruits);
        System.out.println("A:"+oneMoney);
        System.out.println("B:"+twoMoney);
        System.out.println("C:"+threeMoney);
        System.out.println("D:"+fourMoney);
    }

    public static Double getOneMoney(Fruits fruits){
        Double sum=0.0;
        sum=8.0*fruits.getApple()+13.0*fruits.getStrawberry();
        return sum;
    }

    public static Double getTwoMoney(Fruits fruits){
        Double sum=0.0;
        sum=8.0*fruits.getApple()+13.0*fruits.getStrawberry()+20.0*fruits.getMango();
        return sum;
    }
    public static Double getThreeMoney(Fruits fruits){
        Double sum=0.0;
        sum=8.0*fruits.getApple()+13.0*fruits.getStrawberry()*0.8+20.0*fruits.getMango();
        return sum;
    }
    public static Double getFourMoney(Fruits fruits){
        Double sum=0.0;
        sum=8.0*fruits.getApple()+13.0*fruits.getStrawberry()*0.8+20.0*fruits.getMango();
        if (sum>=100){
            sum-=10;
        }
        return sum;
    }
}
