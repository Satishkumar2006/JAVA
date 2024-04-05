MULTI THREADING
Question No: 1
 
Single File Programming Question
Stall Revenue
 
The Accounting department of the fair committee wants an console application that can estimate the total revenue by rent from an exhibition. So write a program that accepts the stall details of an exhibition that includes the stallArea which is used for computing the stallCost. Using threads, calculate the stallCost of each stalls and in the main method, print the consolidated data.
 
Create a class Stall which implements Runnable interface with the following private attributes,
Create default constructor and a parameterized constructor with arguments in order Stall(String stallName, String details, Double stallArea, String owner). Create appropriate getters and setters.
Override the following methods in the Stall class,
 
Get the number of stalls and stall details and calculate the total revenue of all the stalls. Calculate the stall cost for each stall, each cost will be calculated by seperate thread.
Create a driver class Main to test the above requirements.
Ignore Output Line Order
Input format
First line of the input consist of the number of inputs to be given
Next input is the stall details
Refer sample input
Output format
Output prints the stall cost of each stall
Refer sample output
Sample testcases
Input 1
3
Book stall
Stall for books
25
John
Food stall
Stall for foods
60
Peter
Snack stall
Stall for snack
30
Adam
Output 1
3750.0
4500.0
9000.0
Whitelist
Set 1:
run()

// You are using Java
import java.util.*;
class Stall implements Runnable
{
        private String stallName;
        private String details;
        private double stallArea;
        private String owner;
        private double stallCost;
    Stall()
    {
        stallName=null;
        details=null;
        stallArea=0.0;
        owner=null;
        stallCost=0.0;
        
    }
        
    Stall(String stallName, String details,Double stallArea,String owner)
    {
        this.stallName=stallName;
        this.details=details;
        this.stallArea=stallArea;
        this.owner=owner;
    }
    public void run()
    {
        this.stallCost=stallArea*150.0;
        System.out.println(this.stallCost);
    }
}

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String sName,details,owner;
        double sArea,sCost;
        Stall s[]=new Stall[n];
        Thread t[]=new Thread[n];
        for(int i=0;i<n;i++)
        {
            sName=sc.nextLine();
            details=sc.nextLine();
            sArea=sc.nextDouble();
            sc.nextLine();
            owner=sc.nextLine();
            s[i]=new Stall(sName,details,sArea,owner);
            t[i]=new Thread(s[i]);
            t[i].start();
        }
    }
}
Question No: 2
 
Single File Programming Question
Profit or Loss
Now we are going to create a console application that can estimate whether the booking is a profit or loss, thereby enabling hall owners to reduce or increase expenses depending on the status. Hence if the several Booking details are given, compute whether the bookings are profitable or not. Use Threads to compute for each booking, Finally display the profit/loss status.
Create a class HallBooking which implements Runnable interface with following private attributes.
 
Include appropriate getters and setters.
Create default constructor and a parameterized constructor with arguments in order HallBooking(String hallName, Double cost, Integer hallCapacity,Integer seatsBooked).
Override run() method which display the status (i.e) Profit or Loss.If SeatsBooked*100 > cost then it is a profit else loss .
Create a driver class Main. The status for each hall is calculated by separate threads. The Threads print the status of the events. 
Ignore output line order
Input format
The first line of input corresponds to the number of events 'n'.
Next input is the hall details.
Refer sample input for formatting specifications.
Output format
The output consists of the status of the events. (Profit or Loss).
Refer sample output for formatting specifications.
Sample testcases
Input 1
4
Le Meridian
12000
400
250
MS mahal
500000
1000
400
Ramans
10000
600
300
Rizzodous
30000
1200
1000
Output 1
Profit
Loss
Profit
Profit
Whitelist
Set 1:
public void run()

// You are using Java
import java.util.*;
class HallBooking implements Runnable
{
    private String hallName;
    private double cost;
    private int hallCapacity;
    private int seatsBooked;
    
    HallBooking()
    {
        hallName=null;
        cost=0.0;
        hallCapacity=0;
        seatsBooked=0;
    }
    
    HallBooking(String hallName,double cost,int hallCapacity,int seatsBooked)
    {
        this.hallName=hallName;
        this.cost=cost;
        this.hallCapacity=hallCapacity;
        this.seatsBooked=seatsBooked;
    }
    
    public void run()
    {
        if(this.seatsBooked*100>this.cost)
        {
            System.out.println("Profit");
        }
        else
        {
            System.out.println("Loss");
        }
    }
    
}

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String hallname;
        double cost;
        int capacity,seats;
        HallBooking h[]=new HallBooking[n];
        Thread t[]=new Thread[n];
        for(int i=0;i<n;i++)
        {
            hallname=sc.nextLine();
            cost=sc.nextDouble();
            capacity=sc.nextInt();
            seats=sc.nextInt();
            if(i!=n-1)
            {
                sc.nextLine();
            }
            h[i]=new HallBooking(hallname,cost,capacity,seats);
            t[i]=new Thread(h[i]);
            t[i].start();
        }
    }
}
Question No: 3
 
Single File Programming Question
Write a program that starts two threads marked “even” and “odd”. The threads cooperate to print the numbers from 1 to 20 in sequence with the “even” thread printing only even numbers and odd the thread printing only odd numbers.
Ignore output line order.
Input format
No console input.
Output format
The numbers from 1 to 20 are printed in sequence
alternatively by the odd and even threads with the
even thread printing only even numbers and the odd
thread printing only odd numbers.
Sample testcases
Input 1
Output 1
Thread Odd: 1
Thread even: 2
Thread Odd: 3
Thread even: 4
Thread Odd: 5
Thread even: 6
Thread Odd: 7
Thread even: 8
Thread Odd: 9
Thread even: 10
Thread Odd: 11
Thread even: 12
Thread Odd: 13
Thread even: 14
Thread Odd: 15
Thread even: 16
Thread Odd: 17
Thread even: 18
Thread Odd: 19
Thread even: 20

// You are using Java
import java.util.*;
class Even implements Runnable
{
    public void run()
    {
        for(int i=2;i<=20;i=i+2)
        {
            System.out.println("Thread even: "+i);
        }
    }
}
class Odd implements Runnable
{
    public void run()
    {
        for(int i=1;i<=20;i=i+2)
        {
            System.out.println("Thread Odd: "+i);
        }
    }
}

class Demo
{
    public static void main(String[] args)
    {
     Even e=new Even();
     Odd o=new Odd();
     Thread t1=new Thread(e);
     Thread t2=new Thread(o);
     t1.start();
     t2.start();
    }
}
