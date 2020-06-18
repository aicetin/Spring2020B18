package day50_Polymorphism;

public class Zday50_Summary {

    /*  1-
    OOP PRINCIPLES:
    •Encapsulation
    •Inheritance
    •Abstraction
    •Polymorphism
Object-oriented:  Everything is considered to be an "object" which possess some state,
behavior and all the operations are performed using these objects.
Encapsulation: Data Hiding
     •An object hides its internal data from code that is outside the class that the object is an instance of.
     •Only the current class's methods can directly access and make changes to the instance variables
     •You hide an instance variable by giving private access modifier,  and making the methods that access those fields public.
     •These public methods are called getters and setters (accessor and mutator)
   1. hide the data by giving 'private' access modifier
   2. grant other classes access to use the 'private' data through getter and setter (public methods)
 •We can provide only getter in a class to make the variable immutable. (Read only)
 •We can provide only setter in a class to make the class attribute. (write-only)
     */


    /* 2-
    Abstraction:
          - hiding the implementation details
          - concentrating on essentials/ important, without worrying about details
          - ChromeDriver, FireFoxDriver, OperaDriver are all classes
          - all these classes can do a common action: get() and quit() .
          - WebDriver:
                - get();    // abstract method to be overridden to give different implementation
                - quit();   // abstract method to be overridden to give different implementation
            - ChromeDrive implements WebDriver:
                - get(): opens chrome
                - quit(): closes chrome only
            - FireFoxDriver implements WebDriver:
                 - get(): opens firefox
                - quit(): closes firefox only
            - OperaDriver implements WebDriver:
                - get(): opens opera
                - quit(): closes opera only
          - Abstract method:
                - method without body/implementation
                - meant to be overridden
                - abstract method can not be final
                - abstract method can not be static
                - abstract method can not be private
                - abstract method can be overloaded
          - To achieve abstraction : you can use two ways: Abstract class OR Interface
                - Abstract class:
                    - not concrete
                    - can not create object
                    - meant to be inherited
                    - abstract class can NOT be final
                    - use "extends" keyword to inherit
                    - sub class can extend one abstract class (one class in general)
                    - abstract class can have all methods and all variables
                - Interface:
                    - Sub class can implement multiple interfaces
                    - can NOT create object
                    - meant to be inherited
                    - interface can NOT be final
                    - use "implements" keyword to inherit from interface into a class
                    - "extends" keyword must be used before "implements" keyword when inheriting from class and interface
                    - use "extends" keyword to inherit form interface to interface
                    - Everything has public access modifier
                    - can only have :
                                static final variables (by default)
                                abstract or static or default methods
                    - can NOT have:
                                constructor
                                instance variables
                                instance methods
                                blocks
Encapsulation:
            * hiding data by using PRIVATE ACCESS MODIFIER
            * Uses PUBLIC getter/setter to read and modify the private data
            * purpose of getter is to return the value of the data
            * setter to modify the data we have for the private data..> pass argument
            * if the private data is final ==> can not generate setter ==> can only generate getter
     */

    /* 3-
    Inheritance:
        - build super class and sub class
        - easy way to get rich by inheriting from super class
        - super class:  Only gives. Can not inherit anything from child class.
        - sub class: can inherit visible variables and methods from super class (visible according to am) except constructor
        - sub class uses "extends" keyword to inherit from super class: class A extends B{ }
        - sub class uses "implements" keyword to inherit from interface/interfaces: class A extends B implements C,D{  }
        - Inheritance is pre-condition for polymorphism and for overriding methods
        - method overriding must happen in sub class
        - advantages of inheritance:
                - less codes
                - reusable
                - easy to maintain
        - PUBLIC or PROTECTED access modifier are visible anywhere in sub classes
        - DEFAULT access modifier is only visible in the same package sub classes
        - Instance & Static variables can be inherited
     */

    /* 4-
    Polymorphism:
    * means the ability of object to take many forms
    * it is when reference type is a parent class /interface and object type is child
    * ex1:
        class Dog extends Animal
        Dog dog1 = new Dog(); // new object created
        Applying polymorphism ==> I can give the super class name Animal to create the object from Dog
        Animal dog2 = new Dog();
    * ex2:
        ChromeDriver is a class that inherited from interface WebDriver
        WebDriver is parent interface of ChromeDriver ==>
        when we create an object from ChromeDriver we can use the super type interface name as the reference
        WebDriver driver = new ChromeDriver();
    * ex3:
        class Cat extends Animal
        class Bird extends Animal
        class Dog extends Animal
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Bird bird1 = new Bird();
        Now if I want to create an array and store all these different objects in that array, what can I have as reference type?
        I can't have my reference type as Dog, or Cat or Bird
        ==> But because of polymorphism I can make reference type Animal and create Animal[] array to contain them all
         POLYMORPHISM   :   SUPER CLASS CAN BE REFERENCE TYPE OF SUB CLASSES' OBJECTS (SUB CLASS CAN NOT BE ABSTRACT
                            IF SUPER CLASS IS ABSTRACT IT WILL NOT BE ABLE TO CREATE ITS OWN OBJECTS
                            BUT IT CAN STILL BE REFERENCE TYPE FOR ITS SUB (NON-ABSTRACT) CLASSES' OBJECTS
                            SUPER TYPE INTERFACE CAN BE REFERENCE TYPE FOR SUB CLASSES OBJECTS
                            ABSTRACT CLASS AND INTERFACE:
                                            ARE MEANT TO BE REFERENCE TYPE
                                            CAN NEVER BE IN OBJECT TYPE (CAN NOT CREATE THEIR OWN OBJECT)
                            SUB CLASS CAN NEVER BE REFERENCE TYPE OF SUPER CLASS OBJECTS
         Animal  dog1 = new Dog();       // super class can be reference type to the sub class object
         Animal cat1 = new Cat();        // super class can be reference type to the sub class object
         Animal bird1 = new Bird();      // super class can be reference type to the sub class object
         Animal[] arr = { }
     */

    /* 5-
    Type Castings:
Casting means: converting one type to another
                two types of casting are: primitive type & reference type
        - Primitive Type Casting: used when initializing primitives
          byte < short < int < long < float < double
          two types of primitive casting: implicit & explicit
             - implicit casting: casting (assigning) smaller type to larger type  - done automatically
                    int a = 100;
                    double b = a; // b = 100.0
             - explicit casting: casting (assigning) larger type to smaller type - MUST BE DONE MANUALLY
                    int a = 200;
                    short s = (short) a ;
       - Reference Type Casting : MUST occur in IS A relation. casting reference
          two types of reference casting: upcasting & downcasting
             - Upcasting: casting from subclass type to superclass type (child to parent) like upgrade
                    ex1:
                    Dog dog = new Dog ("a", "f", 1);
                    Animal animal1 = dog; // upcasting, done implicitly automatically
                    // reference type of dog is now Animal (super class reference type). It was Dog before.
                    it is like:
                    Animal animal1 = (Animal) dog; // but we don't have to add (Animal). compiler adds it automatically
                    ex2:
                    Cat cat = new Cat("b","F",2);
                    Animal animal2 = cat;
             - downcasting: casting from a superclass type to subclass type
                    ex:
                    Animal animal3 = new Dog ("r","f",2);
                    Dog dog3 = (Dog)animal3 ; // down casting. MUST be done MANUALLY
                    Animal animal4 = new Cat ("c","f",3);
                    Cat cat4 = (Cat) animal4; // down casting MUST be done MANUALLY
                    ex2:
                    Animal animal5 = new Dog("l","m",2);
                    // animal5.bark(); // compiler error
                    Dog dog2 = (Dog) animal5; // l is barking
                    dog2.bark(); // this method only belongs to Dog class
                    but we can do this to call it through the object animal5:
                    ( (Dog) animal5 ).bark(); // l is barking
                    // ( (Dog) animal5 ) returns us reference type Dog ==> we can call the method that belongs to Dog class
     */

    /* 6-
     Abstraction:
     A concept that focuses only on the feature / idea of something and not how it is done (implementation)
     cannot exist without inheritance
     achieved by :
         1. Abstract class
         2. Interface
 Abstract class:
         1. to create it: we use abstract keyword before class declaration
         2. cannot be instantiated
         3. can not create object from abstract class
         4. allows creating abstract methods (methods without implementation or body) to be overridden
         5. can extend an abstract class --> implementing abstract methods is not necessary
         6. when non-abstract class extends abstract class --> MUST override (implement) all abstract methods
         7. variables act following regular inheritance rules
         8. Can have abstract and non- abstract methods
         9. can NOT be final or private
         10. when abstract class inherit abstract class--> it inherits all abstract methods
         11. when concrete class extends abstract class --> all abstract methods must be implemented (overridden)
Interface
         1. to create it we use interface key word
         2. not a class but acts similar
         3. allows creation of abstract methods
         4. main purpose: to provide additional information and behaviors to any class that need them
         5. By default: any method is public abstract
         6. By default: any variable is public final static --> must be initialized immediately
         7. can have default method: use default keyword --> allows method to be created with implementation
         8. after Java 8: can have static method
         9. to inherit from interface: use implements keyword
         10. allows you to inherit from multiple interfaces
         11. an interface can inherit from other interfaces using the keyword extend
         12. interface can NOT inherit from a class
ex:
 public class Student extends Person implement Teachable, Dreamer{ }
 is a :  Student is a Person
         Student is a Teachable
         Student is a Dreamer
 Interface can HAVE:
         constant variables
         abstract methods
         default methods
         static methods
Interface CAN NOT HAVE:
         constructor
         blocks
         instance variables or methods
         can only be defined in ab class or interface
     */
}
