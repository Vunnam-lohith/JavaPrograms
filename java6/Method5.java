//constructor overloading
class Method5
  {
    String sname;
    int rollno;
    int a;
    Student4()
    {
      System.out.println("default constructor");
    }
    Student4(String name,int rno)
    {
      sname=name;
      rollno=rno;
    }
    Student4(String name,int rno,int age)
    {
      sname=name;
      rollno=rno;
      a=age;
    }
    public void display()
    {
      System.out.println("name="+sname+" "+"rollno="+rollno+"age="+a);
    }
    public static void main(String args[])
    {
      Student4 st=new Student4();
      Student4 st1=new Student4("anay",12);
      Student4 st2=new Student4("sowjanya",343,50);
      st1.display();
      st2.display();
    }
  }