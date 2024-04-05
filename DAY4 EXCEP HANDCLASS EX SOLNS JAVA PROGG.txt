EXCEPTION HANDLING
DAY 4
Question No: 1
 
Single File Programming Question
Divide by zero exception.
Write a program to obtain two numbers and print their quotient. In case of exception print the same.
Input format
Given a single line input separated by space.Get the Integer N1 and N2
Output format
Display the quotient if there is no exception, else print the Exception,
Code constraints
Integers only.
Sample testcases
Input 1
44 2
Output 1
22
Input 2
2 0
Output 2
java.lang.ArithmeticException: / by zero
Whitelist
Set 1:
try
Set 2:
catch
Set 3:
Exception
ArithmeticException
// You are using Java
import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        try
        {
            int res=x/y;
            System.out.println(res);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
Question No: 2
 
Single File Programming Question
NullPointerException
Another prominent exception is NullPointerException. It occurs when you try to access a null value. Assign the null value to a string and obtain an index position and try to access it. Print the exception.
Input format
Input consists of an integer.
Output format
Output prints the null pointer exception.
Sample testcases
Input 1
9
Output 1
null
java.lang.NullPointerException
Whitelist
Set 1:
try
catch

// You are using Java
import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        String s=null;
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        try
        {
            System.out.println("null");
            System.out.println(s.charAt(x-1));
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
    }
}
Question No: 3
 
Single File Programming Question
Input Mismatch Exception
Input Mismatch exception occurs when an input of a different datatype is given other than the required. In common practice, it occurs when a String or double datatype is given for an int datatype. Let's handle this exception for practice. Obtain int type input from the user using the Scanner class. Display the obtained input if no exception occurs. If an exception occurs, prompt the user as specified in Sample I/O.

Create a driver class called Main. In the Main method, obtain integer input from the user and perform actions as specified above
Input format
Input consists of a string.
Output format
Output prints the given input otherwise throws InputMismatchException.
Sample testcases
Input 1
hello
Output 1
java.util.InputMismatchException
Input 2
9
Output 2
9
Whitelist
Set 1:
InputMismatchException
Set 2:
try
catch

// You are using Java
import java.util.*;
class main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        try
        {
            n=sc.nextInt();
            System.out.println(n);
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
    }
}
Question No: 4
 
Single File Programming Question
Write a program to validate the email address and display suitable exceptions if there is any mistake.

Create 3 custom exceptions class as below
1.	DotException
2.	AtTheRateException
3.	DomainException

A typical email address should have a " . " character, "@" character and also the domain name should be valid. Valid domain names for practice be 'in', 'com', 'net' or 'biz'. 

Display Invalid Dot usage, Invalid @ usage, or Invalid Domain message based on email id.

Get the email address from the user, validate the email by checking the above-mentioned criteria, and print the validity status of the input email address.
Input format
The input contains the email to be validated
Output format
Print Valid email address or Invalid email address along with the suitable exception.
Sample testcases
Input 1
sample@gmail.com
Output 1
Valid email address
Input 2
sample@gmail.com.
Output 2
DotException: Invalid Dot usage
Invalid email address
Whitelist
Set 1:
DomainException
DotException
AtTheRateException

// You are using Java

import java.io.*;
import java.util.*;
class Demo
{
    public static int flag=0;
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    DotException de=new DotException();
    AtTheRateException ae=new AtTheRateException();
    DomainException doe=new DomainException();
    
    try
    {
        de.validateDotException(str);
        ae.validateAtTheRateException(str);
        doe.validateDomainException(str);
        System.out.println("Valid email address");
        
    }
    catch(DotException e)
    {
        System.out.println("DotException: Invalid Dot usage");
        System.out.println("Invalid email address");
    }
   
    catch(AtTheRateException e)
    {
        System.out.println("AtTheRateException: Invalid @ usage");
        System.out.println("Invalid email address");
    }
    
    catch(DomainException e)
    {
        System.out.println("DomainException: Invalid Domain");
        System.out.println("Invalid email address");
    }
}
}
class DotException extends Exception
{
    int count=0;
    void validateDotException(String str) throws DotException
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='.')
            {
                count++;
            }
        }
            if(count!=1)    
            throw new DotException();
    }
}
class AtTheRateException extends Exception
{
    int count=0;
    void validateAtTheRateException(String str) throws AtTheRateException
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='@')
            {
                count++;
            }
        }
        if(count!=1)
            throw new AtTheRateException();
    }
}
class DomainException extends Exception
{
    void validateDomainException(String str) throws DomainException
    {
        
        String s[]={"in","com","net","biz"};
        int count=0;
        for(String a:s)
        {
         if(str.contains(a))
         {
             count++;
         }
        }
        if(count==0)
        {
        throw new DomainException();
        }
            
        }
    
}
Question No: 5
 
Single File Programming Question
Write a program to read the Register Number and Mobile Number of a student. Create user-defined exceptions and handle the following: 

1.	If the Register Number does not contain exactly 9 characters in the specified format(2 numbers followed by 3 characters followed by 4 numbers) or if the Mobile Number does not contain exactly 10 characters, throw an IllegalArgumentException. 
2.	If the Mobile Number contains any character other than a digit, raise a NumberFormatException.
3.	If the Register Number contains any character other than digits and alphabets, throw a NoSuchElementException.
4.	If they are valid, print the message ‘Valid’ else ‘Invalid’.
Input format
Register the number as a string in the first line
Mobile number as a string in the second line
Output format
Valid or Invalid with the exception message

Refer to sample outputs for format and exact text.
Sample testcases
Input 1
19ABC1001
9949596920
Output 1
Valid
Input 2
19ABC1001
99495969209
Output 2
Invalid
java.lang.IllegalArgumentException: Mobile Number does not contain exactly 10 characters
Input 3
19ABC10019
9949596920
Output 3
Invalid
java.lang.IllegalArgumentException: Register Number does not contain exactly 9 characters
Input 4
195AC1001
9949596920
Output 4
Invalid
java.util.NoSuchElementException: Registration Number cannot contain any character other than digits and alphabets in format specified
Input 5
19ABC1001
994C596920
Output 5
Invalid
java.lang.NumberFormatException: Mobile Number cannot contain any character ot
// You are using Java
import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char c[]=s1.toCharArray();
        char c1[]=s2.toCharArray();
        try
        {
            if(s1.length()!=9)
                throw new IllegalArgumentException("Register Number does not contain exactly 9 characters");
            if(s2.length()!=10)
                throw new IllegalArgumentException("Mobile Number does not contain exactly 10 characters");
            for(char i:c1)
            {
                if(!Character.isDigit(i))
                    throw new NumberFormatException("Mobile Number cannot contain any character other than a digit");
            }
            NoSuchElementException nse=new NoSuchElementException();
            nse.validate(s1);
            System.out.println("Valid");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid");
            System.out.println(e);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Invalid");
            System.out.println(e);
        }
        catch(NoSuchElementException e)
        {
            System.out.println("Invalid");
            System.out.println("java.util.NoSuchElementException: Registration Number cannot contain any character other than digits and alphabets in format specified");
        }
        
}
}
class NoSuchElementException extends Exception
{
    void validate(String s) throws NoSuchElementException
    {
        char[] c=s.toCharArray();
        
              if((!Character.isDigit(c[0]))||
               (!Character.isDigit(c[1]))||
               (Character.isDigit(c[2]))||
               (Character.isDigit(c[3]))||
               (Character.isDigit(c[4]))||
               (!Character.isDigit(c[5]))||
               (!Character.isDigit(c[6]))||
               (!Character.isDigit(c[7]))||
               (!Character.isDigit(c[8])))
               {
            throw new NoSuchElementException();
                             }
        for(char i:c)
        {
            if(!Character.isLetterOrDigit(i))
            {
                       throw new NoSuchElementException();
            }
        }
    }
}
