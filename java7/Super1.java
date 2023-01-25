//super keyword is used to invoke immediate parent class method
class Animal
  {
    void sleep()
    {
      System.out.println("sleeping");
    }
    void eat()
    {
      System.out.println("all animals can eat");
    }
  }
class Dog extends Animal{
  void walk()
  {
    System.out.println("walking");
  }
  void eat()
  {
    System.out.println("eating");
  }
  void bark()
  {
    System.out.println("barking");
  }
  void work()
  {
    sleep();
    super.eat();
    bark();
  }
}
class SuperEx1
  {
    public static void main(String args[])
    {
    Dog d=new Dog();
    d.eat();
    d.walk();
    d.work();
    
  }
  }