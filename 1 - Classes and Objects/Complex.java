package com.jetbrains.ClassesAndObjects;

import java.util.Scanner;

public class Complex {
    float real,img;
    Complex(float real,float img){
        this.real = real;
        this.img = img;
    }

    Complex(){
        this.real = 0.0f;
        this.img = 0.0f;
    }

    void add(Complex other){
        this.real += other.real;
        this.img +=other.img;
    }
    Complex add(Complex first,Complex second){
        return new Complex(first.real+second.real,first.img+second.img);
    }
    void subtract(Complex other){
        this.real -=other.real;
        this.img -=other.img;
    }
    void display(){
        System.out.println(this.real + " + (" + this.img + ") i");
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        Complex complex = new Complex();
        while (true){
            System.out.print("Press \n 1 for entering a complex number \n 2 for adding to it  \n 3 for just see the result of addition (to demonstrate method overloading) \n 4 for subtracting from it \n 5 for exit : ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the real and imaginary parts ");
                    complex = new Complex(scanner.nextFloat(),scanner.nextFloat());
                    System.out.println("The entered complex number is");
                    complex.display();
                    break;
                case 2:
                    System.out.println("Enter the real and imaginary parts of other complex number");
                    complex.add(new Complex(scanner.nextFloat(),scanner.nextFloat()));
                    System.out.println("The complex number after addition is ");
                    complex.display();
                    break;
                case 3:
                    System.out.println("Enter the real and imaginary parts of other complex number");
                    complex.add(complex,new Complex(scanner.nextFloat(),scanner.nextFloat())).display();
                    System.out.println("would be the addition result");
                    break;
                case 4:
                    System.out.println("Enter the real and imaginary parts of other complex number");
                    complex.subtract(new Complex(scanner.nextFloat(),scanner.nextFloat()));
                    complex.display();
                    break;
                case 5:
                default:
                    System.exit(0);
            }
        }
    }
}
