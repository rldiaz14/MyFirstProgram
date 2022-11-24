import java.lang.*;
import java.util.*;



public class keyboard {

  public static void main(String args[])
  {
  Scanner sc = new Scanner(System.in); 
  //   int a, b, c;
  //   System.out.println("Enter 2 num");
  //  a = sc.nextInt();
  //  b = sc.nextInt();
  //  c = (a+b)/(2*c);
  //  System.out.println("sum is " + c );

  // String name;
  // System.out.println("What is you name?");
  // name = sc.nextLine();
  // System.out.println("Welcome Mr/Miss" + name );

  float base, height, area;
  System.out.println("Enter Base and Height");
  base = sc.nextFloat();
  height = sc.nextFloat();
  area=1f/2f*base*height;
  //area=base*height/2;
  // area = base*height*0.5f;
  System.out.println("Area of Triangle is " + area );

  
  }
  
}
