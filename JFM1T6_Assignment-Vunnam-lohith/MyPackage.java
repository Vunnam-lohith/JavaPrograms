/*  JFM1T6_Assignment5:
    Write a class "MyClass" in package "mypack" and access it from other class outside the package "mypack".

    Sample Output:
    Welcome to Packages
*/

//create a package name mypack, inside a folder called mypack, and create a class MyClas. In that create Display method and  print message

//outside folder  import the mypack  and call Dislay method 
package packag;
public class Myclass {
  public void display()
  {
    System.out.println("welcome to packages");
  }

}

import packag.*;
class Mypack
  {
    public static void main(String[]args)
    {
      Myclass obj=new Myclass();
      obj.display();
    }
  }

/*package pack;  
public class A{  
  public void display(){System.out.println("Hello");}  
}  
//save by B.java  
import pack.*;  
  
class B{  
  public static void main(String args[]){  
   A obj = new A();  
   obj.msg();  
  }  
}  */