package com.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        int[] myArray = new int[size];

        for (int i = 0; i < size; i++)
        {
            System.out.println("Введите " + i + " елемент массива: ");
            myArray[i] = sc.nextInt();
        }
        int summ = 0;

        for (int i = 0; i < myArray.length; i++) 
        {
            summ += myArray[i];
        }
        int sred = summ / myArray.length;
        System.out.println("сумма элементов = " + summ);
        System.out.println("среднее: " + sred);
        sc.close();
    }
}