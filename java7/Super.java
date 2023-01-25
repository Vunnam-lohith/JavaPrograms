//super keyword refers to immediate parent class instance variable
class Animal
  {
    String name="animal";
    String color="white";
  }
class Dog extends Animal
{
  String dname="dog";
  String color="black";
  public void print()
  {
    System.out.println(color);
    System.out.println(name);
    System.out.println(dname);
    System.out.println(super.color);
  }
}
class SuperEx
  {
    public static void main(String args[])
    {
      Dog d=new Dog();
      d.print();
    }
  }