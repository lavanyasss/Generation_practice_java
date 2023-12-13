import java.util.Scanner;
/* Open your IntelliJ Idea IDE and follow the instructions below
Create a project called 'MyFirstInput'
Create a class called MyFirstInput
Add a main method to your app.
Make your code looks like the file shown below
package com.generation.java;
import java.io.Console;

class MyFirstInput {
 public static void main(String[] args) {
   Console console = System.console();
   System.out.println("Please enter your name ");
   String name = console.readLine();

   System.out.println("My name is "+ name);
 }
}
Run your application.
Notice the prompt on the IntelliJ console asking you to enter your name.
Have a discussion with your pair partner on what you think each line of the code above does.*/

public class MyFirstInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
        Scanner sc = new Scanner (System.in);
		System.out.println("Please enter your name: ");
		String name = sc.nextLine();
		System.out.println("My name is "+name);
        sc.close();
	}

}
