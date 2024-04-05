IO STREAM
RMK_Java_D6_IOStreams_CE_COD

Question No: 1
reportIcon
Single File Programming Question

The Minimum Element in an Array

Write a Java program that takes input an integer n, and an array of n integers, writes the array to a file named "output.txt", reads the file and finds the minimum integer in the array

File: output.txt
Input format

The first line consists of the value of n.

The next input is the array elements.
Output format

The output prints the minimum element in the array.
Sample testcases
Input 1

5
84 52 12 35 96

Output 1

12

Input 2

9
12 45 33 44 55 12 76 2 3

Output 2


import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.IOException; 
 class CreateFile 
{ 
    public static void main(String[] args) throws IOException 
    { 
          
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] arr = new int[n];
        int i;
        for(i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        FileWriter fw=new FileWriter("output.txt"); 
  
         
        for (i = 0; i < n; i++) 
            fw.write(arr[i]); 
        fw.close(); 
        
        
        FileReader fr=null; 
        try
        { 
            fr = new FileReader("output.txt"); 
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
        } 
  
        int ch,sum=0;
        int min = 2147483647;
        while ((ch=fr.read())!=-1)  {
            if((int)ch <min) 
                min = (int)ch;
        }
        System.out.println(min);
       
        fr.close();
    } 
    
}

=========================================================================
Question No: 2
reportIcon
Single File Programming Question

Count Uppercase and Lowercase Letters

Obtain a string and write it into a file. Read the file contents and print the number of upper- and lower-case letters present in the file.
Input format

The input consists of a string.
Output format

The output prints the number of upper- and lower-case letters.

Refer to the sample output for formatting specifications.
Sample testcases
Input 1

Welcome to PS!!!

Output 1

3
8


import java.io.*;
import java.util.*;
class Sample {
   public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        FileWriter fw=new FileWriter("output.txt"); 
        
        String ch;
        int upper=0,lower=0,number=0,special=0;
          
        String s=sc.nextLine();
        
          fw.write(s);
          fw.close();
          
          FileReader fr=null; 
            try
            { 
                fr = new FileReader("output.txt"); 
            } 
            catch (FileNotFoundException fe) 
            { 
                System.out.println("File not found"); 
            } 
            
            Integer i=fr.read();
            Integer eof=-1;
          ch=i.toString();
          while (ch.charAt(0)!=eof.toString().charAt(0))  { 
               
            if (Integer.parseInt(ch) >= 'A' && Integer.parseInt(ch) <= 'Z')
                upper++;
            else if (Integer.parseInt(ch) >= 'a' && Integer.parseInt(ch) <= 'z')
                lower++;
            
            i=fr.read();
            ch=i.toString();
            }
     
     
      System.out.println(upper);
      System.out.println(lower);

   }
}
==========================================================================
Question No: 3
reportIcon
Single File Programming Question

Write a Java program that uses Serialization to serialize and deserialize a simple object. The program should prompt the user to enter the values of the object's fields, serialize the object to a file, deserialize the object from the file, and print the object's fields to the console.
Input format

First line consist of an Integer

Second line consist of an Integer
Output format

Output should serialize the object to file and display the deserialized object:
Sample testcases
Input 1

5
12

Output 1

Object serialized to file: serialized_object.ser
Deserialized object:
Field 1: 5
Field 2: 12

Input 2

10
100

Output 2

Object serialized to file: serialized_object.ser
Deserialized object:
Field 1: 10
Field 2: 100

Fill your code here
Java (11)
theme
instruction




import java.io.*;

class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Prompt the user to enter the values of the object's fields
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int field1 = Integer.parseInt(reader.readLine());
        String field2 = reader.readLine();
        
        // Create the object and serialize it to a file
        MyObject obj = new MyObject(field1, field2);
        FileOutputStream fileOut = new FileOutputStream("serialized_object.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(obj);
        out.close();
        fileOut.close();
        
        System.out.println("Object serialized to file: serialized_object.ser");
        
        // Deserialize the object from the file and print its fields to the console
        FileInputStream fileIn = new FileInputStream("serialized_object.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        MyObject obj2 = (MyObject) in.readObject();
        in.close();
        fileIn.close();
        
        System.out.println("Deserialized object:");
        System.out.println("Field 1: " + obj2.getField1());
        System.out.println("Field 2: " + obj2.getField2());
    }
}

class MyObject implements Serializable {
    private int field1;
    private String field2;
    
    public MyObject(int field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }
    
    public int getField1() {
        return field1;
    }
    
    public String getField2() {
        return field2;
    }
}
==========================================================================
Question No: 4
reportIcon
Single File Programming Question

Write a Java program to write n integer numbers to a file using RandomAccessFile, then read the file and print out all even numbers found in the file.

Filename:numbers.txt
Input format

The First Line Consists of an Integer
Output format

The Output should Display the even numbers in the file
Sample testcases
Input 1

10

Output 1

2 4 6 8 10 

Input 2

20

Output 2

2 4 6 8 10 12 14 16 18 20 


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Writing n numbers to the file
            RandomAccessFile raf = new RandomAccessFile("numbers.txt", "rw");
            Scanner sc =new Scanner(System.in);
            int n = sc.nextInt(); // number of integers to write
            for (int i = 1; i <= n; i++) {
                raf.writeInt(i);
            }
            raf.close();

            // Finding even numbers in the file
            RandomAccessFile raf2 = new RandomAccessFile("numbers.txt", "r");
            long fileSize = raf2.length();
            int numInts = (int) fileSize / 4; // each int is 4 bytes

            for (int i = 0; i < numInts; i++) {
                int num = raf2.readInt();
                if (num % 2 == 0) {
                    System.out.print(num+" ");
                }
            }

            raf2.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


==========================================================================
Question No: 5
reportIcon
Single File Programming Question

Write a Java program to create a binary file with employee records containing employee id, name, and salary. Allow the user to add and display records in the file.

Filename: "employee.dat"

Method name: addEmployee(),displayAllEmployees();

     
Input format

The First Line consists of an integer

The next line consists of String

The Third Line consists of a Double
Output format

The Output Should display the Employee Records
Sample testcases
Input 1

101
Tony
100000

Output 1

Employee ID: 101
Name: Tony
Salary: 100000.0

Input 2

105
Elon
150000

Output 2

Employee ID: 105
Name: Elon
Salary: 150000.0



import java.io.*;
import java.util.Scanner;

class EmployeeFile {
    static final int RECORD_SIZE = 32;
    static final String FILE_NAME = "employee.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (RandomAccessFile file = new RandomAccessFile(FILE_NAME, "rw")) {
          
addEmployee(file);
displayAllEmployees(file);
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


private static void addEmployee(RandomAccessFile file) throws IOException {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter employee id: ");
        int id = sc.nextInt();
        //System.out.print("Enter employee name: ");
        String name = sc.next();
        //System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        file.seek(file.length());
        file.writeInt(id);
        file.writeUTF(name);
        file.writeDouble(salary);
    }
    private static void displayAllEmployees(RandomAccessFile file) throws IOException {
        file.seek(0);
        while (file.getFilePointer() < file.length()) {
            int id = file.readInt();
            String name = file.readUTF();
            double salary = file.readDouble();
            System.out.println("Employee ID: " + id + "\nName: " + name + "\nSalary: " + salary + "\n");
        }
    }
}
   
=========================================================================