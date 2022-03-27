package com.company;

import java.util.Scanner;

class formylaException extends Exception{

    private double y;
    public double getY(){
        return y;
    }
    public formylaException(String massage, double y){
        super(massage);
        this.y = y;
    }
}

class calculation{
    public static double getCalculation(double x, double y) throws formylaException{
        double result;
        if(y == -1) throw new  formylaException("В делителе 0! Будь аккуратнее!", y);
        result = (x + y)/(y + 1);
        return result;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите значение x");
        Scanner ix = new Scanner(System.in);
        int x = ix.nextInt();

        System.out.println("Введите значение y");
        Scanner iy = new Scanner(System.in);
        int y = iy.nextInt();

        try{
            double result = calculation.getCalculation(x, y);
            System.out.printf("x+y/y+1 = %f",result);
        }
        catch (formylaException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getY());
        }
    }
}













