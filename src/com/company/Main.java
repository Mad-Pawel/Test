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
        if(b >0 || b < 0)
        return (a/b);
        else
            System.out.println("Nie dziel przez zero holero" );
        return 0;
    }
    static double Potęgownie(double a, double b)
    {
        return (Math.pow(a,b));
    }

    public static void main(String[] args) {
        double a = 10,b = 5;
        System.out.println(Dodawanie(a,b));
        System.out.println(Odejmownie(a,b));
        System.out.println(Mnozenie(a,b));
        System.out.println(Dzielenie(a,b));
        System.out.println(Potęgownie(a,b));

    }
}
