package day49_Polymorphism;

public class Zday49_ClassNotes {
    /*
    06/11/2020
Topics: Polymorphism Intro

package name: day49_Polymorphism

Warmup task:
    1. create an interface named downloadable:
            variable: boolean downloadable
            abstract method: download();

    2. create an interface named AndroidApps that can inherit from downloadable interface
            variable: AppStoreName

    3. create an interface named AppleApps that can inherit from downloadable interface
            variable: AppStoreName

    4. create an abstract class named Phone
            variables: brand, model, price, size
            abstract methods: texting(), calling()

    5. create a class named iPhone that can inherit from AppleApps and Phone
            actions that every iphone can do: texting(), calling(), faceTiming(), selfie()

    6. create a class named Nokia that can inherit from AndroidApps and Phone
            actions that Nokia can do: texting(), calling(), freezing(), breakTheFloor()

    in each sub classes of phone, create a constructor to initialize the instances



canvas -> java Programming -> modules -> day49 ->  Abstraction short quiz
    due by : 11:30 am


IS A: inheritance relation


polymorphism: object's behave in different forms

            occurs when parent class/interface reference to child class' objects
             Animal     dog2     =  new Dog();

             abstract class and interface are meant to be reference type, CAN NEVER BE IN OBJECT TYPE

             SUB CLASS CAN NEVER EVER BE THE REFERENCE TYPE OF SUPER CLASS' OBJECTS

    class Dog extends Animal


    class Cat extends Animal

    class Bird extends Animal

     Animal  dog1 = new Dog();
     Animal cat1 = new Cat();
     Animal bird1 = new Bird();

     Animal[] arr = { }







    WebDriver driver= new ChromeDriver();





task:
    1. create an abstract class named Employee:
            attributes: name, id, jobTitle, Salary,...
            abstract method: work()

    2. create class named Tester that inherits from employee

    3. create class named Developer that inherits from employee


    4. create a class named ScrumTeam:
            create an arraylist and store 3 testers and 4 developers




     */
}
