//Encapsulation
class Student
  {
    private String name;
    int id=102;
    public void setName(String name)
    {
      this.name=name;
    }
    public String getName()
    {
      return name;
    }
  }
class EncapEx
  {
    public static void main(String args[])
    {
      Student obj=new Student();
      obj.setName("raj");
      System.out.println(obj.getName());      
      System.out.println(obj.id);
    }
  }