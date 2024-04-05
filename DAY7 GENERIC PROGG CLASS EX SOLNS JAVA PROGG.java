GENERIC PROGRAMMING
Question No: 1
reportIcon
Single File Programming Question

Write a program that implements a generic interface to compare two objects of float data type. The program should take two arguments and return true if the first argument is greater than the second argument. The output should be either True if the first value is greater or false if the first value is lesser than the second.


Note: If both the values are same, display false.


Input format

First line - any data format

Second line - any data format
Output format

Displays either true or false
Sample testcases
Input 1

12
2

Output 1

true

Input 2

50.0
50.0

Output 2

false

// You are using Java
import java.util.*;
interface CompareObjects<T>
{
    boolean compare(T a, T b);
}
class Demo<T extends Float> implements CompareObjects<T>     
{
    public boolean compare(T a,T b)
    {
        if(a>b)
            return true;
        else
            return false;
    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float f1=sc.nextFloat();
        float f2=sc.nextFloat();
        Demo<Float> d1=new Demo<Float>();
        System.out.println(d1.compare(f1,f2));
    }
}

========IMNEO SOLUTION
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericCompare<Float> floatCompare = new GenericCompare<>();

        if (scanner.hasNextFloat()) {
            float a = scanner.nextFloat();
            if (scanner.hasNextFloat()) {
                
                float b = scanner.nextFloat();
                boolean result = floatCompare.greaterThan(a, b);
                System.out.println(result);
            } else {
                System.out.println("True");
            }
        } else {
            System.out.println("False");
        }
    }
}

interface Compare<T> {
    boolean greaterThan(T a, T b);
}

class GenericCompare<T extends Float> implements Compare<T> {
    public boolean greaterThan(T a, T b) {
        return a > b;
    }
}

==================================================
Question No: 2
reportIcon
Single File Programming Question

Write a generic interface called "Transformer" that takes two type parameters, S and T. It should declare a single method called "transform" that takes an argument of type S and returns an object of type T.


Implement the interface for a transformer that takes a String as input and returns an Integer by converting the length of the string to an integer
Input format

First line gets the input from the user as string
Output format

Outputs the length of the string
Sample testcases
Input 1

Tony Stark

Output 1

10

Input 2

Mahendra Singh Dhoni

Output 2

20

import java.util.*;
interface Transformer<S, T>
{
    T transform(S str);
}
public class Main implements Transformer<String, Integer>
{
    public Integer transform(String str)
    {
        return str.length();
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Main m=new Main();
        System.out.println(m.transform(s));
    }
}

=====IMNEO SOLUTION
import java.util.Scanner;

interface Transformer<S, T> {
    T transform(S input);
}

public class Main implements Transformer<String, Integer> {

    @Override
    public Integer transform(String input) {
        return input.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main transformer = new Main();

        String input = scanner.nextLine();

        Integer output = transformer.transform(input);
        System.out.println(output);

        scanner.close();
    }
}

========================================================
Question No: 3
reportIcon
Single File Programming Question

sort() a List of Objects

Write a program to take hall objects as input in the list and sort them in the order of their costPerDay using sort() method of comparable interface. Then display them in tabular form.

Create a class Hall with the following attributes,

name String
contactNumber String
costPerDay    Double
ownerName     String

Mark the attributes as private and add appropriate getter/setter, default and parameterized constructor. Override toString() and print the details in a tabular format.And implement comparable interface in the class.

Create driver class Main and use the main method to get inputs, sort and display.

Note: Use "%-15s%-15s%-15s%-15s" to display the hall details in tabular form.
Input format

The first line has number of halls n.

The next n lines have details of hall 
Output format

Output displays the hall details

Refer sample output
Sample testcases
Input 1

3
SDH hall
12345
12000.0
Jane           
XUV hall
24680
15000.0
Jack           
SRT hall
13579
20000.0
John   

// You are using Java
import java.util.*;
/*interface Comparable
{
    void toString();
}*/
class Hall implements Comparable<Hall>
{
    private String name;
    private String contactNumber;
    private double costPerDay;
    private String ownerName;
    Hall()
    {
        name=null;
        contactNumber=null;
        costPerDay=0.0;
        ownerName=null;
    }
    Hall(String name,String contactNumber,double costPerDay,String ownerName)
    {
        this.name=name;
        this.contactNumber=contactNumber;
        this.costPerDay=costPerDay;
        this.ownerName=ownerName;
    }
    

    public int compareTo(Hall h)
    {
        if(costPerDay==h.costPerDay)
            return 0;
        if(costPerDay>h.costPerDay)
            return 1;
        else 
            return -1;
    }
    
    public String toString()
    {
        return (this.name+" "+this.contactNumber+" "+this.costPerDay+" "+this.ownerName);
        //String s1=String.format("%15s%15s%15s%15s",name,contactNumber,costPerDay,ownerName);
        //return s1;
        
    }
}

class Main
{
    public static void main(String[] args)
    {
        List<Hall> l=new ArrayList<Hall>();
       // Hall h[]=new Hall[n];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s,num;
        double cost;
        String owner;
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
          s=sc.nextLine();
            num=sc.nextLine();
          //  sc.nextLine();
            cost=sc.nextDouble();
            sc.nextLine();
            owner=sc.nextLine();
            //h[i]=new Hall(s[i],num[i],cost[i],owner[i]);
            l.add(new Hall(s,num,cost,owner));
        }
        Collections.sort(l);
        for(Hall h:l)
        {
            System.out.println(h);
        }
        
    }
}

=================in Iamneo 
import java.io.*;
import java.util.*;
class Hall implements Comparable<Hall> {
	public Hall(String name, String contactNumber, double costPerDay, String ownerName) {
		this.name = name;
		this.contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}
	public Hall() {
		this.name = null;
		this.contactNumber = null;
		this.costPerDay = 0;
		this.ownerName = null;
	}

	private String name;
	private String contactNumber;
	private double costPerDay;
	private String ownerName;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	@Override
	public int compareTo(Hall h) {
	
		return Double.compare(this.costPerDay,h.costPerDay );
	}
	public String toString() {
		return name+" "+contactNumber+" "+costPerDay+" "+ownerName;
	}
}
class Main {
public static void main(String [] args) {
	int i,n;
	Scanner sc = new Scanner(System.in);
	n = Integer.parseInt(sc.nextLine());
	Hall [] h = new Hall[n];
	ArrayList<Hall> halls = new ArrayList<Hall>(n);
	for(i=0;i<n;i++) {
		h[i] = new Hall();
		h[i].setName(sc.nextLine());
		h[i].setContactNumber(sc.nextLine());
		h[i].setCostPerDay(Double.parseDouble(sc.nextLine()));
		h[i].setOwnerName(sc.nextLine());
		halls.add(h[i]);
	}
	Collections.sort(halls);
	for(i=0;i<n;i++) {
		System.out.println(halls.get(i));
	}
}
}
=========================================================================
Question No:4
g Question

Imagine you're a math teacher at a high school, and you want to create a program that can calculate the length of the hypotenuse of a right-angled triangle. You decide to write a Java program that prompts the user to input the lengths of the two shorter sides of the triangle, and then calculates and displays the length of the hypotenuse. To make the program more flexible, you want to use a generic class that can handle any two numerical data types as inputs.
Input format

The first decimal number represents the length of the first side of a right-angled triangle,

and the second decimal number represents the length of the second side of the same triangle.
Output format

The output consists of displays the length of the hypotenuse of the right-angled triangle
Sample testcases
Input 1

3.0
4.0

Output 1

The length of the hypotenuse of the triangle is: 5.0

Input 2

-2.0
5.0

Output 2

The length of the hypotenuse of the triangle is: 5.385164807134504

Fill your code here 


// You are using Java
import java.util.*;
class Hypotenuse<T extends Number,S extends Number>
{
    T a;
    S b;
    void setData(T x, S y)
    {
        a=x;
        b=y;
    }
    
    void calculate()
    {
        double c=(a.doubleValue()*a.doubleValue())+(b.doubleValue()*b.doubleValue());
        double d=Math.sqrt(c);
        System.out.println("The length of the hypotenuse of the triangle is: "+d);
    }
}

class main
{
    public static void main(String[] args)
    {
        Hypotenuse<Double,Double> h1=new Hypotenuse<Double,Double>();
        Scanner sc=new Scanner(System.in);
        double f1=sc.nextDouble();
        double f2=sc.nextDouble();
        h1.setData(f1,f2);
        h1.calculate();
    }
}
=======================in Imneo
import java.util.Scanner;

public class Main<T extends Number, U extends Number> {
  private T first;
  private U second;

  public Main(T first, U second) {
    this.first = first;
    this.second = second;
  }

  public T getFirst() {
    return first;
  }

  public U getSecond() {
    return second;
  }

  public void setFirst(T first) {
    this.first = first;
  }

  public void setSecond(U second) {
    this.second = second;
  }

  public double calculateHypotenuse() {
    double a = first.doubleValue();
    double b = second.doubleValue();
    return Math.sqrt(a * a + b * b);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    
    double side1 = scanner.nextDouble();

    
    double side2 = scanner.nextDouble();

    Main<Double, Double> Main = new Main<>(side1, side2);

    double hypotenuse = Main.calculateHypotenuse();

    System.out.println("The length of the hypotenuse of the triangle is: " + hypotenuse);
  }
}
========================================================
Question No: 5
reportIcon
Single File Programming Question

Emily is a software developer working on a project that requires her to process string and integer data using type-safe generics in Java. She needs to write a program that takes input from the user at runtime and performs some tasks on the data without displaying the input. Emily decides to create a class called TypeSafeGenericsExample that has methods for adding data, getting data at a specific index, and processing the data for both strings and integers. Can you help Emily by modifying her program to take user input at runtime, store the input in the data list, and then perform some tasks on the data based on its type?
Input format

The input consists of a string until press q and

The second line of input consists of an integer until press q
Output format

The output should display the vowels in the given string

and the sum and the average of an integer data
Sample testcases
Input 1

Hello World
java
q
42
89
q

Output 1

Total number of vowels in string data: 5
Sum of integer data: 131
Average of integer data: 65.5

Input 2

Welcome to
java 
python
q
85
96
32
q

Output 2

Total number of vowels in string data: 7
Sum of integer data: 213
Average of integer data: 71.0

// You are using Java
import java.util.*;

class TypeSafeGenericsExample
{
    public static void main(String[] args)
    {
        List<String> l=new ArrayList<String>();
        List<Integer> i=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        String s="";
        int x;
        while(true)
        {
           s=sc.nextLine();
           if(!(s.equals("q")))
                l.add(s);
            else
                break;
        }
        while(true)
        {
           s=sc.next();
           if(!(s.equals("q")))
                i.add(Integer.parseInt(s));
            else
                break;
        }
        TypeSafeGenericsExample t=new TypeSafeGenericsExample();
        t.vowelCount(l);
        t.calculate(i);
    }
        void vowelCount(List<String> a)
        {
            int count=0;
            for(String str:a)
            {
                for(int i=0;i<str.length();i++)
                {
                if((str.charAt(i)=='a')||
                (str.charAt(i)=='e')||
                (str.charAt(i)=='i')||
                (str.charAt(i)=='o')||
                (str.charAt(i)=='u'))
                    //System.out.println(str.charAt(i));
                    count++;
                }
            }
            System.out.println("Total number of vowels in string data: "+count);
        }
        void calculate(List<Integer> x)
        {
            int sum=0;
            int count=0;
            for(int element:x)
            {
                sum=sum+element;
                count++;
            }
            double avg=0.0;
            avg=(double)sum/count;
            System.out.println("Sum of integer data: "+sum);
            System.out.println("Average of integer data: "+avg);
        }
    }
============================================
import java.util.ArrayList;
import java.util.Scanner;

public class Main<T> {
    private ArrayList<T> data;

    public Main() {
        data = new ArrayList<>();
    }

    public void addData(T item) {
        data.add(item);
    }

    public T getData(int index) {
        return data.get(index);
    }

    public void processStringData() {
        // do some task on string data, e.g. count number of vowels
        int vowelCount = 0;
        for (int i = 0; i < data.size(); i++) {
            String s = (String) data.get(i);
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                }
            }
        }
        System.out.println("Total number of vowels in string data: " + vowelCount);
    }

    public void processIntegerData() {
        // do some task on integer data, e.g. compute sum and average
        int sum = 0;
        for (int i = 0; i < data.size(); i++) {
            Integer n = (Integer) data.get(i);
            sum += n;
        }
        double average = (double) sum / data.size();
        System.out.println("Sum of integer data: " + sum);
        System.out.println("Average of integer data: " + average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Main<String> stringList = new Main<>();
               String input = scanner.nextLine();
        while (!input.equals("q")) {
            stringList.addData(input);
                       input = scanner.nextLine();
        }

        Main<Integer> intList = new Main<>();
       
        input = scanner.nextLine();
        while (!input.equals("q")) {
            intList.addData(Integer.parseInt(input));
            
            input = scanner.nextLine();
        }

        stringList.processStringData();
        intList.processIntegerData();
    }
}

========================================================