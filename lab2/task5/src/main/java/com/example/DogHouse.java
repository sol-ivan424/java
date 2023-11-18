package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class DogHouse {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        int f = 1;

        System.out.println("\nМеню:\n  1 - добавить собаку\n  2 - вывести список собак\n  0 - выход");
        f = sc.nextInt();
        while (f != 0){
            if (f == 0) // выход из программы
            {
                System.exit(0);
            }
            else if (f == 1) //добавление собаки
            {
                System.out.print("\nВведите имя собаки: ");
                String name = sc.next();
                System.out.print("\nВведите возраст собаки: ");
                int age = sc.nextInt();
                dogs.add(new Dog(name, age));
                System.out.println("\nСобака добавлена!");

            }
            else if (f == 2) //вывод собак
            {
                System.out.println("\nСобаки:");
                for(Dog dog : dogs) {
                    System.out.println("  " + dog.getName());
                }
            }
            else //ошибка ввода
            {
                System.out.println("\nПовторите ввод!");
            }
            System.out.println("\nМеню:\n  1 - добавить собаку\n  2 - вывести список собак\n  0 - выход");
            f = sc.nextInt();
        }
        sc.close();
    }
}
