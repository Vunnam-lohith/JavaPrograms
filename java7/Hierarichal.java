//Hierarichal Inheritance
class Animal
{
String color;
int no_of_legs;
String name;
void eat()
{
System.out.println("eating");
}
}
class Dog extends Animal
{
void sound()
{
System.out.println("bow bow ");
}
}
class Cat extends Animal
{
void makesound()
{
System.out.println("meow meow");
}
}
class Hierarichal
{
public static void main(String args[])
{
Dog d=new Dog();
d.color="white";
d.no_of_legs=4;
d.name="puppy";
d.eat();
d.sound();
System.out.println(d.name+" "+d.no_of_legs+" "+d.color);
Cat c=new Cat();
c.color="black";
c.no_of_legs=4;
c.name="sweety";
c.eat();
c.makesound();
System.out.println(c.name+" "+c.no_of_legs+" "+c.color);
}
}