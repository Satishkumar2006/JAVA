ABSTRACT CLASS INTERFACE
Question No: 1
reportIcon
Single File Programming Question

Write a java program to implement an abstract class "Marks" with a method "getPercentage()".

Then, create a class called "A" which extends "Marks" and has three attributes named "Marks1", "Marks2", and "Marks3". This class should also have a method named "getPercentage()" that calculates and prints the percentage of the student.

Similarly, create another class called "B" that extends "Marks" and has four attributes named "Marks1", "Marks2", "Marks3", and "Marks4". This class should also have a method named "getPercentage()" that calculates and prints the percentage of the student.


Please note that each mark is out of 100, and you should find the percentage for two students (Student A and Student B) and round off the output to two decimal places.
Input format

The first line of the input consists of three integers, i.e., the marks scored by student A.

The second line of the input consists of four integers, i.e., the marks scored by student B.
Output format

The first line prints the percentage of A.

The second line prints the percentage of B.
Sample testcases
Input 1

95 85 75
85 77 92 93

Output 1

85.00
86.75


import java.io.*;	
import java.util.*;

abstract class Marks
{
    public abstract void getPercentage();
}

class A extends Marks
{
    int Marks1, Marks2, Marks3;
    public A(int m1, int m2, int m3)
    {
        Marks1=m1;
        Marks2=m2;
        Marks3=m3;
    }
    public void getPercentage()
    {
        System.out.printf("%.2f\n",(Marks1+Marks2+Marks3)/3.0);
    }
}

class B extends Marks
{
    int Marks1, Marks2, Marks3, Marks4;
    public B(int m1, int m2, int m3, int m4)
    {
        Marks1=m1;
        Marks2=m2;
        Marks3=m3;
        Marks4=m4;
    }
    
    public void getPercentage()
    {
        System.out.printf("%.2f",(Marks1+Marks2+Marks3+Marks4)/4.0);
    }
}

class demo
{
    public static void main(String args[])
    {
        int m1,m2,m3,m4;
        Scanner sc=new Scanner(System.in);
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        A ob1=new A(m1,m2,m3);
        ob1.getPercentage();
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        B ob2=new B(m1,m2,m3,m4);
        ob2.getPercentage();
    }
}
==================IN IAMNEO
import java.io.*;
import java.util.*;
import java.text.*;
abstract class marks {
   abstract public void getPercentage();
}
class A extends marks {
    DecimalFormat d = new DecimalFormat("0.00");
    public int marks1;
    public int marks2;
    public int marks3;
    A() {
        this.marks1=0;
        this.marks2=0;
        this.marks3=0;
    }
    A(int m1,int m2,int m3) {
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }
    public void getPercentage() {
        int total = marks1+marks2+marks3;
        double percent = (total/300.0)*100.0;
        System.out.println(d.format(percent));
    }
}
class B extends marks {
    DecimalFormat d = new DecimalFormat("0.00");
    public int marks1;
    public int marks2;
    public int marks3;
    public int marks4;
    B() {
        this.marks1=0;
        this.marks2=0;
        this.marks3=0;
        this.marks4=0;
    }
    B(int m1,int m2,int m3,int m4) {
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
        this.marks4 = m4;
    }
    public void getPercentage() {
        int total = marks1+marks2+marks3+marks4;
        double percent = (total/400.0)*100.0;
        System.out.println(d.format(percent));
    }
}
class Main {
    public static void main(String args[]) {
        A a = new A();
        Scanner sc = new Scanner(System.in);
        a.marks1 = sc.nextInt();
        a.marks2 = sc.nextInt();
        a.marks3 = sc.nextInt();
        a.getPercentage();
        B b = new B();
        b.marks1 = sc.nextInt();
        b.marks2 = sc.nextInt();
        b.marks3 = sc.nextInt();
        b.marks4 = sc.nextInt();
        b.getPercentage();
    }
}

=============================================================================
Question No: 2
reportIcon
Single File Programming Question

Write a java program to create an interface called "ShapeCalculator" that has a method called "calc(int n)".

Then, create two classes called "Square" and "Circle" that implement the "ShapeCalculator" interface and implement the "calc(int n)" method.

Your program should calculate the area and perimeter of both squares and circles.


Input format

The input to your program will be a single integer that represents the side of the square and the radius of the circle.
Output format

The output of your program should be the area and perimeter of each shape. The output should be displayed in two lines. The first line should contain the area and perimeter of the square separated by a space, and the second line should contain the details of the circle in a similar format.


Please note that the details of the square should be calculated using integer type while the details of the circle should be calculated using double type
Sample testcases
Input 1

8

Output 1

64 32
200.96 50.24

Input 2

7

Output 2

49 28
153.86 43.96

import java.io.*;
import java.util.*;

interface ShapeCalculator
{
    public void calc(int n);
}

class Square implements ShapeCalculator
{
    public void calc(int n)
    {
        System.out.println((n*n)+" "+(4*n));
    }
}

class Circle implements ShapeCalculator
{
    public void calc(int n)
    {
        double n1=(double)n;
        System.out.printf("%.2f %.2f",3.14*n1*n1,2*3.14*n1);
    }
}



class demo
{
    public static void main(String s1[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Square s=new Square();
        s.calc(n);
        Circle c=new Circle();
        c.calc(n);
        
    }
}

=================IN IAMNEO
import java.util.*;
import java.math.*;
interface ShapeCalculator{
    void calc(int n);
}
class Square implements ShapeCalculator
{
    int ar, pr;
    public void calc(int s)
    {
        ar = s*s;
        pr = 4*s;
        System.out.print(ar + " " + pr + "\n");
    }
}
class Circle implements ShapeCalculator
{
    double ar, pr;
    double pi = 3.14;
    public void calc(int r)
    {
        ar = Math.round(pi*r*r* 100.0) / 100.0;
        pr = Math.round(2*pi*r * 100.0) / 100.0;
        System.out.println(ar + " " + pr);
    }
}
class CalcMain
{
    public static void main(String args[])
    {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Square sq = new Square();
        sq.calc(n);
        Circle cr = new Circle();
        cr.calc(n);
    }
}

=============================================================================

Question No: 3
reportIcon
Single File Programming Question

Write a java program to count the minimum number of front moves required to sort an array.

Your program should create an interface that declares a method. The class should implement this interface.
Input format

The first line of the input consists of an integer.

The second line of the input consists of an integer.
Output format

The output of your program should be an integer representing the minimum number of front moves required to sort the array.
Code constraints

N- integer type(Natural numbers)
Sample testcases
Input 1

5
2 3 1 4 5

Output 1

1

Input 2

7
5 6 3 2 4 1 7

Output 2

4

==========IN IAMNEO
import java.io.*; 
import java.util.Scanner; 
interface Move{
    int minmoves(int arr[], int n);
}
class Main implements Move
{ 
    public int minmoves(int arr[], int n) 
    { 
        int expectedItem = n; 
        for (int i = n - 1; i >= 0; i--) 
        { 
            if (arr[i] == expectedItem) 
                expectedItem--; 
        } 
          System.out.print(expectedItem);
        return expectedItem; 
    } 
    public static void main (String[] args)  
    { 
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Main obj=new Main();
        obj.minmoves(arr,n);
  } 
} 
  
=============================================================================
Question No: 4
reportIcon
Single File Programming Question

Write a java program that creates an abstract class called "Shape". This class should have the following methods:


abstract void rectangleArea();

abstract void squareArea();

abstract void circleArea();

Then, create a class called "Area" that extends the "Shape" class. This class should calculate and print the area of all shapes.


Finally, create a Main class that gets the inputs and passes them to the appropriate methods.


Input format

The first line of the input consists of the length and breadth.

The second line consists of the side.

The third line consists of the radius.
Output format

The output prints the area of a rectangle, square, and circle.


Sample testcases
Input 1

10 20
4
5

Output 1

200
16
78.54

Input 2

40 20
4
5

Output 2

800
16
78.54

import java.io.*;
import java.util.*;
abstract class Shape
{
 abstract void rectangleArea();
 abstract void squareArea();
 abstract void circleArea();
}

class Area extends Shape
{
    Scanner sc=new Scanner(System.in);
    void rectangleArea()
    {
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(l*b);
    }
    
    void squareArea(){
        
        int l=sc.nextInt();
        System.out.println(l*l);
    }
    
    void circleArea(){
        
        int r=sc.nextInt();
        System.out.printf("%.2f",3.14159*r*r);
    }
}

class demo{
    public static void main(String args[])
    {
        Shape s=new Area();
        s.rectangleArea();
        s.squareArea();
        s.circleArea();
    }
}

================IN IAMNEO
import java.io.*;
import java.lang.Math.*;
import java.util.*;
import java.text.*;
abstract class Shape {
    abstract void rectangleArea(int l,int b);
    abstract void squareArea(int s);
    abstract void circleArea(int r);
}
class Area extends Shape {
    public void rectangleArea(int l,int b) {
        System.out.println(l*b);
    }
    public void squareArea(int s) {
        System.out.println(s*s);
    }
    public void circleArea(int r) {
        DecimalFormat d = new DecimalFormat("0.00");
        double res = Math.PI*r*r;
        System.out.println(d.format(res));
    }
}
class Main {
    public static void main(String [] args) {
        int length,breadth,radius,side;
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        breadth = sc.nextInt();
        side = sc.nextInt();
        radius = sc.nextInt();
        Area a = new Area();
        a.rectangleArea(length,breadth);
        a.squareArea(side);
        a.circleArea(radius);
    }
}


=============================================================================
Question No: 5
reportIcon
Single File Programming Question

Write a program in Java that finds the addition, subtraction, multiplication, and division of two complex numbers using inheritance.

Your program should create an abstract class called "Complex". This class should have methods for performing arithmetic operations on complex numbers.

Then, create four child classes called "Addition", "Subtraction", "Multiplication", and "Division". These child classes should extend the "Complex" class and implement the methods for their respective operations.
Input format

Input consists of four double-type variables, which denote the real and imaginary parts of the first and second complex numbers, respectively.
Output format

The output consists of the addition, subtraction, multiplication, and division of the two complex numbers.
Sample testcases
Input 1

2 6
4 2

Output 1

Addition:
	6.0000 +8.0000 i
Subtraction:
	-2.0000 +4.0000 i
Multiplication:
	-4.0000 +28.0000 i
Division:
	1.0000 +1.0000 i

Input 2

0 0
0 0

Output 2

Addition:
	0.0000 +0.0000 i
Subtraction:
	0.0000 +0.0000 i
Multiplication:
	0.0000 +0.0000 i
Division:
	NaN NaN i

==============IN IAMNEO
import java.util.*;
import java.lang.*;
import java.io.*;
 
abstract class Complex{    
abstract float Real(float real1,float real2);    
abstract float Imaginary(float imag1,float imag2);
abstract float Real1(float real1,float real2,float imag1,float imag2);
abstract float Imaginary1(float real1,float real2,float imag1,float imag2);
}    
class Addition extends Complex{    
float Real(float real1,float real2){
    return real1+real2;
    }
    float Imaginary(float imag1,float imag2){
    return imag1+imag2;
    }
    float Imaginary1(float real1,float real2,float imag1,float imag2){return 0;}
    float Real1(float real1,float real2,float imag1,float imag2){return 0;}
}    
class Subtraction extends Complex{    
float Real(float real1,float real2){
    return real1-real2;
    }
    float Imaginary(float imag1,float imag2){
    return imag1-imag2;
    }
    float Imaginary1(float real1,float real2,float imag1,float imag2){return 0;}
    float Real1(float real1,float real2,float imag1,float imag2){return 0;}
}    
class Multiplication extends Complex{    
float Real1(float real1,float real2,float imag1,float imag2){
    return ((real1*real2)-(imag1*imag2));
    }
float Imaginary1(float real1,float real2,float imag1,float imag2){
    return ((real1*imag2)+(imag1*real2));
    }
    float Imaginary(float imag1,float imag2){return 0;}
    float Real(float real1,float real2){return 0;}
}
class Division extends Complex{    
float Real1(float real1,float real2,float imag1,float imag2){
    return (((real1*real2)+(imag1*imag2))/((real2*real2)+(imag2*imag2)));
    }
float Imaginary1(float real1,float real2,float imag1,float imag2){
    return (((imag1*real2)-(real1*imag2))/((real2*real2)+(imag2*imag2)));
    }
    float Imaginary(float imag1,float imag2){return 0;}
    float Real(float real1,float real2){return 0;}
}

   
class Main{    
    public static void main(String args[]){    
    Scanner sc =new Scanner(System.in);
    float real1=sc.nextFloat();
    float imag1=sc.nextFloat();
    float real2=sc.nextFloat();
    float imag2=sc.nextFloat();

    Complex b;  
    b=new Addition();  
    System.out.printf("Addition:\n\t%.4f",b.Real(real1,real2));
    if(b.Imaginary(imag1,imag2)>=0){System.out.print(" +");}
    else{System.out.print(" ");}
    System.out.printf("%.4f i",b.Imaginary(imag1,imag2));
    b=new Subtraction();  
    System.out.printf("\nSubtraction:\n\t%.4f",b.Real(real1,real2));
    if(b.Imaginary(imag1,imag2)>=0){System.out.print(" +");}
    else{System.out.print(" ");}
    System.out.printf("%.4f i",b.Imaginary(imag1,imag2));
    b=new Multiplication();
    System.out.printf("\nMultiplication:\n\t%.4f",b.Real1(real1,real2,imag1,imag2));
    if(b.Imaginary1(real1,real2,imag1,imag2)>=0){System.out.print(" +");}
    else{System.out.print(" ");}
    System.out.printf("%.4f i",b.Imaginary1(real1,real2,imag1,imag2));
    b=new Division();  
    System.out.printf("\nDivision:\n\t%.4f",b.Real1(real1,real2,imag1,imag2));
    if(b.Imaginary1(real1,real2,imag1,imag2)>=0){System.out.print(" +");}
    else{System.out.print(" ");}
    System.out.printf("%.4f i",b.Imaginary1(real1,real2,imag1,imag2));
}}    


=============================================================================
