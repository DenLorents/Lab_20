package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество четырёхугольников: ");
        int inCountQuadrate = scan.nextInt();

        Quadrate[] quadrates = new Quadrate[inCountQuadrate];

        for (int i = 0; i < quadrates.length; i++) {
            quadrates[i] = new Quadrate();

            System.out.print("Введите x1 для квадрата №" + (i + 1) + ": ");
            quadrates[i].setX1(scan.nextInt());
            System.out.print("Введите y1 для квадрата №" + (i + 1) + ": ");
            quadrates[i].setY1(scan.nextInt());

            System.out.print("Введите x2 для квадрата №" + (i + 1) + ": ");
            quadrates[i].setX2(scan.nextInt());
            System.out.print("Введите y2 для квадрата №" + (i + 1) + ": ");
            quadrates[i].setY2(scan.nextInt());

            System.out.print("Введите x3 для квадрата №" + (i + 1) + ": ");
            quadrates[i].setX3(scan.nextInt());
            System.out.print("Введите y3 для квадрата №" + (i + 1) + ": ");
            quadrates[i].setY3(scan.nextInt());

            System.out.print("Введите x4 для квадрата №" + (i + 1) + ": ");
            quadrates[i].setX4(scan.nextInt());
            System.out.print("Введите y4 для квадрата №" + (i + 1) + ": ");
            quadrates[i].setY4(scan.nextInt());
        }

        for (int i = 0; i < quadrates.length; i++) {
            // d = √((x2-x1)²+(y2-y1)²),
            quadrates[i].side1 = Math.sqrt((Math.pow(quadrates[i].x2 - quadrates[i].x1, 2)) + Math.pow(quadrates[i].y2 - quadrates[i].y1, 2));
            quadrates[i].side2 = Math.sqrt((Math.pow(quadrates[i].x3 - quadrates[i].x2, 2)) + Math.pow(quadrates[i].y3 - quadrates[i].y2, 2));
            quadrates[i].side3 = Math.sqrt((Math.pow(quadrates[i].x4 - quadrates[i].x3, 2)) + Math.pow(quadrates[i].y4 - quadrates[i].y3, 2));
            quadrates[i].side4 = Math.sqrt((Math.pow(quadrates[i].x4 - quadrates[i].x1, 2)) + Math.pow(quadrates[i].y4 - quadrates[i].y1, 2));

            quadrates[i].diagonal1 = Math.sqrt((Math.pow(quadrates[i].x3 - quadrates[i].x1, 2)) + Math.pow(quadrates[i].y3 - quadrates[i].y1, 2));
            quadrates[i].diagonal2 = Math.sqrt((Math.pow(quadrates[i].x2 - quadrates[i].x4, 2)) + Math.pow(quadrates[i].y2 - quadrates[i].y4, 2));

            quadrates[i].perimeter = quadrates[i].side1 + quadrates[i].side2 + quadrates[i].side3 + quadrates[i].side4;

            if(quadrates[i].side1 == quadrates[i].side2 || quadrates[i].side1 == quadrates[i].side4 && quadrates[i].side3 == quadrates[i].side2 || quadrates[i].side3 == quadrates[i].side4 && quadrates[i].diagonal1 != quadrates[i].diagonal2) {
                quadrates[i].rhombus = true;
            }
        }

        for (int i = 0; i < quadrates.length; i++) {
            System.out.println("Фигура №" + i + 1 + ":");
            System.out.println("Сторона №1 = " + quadrates[i].side1);
            System.out.println("Сторона №2 = " + quadrates[i].side2);
            System.out.println("Сторона №3 = " + quadrates[i].side3);
            System.out.println("Сторона №4 = " + quadrates[i].side4);
            System.out.println("Диагональ №1 = " + quadrates[i].diagonal1);
            System.out.println("Диагональ №2 = " + quadrates[i].diagonal2);
            System.out.println("Периметр фигуры = " + quadrates[i].perimeter);
            System.out.println("Фигура является ромбом: " + quadrates[i].rhombus);
        }
    }
}