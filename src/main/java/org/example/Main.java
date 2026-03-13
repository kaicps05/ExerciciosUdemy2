package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite a medida do triangulo X : ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite a medida do trianglo Y : ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.println("Area do triangulo X:" + areaX);
        System.out.println("Area do triangulo Y:" + areaY);

        sc.close();

    }
}