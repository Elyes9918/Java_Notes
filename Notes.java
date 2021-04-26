#Java								#16 Java Methods				#32 Exception Handling
#1 Java Variables						#17 Java Overloading				#33 Java File Class
#2 Java UserInput						#18 Java Final Word				#34 Java Write_Into_Files
#3 Operations							#19 Variable Scope				#35 Java Read_Into_Files
#4 Java Gui Intro						#20 Java ToString				
#5 Java Math Class						#21 Java Array Of Objects		
#6 Java Random							#22 Java Static Keyword
#7 Java Switch							#23 Java Inheritance
#8 Java Logical Operations					#24 Java Method Overriding
#9 Java Nested Loops						#25 Java Super KeyWord
#10 Java Arrays							#26 Java Abstraction
#11 Java String Methods						#27 Java Access Modifiers
#12 Java Wrapper Class						#28 Java Encapsulation
#13 Java ArrayList						#29 Java Copy Objects
#14 Java Arraylist2D						#30 Java Interfaces
#15 Java For Each						#31 Java Polymorphisme
//Java Variables******************************************************************************************************************************************************1
public class Main {

	public static void main(String[] args){
		
		int x = 123;
		double y = 3.14;
		boolean z = true;
		char symbol = '@';
		String name = "Bro";
		
		System.out.println("Hello "+name);
		
	}
}
//Java UserInput******************************************************************************************************************************************************2
Scanner scanner = new Scanner(system.in)

String name = scanner.nextline();

int age = scanner.nextint();

scanner.nextline();    //to make the scanner empty

//Java Operations******************************************************************************************************************************************************3
public class Main {

 public static void main(String[] args) {
  
   //expression =     operands & operators
   //operands =  values, variables, numbers, quantity
  // operators = + - * / % 

 } 
}

//Java Gui Intro******************************************************************************************************************************************************4

Épinglé par Bro Code
Bro Code
il y a 6 mois
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
	}	
}

//Java Math Class******************************************************************************************************************************************************5
Math.max(x,y)
Math.min(x,y)
Math.abs(y)
Math.sqrt(x)
Math.round(x)
Math.ceil(x)
Math.floor(x)


import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  
  double x;
  double y;
  double z;
  
  Scanner scanner = new Scanner(System.in);
    
  System.out.println("Enter side x: ");
  x = scanner.nextDouble();
  System.out.println("Enter side y: ");
  y = scanner.nextDouble();
  
  z = Math.sqrt((x*x)+(y*y));
  
  System.out.println("The hypotenuse is : "+z);
  
  scanner.close();   
 }
}


//Java Random******************************************************************************************************************************************************6
random.nextInt()
random.nextDouble()
random.nextBoolean()

import java.util.Random;

public class Main {

 public static void main(String[] args) {
  
  Random random = new Random();
  
  int x = random.nextInt(6)+1;
  //double y = random.nextDouble();
  //boolean z = random.nextBoolean();
  
  System.out.println(x);
    
 }
}


//Java Switch******************************************************************************************************************************************************7
public class Main {

 public static void main(String[] args) {
  
  // switch = statement that allows a variable to be tested for equality against a list of values
  
  String day = "Friday";
  
  switch(day) {
   case "Sunday": System.out.println("It is Sunday!");
   break;
   case "Monday": System.out.println("It is Monday!");
   break;
   case "Tuesday": System.out.println("It is Tuesday!");
   break;
   case "Wednesday": System.out.println("It is Wednesday!");
   break;
   case "Thursday": System.out.println("It is Thursday!");
   break;
   case "Friday": System.out.println("It is Friday!");
   break;
   case "Saturday": System.out.println("It is Saturday!");
   break;
   default: System.out.println("That is not a day!");
  }
    
 }
}

//Java Logical Operations*******************************************************************************************************************************************8
public class Main {

	public static void main(String[] args) {
		
		// logical operators = used to connect two or more expressions
		//
		//      && = (AND) both conditions must be true
		// 	|| = (OR) either condition must be true
		//	! = (NOT) reverses boolean value of condition

// -------------------------------- Example 1 --------------------------------

		int temp = 15;
		
		if(temp>30) {
			System.out.println("It is hot outside");
		}
		else if(temp>=20 && temp<=30) {
			System.out.println("It is warm outside");
		}
		else {
			System.out.println("It is cold outside");
		}


// -------------------------------- Example 2 --------------------------------

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = scanner.next();
		
		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("YOu are still playing the game *pew pew*");
		}
		else {
			System.out.println("You quit the game");
		}
	
	}
}


//Java Nested Loops*******************************************************************************************************************************************9

Épinglé par Bro Code
Bro Code
il y a 6 mois
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// nested loops = a loop inside of a loop
		
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns: ");
		columns = scanner.nextInt();
		System.out.println("Enter symbol to use: ");
		symbol = scanner.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=columns;j++) {
				System.out.print(symbol);
			}
		}	
	}
}

//Java Arrays*****************************************************************************************************************************************************10

//array= used to store mulitiple values in a signle variable

//Java 2D Arrays************************************************************************************************************************
public class Main {

	public static void main(String[] args) {
			
		// 2D array = an array of arrays
		
		String[][] cars = 	{	
								{"Camaro","Corvette","Silverado"},
								{"Mustang","Ranger","F-150"},
								{"Ferrari","Lambo","Tesla"}
							};
		
		/*
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		cars[1][0] = "Mustang";
		cars[1][1] = "Ranger";
		cars[1][2] = "F-150";
		cars[2][0] = "Ferrari";
		cars[2][1] = "Lambo";
		cars[2][2] = "Tesla";
		*/
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
		}
	}
}

//Java String Methods*************************************************************************************************************************************************11
public class Main {

 public static void main(String[] args) {
  
  // String = a reference data type that can store one or more characters
  //   reference data types have access to useful methods
  
  String name = "Bro";
  
  boolean result = name.equalsIgnoreCase("bro");
  int result = name.length();
  char result = name.charAt(0);
  int result = name.indexOf("o");
  boolean result = name.isEmpty();
  String result = name.toUpperCase();
  String result = name.toLowerCase();
  String result = name.trim();
  String result = name.replace('o', 'a');
   
  System.out.println(result);
 }
 
}

//Java Wrapper Classes*********************************************************************************************************************************************12
public class Main {

 public static void main(String[] args) {
  
  // wrapper class =  provides a way to use primitive data types as reference data types
  //     reference data types contain useful methods
  //     can be used with collections (ex.ArrayList)
  
  //primitive  //wrapper
  //---------  //-------
  // boolean  Boolean
  // char   Character
  // int   Integer
  // double  Double
  
  // autoboxing = the automatic conversion that the Java compiler makes between the
  //	         primitive types and their corresponding object wrapper classes
  // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
  
  Boolean a = true;
  Character b = '@';
  Integer c = 123;
  Double d = 3.14;
  
 }
 
}

//Java ArrayList********************************************************************************************************************************************************13

Épinglé par Bro Code
Bro Code
il y a 6 mois
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
			
		// ArrayList = 	a resizable array. 
		//				Elements can be added and removed after compilation phase
		//				store reference data types
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		//food.set(0, "sushi");
		//food.remove(2);
		//food.clear();
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
	}
}

//Java 2D Arraylists*************************************************************************************************************************************************14
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList);
		
	}
}

//Java For each Loop************************************************************************************************************************************************15

mport java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
			
		// for-each = 	traversing technique to iterate through the elements in an array/collection
		//				less steps, more readable
		//				less flexible
		
		//String[] animals = {"cat","dog","rat","bird"};
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		
		for(String i : animals) {
			System.out.println(i);
		}

//Java methods******************************************************************************************************************************************************16
   public class Main {
	 public static void main(String[] args) {
		
		// method = a block of code that is executed whenever it is called upon
		
		int x = 3;
		int y = 4;
		
		int z = add(x,y);

		System.out.println(z);
	}
	
	static int add(int x, int y) {
		
		int z = x + y;
		return z;
		
	}
	
}

//Java overload Methods********************************************************************************************************************************************17

public class Main {

	public static void main(String[] args) {
		
		// overloaded methods = methods that share the same name but have different parameters
		//						method name + parameters = method signature
		
		double x = add(1.0,2.0,3.0,4.0);
		
		System.out.println(x);
		
	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c + d;
	}
	static double add(double a, double b) {
		System.out.println("This is overloaded method #4");
		return a + b;
	}
	static double add(double a, double b, double c) {
		System.out.println("This is overloaded method #5");
		return a + b + c;
	}
	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloaded method #6");
		return a + b + c + d;
	}	
}

//Java printf() Works like printf in c *******************************************************************************************************************************


public class Main {

	public static void main(String[] args) {

		// printf() = 	an optional method to control, format, and display text to the console window
		//				two arguments = format string + (object/variable/value)
		//				% [flags] [precision] [width] [conversion-character]
				
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
			
		// [conversion-character]
		//System.out.printf("%b",myBoolean);
		//System.out.printf("%c",myChar);
		//System.out.printf("%s",myString);
		//System.out.printf("%d",myInt);
		//System.out.printf("%f",myDouble);
		
		//[width]
		// minimum number of characters to be written as output
		//System.out.printf("Hello %10s",myString);
		
		//[precision]
		// sets number of digits of precision when outputting floating-point values
		//System.out.printf("You have this much money %.1f",myDouble);
		
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		
		//System.out.printf("You have this much money %,f",myDouble);
	}
}

//Java final word*************************************************************************************************************************************************18

public class Main {

	public static void main(String[] args) {
		
		final double PI = 3.14159;
				
		//PI = 4;  //You can't change a final variable
		
		System.out.println(PI);
		
	}
}

//Variable scope**************************************************************************************************************************************************19
public class Main {

 public static void main(String[] args) {
  
  //local =  declared inside a method
  //   visible only to that method
  
  //global  = declared outside a method, but within a class
  //   visible to all parts of a class
  
  DiceRoller diceRoller = new DiceRoller();
  
 }
}
//********************************************
import java.util.Random;

public class DiceRoller {
 
 Random random;
 int number;
 
 DiceRoller(){
  random = new Random();
  roll();
 }
 
 void roll() {
  number = random.nextInt(6)+1;
  System.out.println(number);
 }
}


//Java ToString Method************************************************************************************************************************************************20
public class Main {

 public static void main(String[] args) {
  
  // toString() = special method that all objects inherit, 
  //    that returns a string that "textually represents" an object.
  //    can be used both implicitly and explicitly
  
  Car car = new Car();
  
  
  System.out.println(car.toString());
  
  // or
  
  System.out.println(car);

    
 }
}
//***************************************
public class Car {


 String make = "Ford";
 String model = "Mustang";
 String color = "red";
 int year = 2021;
 
 public String toString() {
  
  return make +"\n"+model+"\n"+color+"\n"+year;
  
 } 
}

//Java Array of Objects*******************************************************************************************************************************************21
public class Main {

	public static void main(String[] args) {
			
		//Food[] refrigerator = new Food[3];
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("hamburger");
		Food food3 = new Food("hotdog");
		
		Food[] refrigerator = {food1,food2,food3};
		
		//refrigerator[0] = food1;
		//refrigerator[1] = food2;
		//refrigerator[2] = food3;
		
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
		
	}
}
//****************************************************
public class Food {

	String name;
	
	Food(String name){
		this.name = name;
	}	
}

//Java Static KeyWord********************************************************************************************************************************************22
public class Main {

	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static member
		
		Friend friend1 = new Friend("Sponegbob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Patrick");
		
		System.out.println(Friend.numberOfFriends);
	}
}
//**********************************************
public class Friend {


	String name;
	
	static int numberOfFriends;
	
	Friend(String name){
		this.name=name;
		numberOfFriends++;
	}	

}

//Java inheritance**************************************************************************************************************************************************23

public class Main {

	public static void main(String[] args) {
		
		//inheritance = the procces where one class acquires
        //              the attriibutes and methods of another

       // we use the word extends

    }
}

//Java method Overriding********************************************************************************************************************************************24
public class Main {

	public static void main(String[] args) {
		
		// method overriding = 	Declaring a method in sub class,
		//			which is already present in parent class.
		//			done so that a child class can give its own implementation
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		dog.speak();
				
	}
}
//*******************************************
public class Animal {



	void speak() {
		System.out.println("The animal speaks");
	}
}//*******************************************
public class Dog extends Animal{

	@Override
	void speak() {
		System.out.println("The dog goes *bark*");
	}
}

//Java Super keyword***********************************************************************************************************************************************25
public class Main {

	public static void main(String[] args) {
		
		// super = 	keyword refers to the superclass (parent) of an object
		//			very similar to the "this" keyword
		
		Hero hero1 = new Hero("Batman",42,"$$$");
		Hero hero2 = new Hero("Superman",43,"everything");
		
		System.out.println(hero2.toString());
		
	}
}
//******************************************
public class Person {


	String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return this.name + "\n" + this.age + "\n";
	}
	
}//******************************************
public class Hero extends Person{


	String power;
	
	Hero(String name,int age,String power){	
		super(name,age);
		this.power = power;
	}
	
	public String toString() {
		return super.toString()+this.power;
	}

}

//Java Abstraction**********************************************************************************************************************************************26

public class Main {

	public static void main(String[] args) {
		
		// abstract =  	abstract classes cannot be instantiated, but they can have a subclass
		//				abstract methods are declared without an implementation
		
		//Vehicle vehicle = new Vehicle();
		Car car = new Car();
		
		car.go();
	}
}
//****************************************
public abstract class Vehicle {
	
	abstract void go();
}
//****************************************
public class Car extends Vehicle{

	@Override
	void go() {
		System.out.println("The driver is driving the car");
		
	}
}

//Java Access modifiers (public,private,protected)************************************************************************************************************27

public: visible in all classes in all packages
protected: visible to all classes in the same package or classes in other packages that are a subclass
default: visible to all classes in the same package 
private: visible only in the same class

//Java Encapsulation********************************************************************************************************************************************28

Encapsulation=attributes of a class will be hidden or private
              can be accssed only through methods (getters and setters)
              you should make attributes private if you dont have a reason to set them public

//Java Copy objects***********************************************************************************************************************************************29
public class Main {

	public static void main(String[] args) {
		
		
		Car car1 = new Car("Chevrolet","Camaro",2021);
		//Car car2 = new Car("Ford","Mustang",2022);
		//car2.copy(car1);
		Car car2 = new Car(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());		
	
	}
}
//*********************************************
public class Car {

	
	private String make;
	private String model;
	private int year;
	
	Car(String make,String model,int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	Car(Car x){
		this.copy(x);
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void copy(Car x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
		
}

//Java Interfaces************************************************************************************************************************************************30
//Interfaces = a template that can be applied to a class
//                similar to inheritance,but specfies what a class has/must do 
 //               classes can apply more that one interface,inheritance is limited to 1 superclass
public class Main {

	public static void main(String[] args) {
		
		Fish fish = new Fish();
		
		fish.hunt();
		fish.flee();
				
	}
}
//********************************************
public interface Prey {

	void flee();
}
//********************************************
public interface Predator {

	void hunt();
}
//********************************************
public class Rabbit implements Prey{


	@Override
	public void flee() {
		System.out.println("*The rabbit is fleeing*");
		
        }
}
//********************************************
public class Hawk implements Predator{


	@Override
	public void hunt() {
		System.out.println("*The hawk is hunting*");
		
        }
}
//********************************************
public class Fish implements Prey,Predator{


	@Override
	public void hunt() {
		System.out.println("*The fish is hunting*");
		
	}

	@Override
	public void flee() {
		System.out.println("*The fish is fleeing*");
		
	}
}

//Java Polymorphism*******************************************************************************************************************************************31

public class Main {

	public static void main(String[] args) {
		
		// polymorphism = 	greek word for poly-"many", morph-"form"
		//					The ability of an object to identify as more than one type
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car,bicycle,boat};
		
		for(Vehicle x : racers) {
			x.go();
		}
		
	}
}
//**************************************
public class Vehicle {

	public void go() {
		// TODO Auto-generated method stub
		
	}
}
//**************************************
public class Car extends Vehicle{


	@Override
	public void go() {
		System.out.println("*The car begins moving*");
	}
}
//**************************************
public class Bicycle extends Vehicle{


	@Override
	public void go() {
		System.out.println("*The bicycle begins moving*");
	}
}
//**************************************
public class Boat extends Vehicle{


	@Override
	public void go() {
		System.out.println("*The boat begins moving*");
	}

}

//Java Exception Handling******************************************************************************************************************************************32
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// exception = 	an event that occurs during the execution of a program that,
		//				disrupts the normal flow of instructions
		
		Scanner scanner = new Scanner(System.in);
		
		try {
		
			System.out.println("Enter a whole number to divide: ");
			int x = scanner.nextInt();
		
			System.out.println("Enter a whole number to divide by: ");
			int y = scanner.nextInt();
		
			int z = x/y;
		
			System.out.println("result: " + z);
		}
		catch(ArithmeticException e) {
			System.out.println("You can't divide by zero! IDIOT!");
		}
		catch(InputMismatchException e) {
			System.out.println("PLEASE ENTER A NUMBER OMFG!!!");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			scanner.close();
		}
    }
}

//Java file class*******************************************************************************************************************************************33
import java.io.File;

public class Main {

 public static void main(String[] args) {
  
  // file = An abstract representation of file and directory pathnames
  
  File file = new File("secret_message.txt");
  
  if(file.exists()) {
   System.out.println("That file exists! :O!");
   System.out.println(file.getPath());
   System.out.println(file.getAbsolutePath());
   System.out.println(file.isFile());
   file.delete();
  }
  else {
   System.out.println("That file doesn't exist :(");
  }  
 }
}

//Java Write_Into_Files**************************************************************************************************************************************34
import java.io.FileWriter;
import java.io.IOException;

public class Main {

 public static void main(String[] args) {
  
  try {
   FileWriter writer = new FileWriter("poem.txt");
   writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!");
   writer.append("\n(A poem by Bro)");
   writer.close();
  } 
  catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }
}

//Java Read_Into_Files******************************************************************************************************************************************35
public class Main {

 public static void main(String[] args) {
  
  // FileReader = read the contents of a file as a stream of characters. 
  //read() returns an int value which contains the byte value
  //when read() returns -1, there is no more data to be read
  
  try {
   FileReader reader = new FileReader("art.txt");
   int data = reader.read();
   while(data != -1) {
    System.out.print((char)data);
    data = reader.read();
   }
   reader.close();
   
  } catch (FileNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }
}
