class Animal //parent class
  {
    void eat()
    {
      System.out.println("eating");
    }
    void sleep()
    {
      System.out.println("sleeping");
    }
  }
class Dog extends Animal  //dog is a child class
  {
    void bark()
    {
      System.out.println("barking");
    }
    public static void main(String args[])
    {
      Dog obj=new Dog();
      obj.eat();
      obj.sleep();
      obj.bark();
    }
    
  }