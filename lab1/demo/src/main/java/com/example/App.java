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
        int i = 0;

        while (i < size)
        {
            System.out.println("Введите " + i + " елемент массива: ");
            myArray[i] = sc.nextInt();
            i++;
        }

        int summ = 0;
        i = 0;
        int minn = myArray[0];
        int maxx = myArray[0];

        while (i < size) 
        {
            summ += myArray[i];
            if (myArray[i] > maxx)
            {
                maxx = myArray[i];
            }

            if (myArray[i] < minn)
            {
                minn = myArray[i];
            }
            i++;

        }

        int sred = summ / myArray.length;
        System.out.println("сумма элементов = " + summ);
        System.out.println("минимальный: " + minn + "; максимальный: " + maxx);
        sc.close();
    }
}
