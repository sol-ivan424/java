package com.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int[] myArray = {1, 2, 3, 4, 5};

        // Вывод значений массива
        for (int i = 0; i < myArray.length; i++) 
        {
            System.out.println("Элемент " + i + ": " + myArray[i]);
        }
    }
}