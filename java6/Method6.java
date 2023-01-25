//Displaying the student deatils in a college using static variable
class Method6
  {
    String name;
    int rollno;
    static String clgname="ssiet";
    Student5(String sname,int rno)
    {
      name=sname;
      rollno=rno;
    }
    void display()
    {
      System.out.println("the student detials are");
      System.out.println(name+" "+rollno+" "+clgname);
    }
    public static void main(String args[])
    {
      Student5 st=new Student5("praveen",123);
      Student5 st1=new Student5("lohith",122);
      Student5 st2=new Student5("venkatesh",124);
      st.display();
      st1.display();
      st2.display();
      
    }
  }