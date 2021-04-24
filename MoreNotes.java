
//Java Method Chaining************************************************************************************************************************************************
public class Main {

    public static void main(String[] args) {
     
     // method chaining =  a common syntax for invoking multiple method calls in OOP
     //      condense code into less lines
     
     String name = "      bro";
     
     //name = name.concat(" code   ");
     //name = name.toUpperCase();
     //name = name.trim();
     
     name = name.concat("code").toUpperCase().trim();
     
     System.out.println(name);
      
    }
}

// Java
// enum************************************************************************************************************************************************************
enum Planet {
    MERCURY(1), VENUS(2), EARTH(3), MARS(4), JUPITER(5), SATURN(6), URANUS(7), NEPTUNE(8), PLUTO(9);

    int number;

    Planet(int number) {
        this.number = number;
    }
}

public class Main {

    public static void main(String[] args) {

        // enum = enumerated (ordered listing of items in a collection)
        // grouping of constants that behave similarly to objects

        Planet myPlanet = Planet.PLUTO;

        canILiveHere(myPlanet);

    }

    static void canILiveHere(Planet myPlanet) {

        switch (myPlanet) {
        case EARTH:
            System.out.println("You can live here :)");
            System.out.println("This is planet #" + myPlanet.number);
            break;
        default:
            System.out.println("You can't live here...yet");
            System.out.println("This is planet #" + myPlanet.number);
            break;
        }
    }

}

// Java
// HashMap***********************************************************************************************************************************************************
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // HashMap implements the Map interface (need import)
        // HashMap is similar to ArrayList, but with key-value pairs
        // stores objects, need to use Wrapper Class
        // ex: (name,email),(username,userID),(country,capital)

        HashMap<String, String> countries = new HashMap<String, String>();

        // add a key and value
        countries.put("USA", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");

        // System.out.println(countries);
        // countries.remove("USA");
        // System.out.println(countries.get("Russia"));
        // countries.clear();
        // System.out.println(countries.size());
        // countries.replace("USA", "Detroit");
        // System.out.print(countries.containsKey("England"));
        // System.out.print(countries.containsValue("Beijing"));

        for (String i : countries.keySet()) {
            System.out.print(i + "\t" + "= ");
            System.out.println(countries.get(i));
        }

    }
}
// Java recursion********************************************************************************************************************************************************
// ******************************* Example 1 *******************************
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Recursion = the process in which a method calls itself continuously
		// A method that calls itself is called a recursive method

		Scanner scan = new Scanner(System.in);
		System.out.println("Say hello how many times?: ");
		int number = scan.nextInt();
		
		HelloWorld(number);
	}
	
	static void HelloWorld(int i) {
		if(i>0) {
			System.out.println("Hello World!"+i);
			i--;
			HelloWorld(i);
		}
	}
}

// ******************************* Example 2 *******************************
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// recursion = the process in which a method calls itself continuously
		// a method that calls itself is called a recursive method	
		// useful for factorials, transversing trees, and simplifying a complex task
	
		Scanner scan = new Scanner(System.in);
		System.out.println("How far do you want to walk (meters)?: ");
		int distance = scan.nextInt();
		
		takeAStep(0,distance);
		
	}
	
	static void takeAStep(int i,int distance) {
		if(i<distance) {
			i++;
			System.out.println("*you take a step* : "+i+" meter/s");
			takeAStep(i,distance);
		}
		else {
			System.out.println("You are done walking!");
		}

	}
	
}
//Java Custom Exceptions*************************************************************************************************************************************************
// ***************************************************
public class AgeException extends Exception{
	
	AgeException(String message){  
		super(message);  
	}  
}
// ***************************************************
import java.util.Scanner;

public class Main {

		public static void main(String args[]){
			
			 Scanner scan = new Scanner(System.in);
			 System.out.print("Enter your age: ");
			 int age = scan.nextInt();
	 	 
		      try{  
		    	  checkAge(age);  
		      }
		      catch(Exception e)
		      {
		    	  System.out.println("A problem occured: "+e);
		      }   
		}  
		 
		static void checkAge(int age)throws AgeException{ 
			 
			     if(age<18) {
			    	 throw new AgeException("\n"+"You must be 18+ to sign up");  
			     }
			     else {
			    	 System.out.println("You are now signed up!"); 
			     }       
		}  
}

//Java Anonymous Objects/Nameless Objects
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		ArrayList<JLabel> deck = new ArrayList<JLabel>();
		
		/*
		ImageIcon AC = new ImageIcon("src\\cards\\1.png");
		JLabel AClabel = new JLabel(AC);
		deck.add(AClabel);
		
		ImageIcon TwoC = new ImageIcon("src\\cards\\2.png");
		JLabel TwoClabel = new JLabel(TwoC);
		deck.add(TwoClabel);
		
		... repeat for all 52 cards :(
		*/
		
		for(int i =1;i<=52;i++) {
			deck.add(new JLabel(new ImageIcon("src\\cards\\"+i+".png")));
			frame.add(deck.get(i-1));
		}
			
		//frame.add(deck.get(0));
		//frame.add(deck.get(1));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
}
//Java inner Classes******************************************************************************************************************************
public class Main {

	public static void main(String[] args) {
		
		/* inner class = 	A class inside of another class.
							useful if a class should be limited in scope.
							usually private, but not necessary
							helps group classes that belong together
							extremely useful for listeners for specific events
							precursor for anonymous inner classes			
		*/
		Outside out = new Outside();
		Outside.Inside in = out.new Inside();
		in.Greeting();
	}
//********************************************************
public class Outside {

	String x = "Hello ";
	
	public class Inside{
		
		String y = "World!";
		
		public void Greeting()
		{
			System.out.println(x+y);
		}
	}
}

//Java Anonymous Inner Class **********************************************************************************************************************
