//Polymorphism
//1)Create a base class Animal with a method makeSound(). Create two derived classes Dog and Cat that override the makeSound() method. Illustrate runtime polymorphism by creating objects of both derived classes and invoking the method.
class Animal
{
  void makeSound ()
  {
	System.out.println ("Animal class");
  }
}

class Dog extends Animal
{
  void makeSound ()
  {
	System.out.println ("Dog class");
  }
}

class Cat extends Animal
{
  void makeSound ()
  {
	System.out.println ("Cat class");
  }
}

public class Polymorphism
{
  public static void main (String[]args)
  {
	Animal base = new Animal ();
	Animal dog = new Dog ();
	Animal cat = new Cat ();
	  base.makeSound ();
	  dog.makeSound ();
	  cat.makeSound ();
  }
}
