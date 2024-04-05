Q1.
import java.util.Scanner;
class Main {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String title =sc.nextLine();
String author =sc.nextLine();
int price = sc.nextInt();

Book book = new MyBook(title, author, price);
book.display();
}
}
abstract class Book {
String title;
String author;

Book(String title, String author) {
this.title = title;
this.author = author;
}

abstract void display();
}
class MyBook extends Book
{
int price;
MyBook(String title,String author,int price)
{
super(title,author);
this.price=price;
}

void display()
{
System.out.println("Title: "+title);
System.out.println("Author: "+author);
System.out.println("Price: "+price);

}
}
Q2.
import java.util.Scanner;

class Vehicle {
protected String type;

public Vehicle(String type) {
this.type = type;
}

public void displayType() {
System.out.println("Type: " + type);
}
}

class Car extends Vehicle {
private String brand;

public Car(String type, String brand) {
super(type);
this.brand = brand;
}

public void displayBrand() {
System.out.println("Brand: " + brand);
}
}

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


String type = scanner.nextLine();


String brand = scanner.nextLine();

Car car = new Car(type, brand);

car.displayType();
car.displayBrand();

scanner.close();
}
}
Q3.
import java.util.Scanner;
class Employee
{
public int empId;
public float slry;

public Employee(int empId, float slry)
{
this.empId = empId;
this.slry = slry;
}
public String toString()
{
return (empId + "\n" + slry);
}
}
class empLevel extends Employee
{
public int level;
public empLevel(int empId, float slry)
{
super(empId, slry);
if (slry>100)
level = 1;
else
level = 2;
}
public String toString()
{
return (super.toString() + "\n" + level);
}
}
class empMain
{
public static void main(String args[])
{
int emplId;
float slry;
Scanner in = new Scanner(System.in);
emplId = in.nextInt();
slry = in.nextFloat();
empLevel el = new empLevel(emplId,slry);
System.out.println(el.toString());
}
}
Q4.
import java.util.*;
class Account
{
int acnum;
int bal;
Account(int acnum,int bal)
{
this.acnum=acnum;
this.bal=bal;
}
}
class user extends Account
{
String name;
user(int acnum,int bal,String name)
{
super(acnum,bal);
this.name=name;
}
}
class Main{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
user[] u= new user[n];
for(int i=0;i<n;i++){
int acnum=sc.nextInt();
int bal=sc.nextInt();
sc.nextLine();
String un=sc.nextLine();
u[i] = new user(acnum,bal,un);
}
int flag=0;
int acc=sc.nextInt();
for(int i=0;i<n;i++)
{
if(acc==u[i].acnum)
{
flag=1;
System.out.println(u[i].bal);
break;
}
}
if(flag==0)
{
System.out.println("Account Number does not exist");
}
}
}
Q5.
import java.util.*;
class Employee{
private int eId;
private String eName;
private int eSalary;
public static String companyName="ABC Corp";
public int geteId(){
return eId;
}
public String geteName(){
return eName;
}

public int geteSalary(){
return eSalary;
}

public void seteId(int newValue){
eId = newValue;
}

public void seteName(String newValue){
eName = newValue;
}

public void seteSalary(int newValue){
eSalary = newValue;
}
}
class Main{
public static void main(String args[])throws Exception{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Employee[] obj= new Employee[n];
for(int i=0;i<n;i++){
obj[i] = new Employee();
String name=sc.next();
int id=sc.nextInt();
int salary=sc.nextInt();
obj[i].seteName(name);
obj[i].seteId(id);
obj[i].seteSalary(salary);
}
// Employee.companyName=sc.next();
for(int i=0;i<n;i++){
System.out.println("Employee Name: " + obj[i].geteName());
System.out.println("Employee ID: " + obj[i].geteId());
System.out.println("Employee Salary: " + obj[i].geteSalary());
System.out.println("Employee Company Name: " + Employee.companyName);
}
Employee.companyName=sc.next();
System.out.println("Updated Details");
for(int i=0;i<n;i++){
System.out.println("Employee Name: " + obj[i].geteName());
System.out.println("Employee ID: " + obj[i].geteId());
System.out.println("Employee Salary: " + obj[i].geteSalary());
System.out.println("Employee Company Name: " + Employee.companyName);
}

}
}
