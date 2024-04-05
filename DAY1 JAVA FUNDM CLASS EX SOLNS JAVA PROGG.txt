JAVA FUNDAMENTALS

DAY1
Problem 1:Single File Programming Question
Ramu and Somu are going on a picnic. Ramu packs m apples, n oranges. Somu packs m1 more apples than Ramu and n1 more oranges than Ramu.

If Somu eats x of his apples and Ramu eats y of Somu's oranges, how many apples and oranges are left in total?
Input format
•	Input consists of 6 integers m,n,m1,n1,x,y.
1.	m - corresponds to the apples brought by Ramu.
2.	n - corresponds to the oranges brought by Ramu.
3.	m1 – Apples brought by Somu.
4.	n1 – Oranges brought by Somu.
5.	x - apples ate by Somu.
6.	y – oranges ate by Ramu.
Output format
 Print two integers representing remaining apples and oranges.
Sample testcases
Input 1
4 3 2 8 3 2
Output 1
7 12

// You are using Java

import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int m1=sc.nextInt();
        int n1=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=m+m1;
        int b=n+n1;
        int app=m+a-x;
        int ora=n+b-y;
        System.out.print(app+" "+ora);
    }
}
Question No: 2
 
Single File Programming Question
Seetha was shocked after seeing her electricity bill for May month. She approached the TNEB office and asked for more details. TNEB officer explained the tariff rate and asked to calculate and check. She was not able to calculate and asked her friend to help. Her friend said it will be calculated based on the Max.unit. Help Seetha and her friend to calculate the amount.

 
Input format
The input consists of the number of units consumed.
Output format
The output displays the total amount.
Sample testcases
Input 1
121
Output 1
31.5
Input 2
567
Output 2
2172.2

// You are using Java
import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int conUnits=sc.nextInt();
        double totalAmount=0.0;
        
        if(conUnits>=1 && conUnits<=100)
        {
            totalAmount=0.0;
        }
        else if(conUnits>100 && conUnits<=200)
        {
            totalAmount=(conUnits-100)*1.5;
        }
        else if(conUnits>200 && conUnits<=500)
        {
            totalAmount=200+(conUnits-200)*3;
        }
        else if(conUnits>500 && conUnits<=9999999)
        {
            totalAmount=350+(300*4.6)+(conUnits-500)*6.6;
        }
        
        System.out.print(totalAmount);
    }
}
Question No: 3
 
Single File Programming Question
After explaining the concept of prime numbers, Seetha explained about prime factors to her students. If she tells a number, students need to tell prime factors of the given number. Help students by writing suitable code.
Input format
The input consists of a number
Output format
Prime factors separtared by sapce
Sample testcases
Input 1
12
Output 1
2 2 3
Input 2
315
Output 2
3 3 5 7

// You are using Java
import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=2;
        while(n!=1)
        {
            if(n%c==0)
            {
                System.out.print(c+" ");
                n=n/c;
            }
            else
                c++;
        }
        
    }
}
Question No: 4
 
Single File Programming Question
Seetha, a maths teacher explained Matrix addition, subtraction and multiplication in her class. She assigned a different tasks to her students.
She asked Ankit to add two matrices, Banu to subtract two matrices and Janu to multiply two matrices. Ankit, and Banu completed their task. But Janu approached Karthick to complete her task. Karthick is ready to help his friends with a program. So he asked his friend to give a square matrix only. Help Karthick to write the program that performs matrix multiplication.
Input format
Note: Square matrices only.

The first line of the input is the value of n - order of matrices.
Next input is the array elements.
Output format
The output prints the product of two matrices.
Code constraints
Only Square Matrix
Sample testcases
Input 1
3
1 2 3
4 5 6
2 3 4
1 5 4
7 4 5
6 5 7
Output 1
33 28 35 
75 70 83 
47 42 51 

// You are using Java
import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        int c[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j]=0;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                 c[i][j]=c[i][j]+(a[i][k]*b[k][j]);   
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(c[i][j] + " ");
            }
        System.out.print("\n");
        }
    }
}
Question No: 5
 
Single File Programming Question
Overloading
An ice-cream vendor sells his ice-creams in cone(radius r and height h) and ball(radius r) shaped containers. However, he is unsure of the quantity that can be filled in the two containers. You are required to write a program in java that prints the volume of the containers given its respective dimensions as input. Your class must be named ‘Icecream’ which has two methods with same name ‘Quantity’ each having the respective dimensions of the containers as the parameters. 
Method Header:
public void Quantity(int r, int h)
public void Quantity(int r)
Input format
If the quantity of the cone is to be calculated, the input must have the radius(r) and height(h) in the same line separated by a space.
For calculating the quantity of the ball, the input must have its radius(r).

Note: Input type should be integer.
Output format
The output must display the volume of the container rounded off to two decimal places for which the dimensions are given.
Sample testcases
Input 1
4 5
Output 1
82.90
Input 2
4
Output 2
267.28

import java.util.Scanner;
import java.math.*;
import java.text.DecimalFormat;
// You are using Java
class Icecream
{
        void Quantity(int r,int h)
        {
            double vol=(3.14*r*r*h*0.33);
            System.out.printf("%.2f",vol);
        }
        void Quantity(int r)
        {
            double vol1=(1.33*3.14*r*r*r);
            System.out.printf("%.2f",vol1);
        }
    }
class IcecreamMain{
    public static void main(String args[]){
        int r, h;
        Icecream ic = new Icecream();
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        if(in.hasNextInt())
        {
        h = in.nextInt();
        ic.Quantity(r,h);
        }
       else
        ic.Quantity(r);
    }
}
