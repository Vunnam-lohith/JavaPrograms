import java.util.*;
class ArrayObject
  {
    String empname;
    int salary;
    int id;
    String company;
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Employee emp[]=new Employee[4];
      for(int i=0;i<4;i++)
      {
        emp[i]=new Employee();
        System.out.println("enter the name of employee");
        emp[i].empname=sc.next();
        System.out.println("enter the salary");
        emp[i].salary=sc.nextInt();
        System.out.println("enter the id");
        emp[i].id=sc.nextInt();
        System.out.println("enter the name of company");
         emp[i].company=sc.next();
        }
      for(int i=0;i<4;i++)
      {
        System.out.println(emp[i].empname+" "+emp[i].salary+" "+emp[i].id+" "+emp[i].company);
      }
     
     
    }
  }