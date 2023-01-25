class InnerClass
{
    String name="Lohith";
    int age=20;
    String add="Vij";
    String name1="Vunnam";
   int age1 =21;
  String add1="Banjara Hills";
    class Inner
    {
     void display()
      {
         System.out.println("the student details are "+name+" Age "+age+" Address "+add);
        System.out.println("the student details are "+name1+" Age "+age1+" Address "+add1);
        }
    }
    public static void main(String args[])
    {
        InnerClass obj=new InnerClass();
      InnerClass.Inner obj2=obj.new Inner();
        obj2.display();
    }
}