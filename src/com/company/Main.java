package com.company;

public class Main {

    static double Dodawanie(double a, double b)
    {
        return (a+b);
    }
    static double Odejmownie(double a, double b)
    {
        return (a-b);
    }
    static double Mnozenie(double a, double b)
    {
        return (a*b);
    }
    static double Dzielenie(double a, double b)
    {
        return (a/b);
    }

    public static void main(String[] args) {
        double a = 10,b = 5;
        System.out.println(Dodawanie(a,b));
        System.out.println(Odejmownie(a,b));
        System.out.println(Mnozenie(a,b));
        System.out.println(Dzielenie(a,b));

    }
}
