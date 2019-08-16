
import java.util.Scanner;

class DemoStringIntDouble 
{

  public static void main(String[] args) 
  {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    //byte a = myObj.nextByte(); //'s';

    //char b = 's'; //'5'

    // Output input by user
    System.out.println("Name: " + name); 
    System.out.println("Age: " + age); 
    System.out.println("Salary: " + salary); 
    //System.out.println("Byte value is : " + a); 
    //System.out.println("Char value is : " + b); 
  }
}

