//to refer current class Constructor
class Student
  {
    String name;
    int rollno;
    String course;
    float fee;
    Student(String name,int rollno,String course)
    {
    this.name=name;
    this.rollno=rollno;
    this.course=course;
    }
    Student(String name,int rollno,String course,float fee)
    {
      this(name,rollno,course);  //reusing the constructor
      this.fee=fee;
    }
    public void display()
    {
      System.out.println("name="+name+" "+"rollno="+rollno+" "+"course="+course+" "+"fee="+fee);
    }
  }
    class ThisEx3
      {
        public static void main(String args[])
        {
          Student s1=new Student("Prasanna",101,"cse");
          Student s2=new Student("Anitha",102,"ECE",12000f);
          s1.display();
          s2.display();
        }
      }