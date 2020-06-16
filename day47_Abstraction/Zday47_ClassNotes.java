package day47_Abstraction;

public class Zday47_ClassNotes {
    /*
    Abstract - hiding implementation details.
THERE ARE ONLY TWO WAYS TO ACHIEVE ABSTRACTION:
1. The abstract class (special class of Java, which is meant to be inherited. Therefore abstract class can never be
                        final, and final class can never be abstract. FINAL keyword restricts class from being inherited,
                        whereas ABSTRACT implies that class is to be inherited.
                         ANOTHER IMPORTANT FEATURE OF ABSTRACT CLASS:  We CAN NOT create objects of abstract class)
2. Interface
Methods: - abstract methods are the ones without the body and any implementation
                     --- public abstract void method() ----
        - abstract methods are meant to be overridden. PRE-CONDITION for overriding is Inheritance. By overriding we are
        able to provide different implementation for the method in sub classes
        -> why method needs to be overridden? to apply different implementation in each of the methods, i.e. different
        functionality for each separate method
        - by making the method abstract, we don't have to give the implementation to the method.
        - we make the methods abstract when we have many different methods with similar functions, but different
        implementations which could be generalize under one method
        - METHODS WHICH CAN'T BE OVERRIDDEN, thus can't be abstract: private, static, final.
        - When we create sub class and extend our abstract parent class, sub class gives compile error by making it
        mandatory for us to override inherited abstract methods and provide implementations
        -We can inherit abstract class to another abstract class, i.e. the sub class can also have abstract keyword on the
        title. However, you won't be able to create objects of the class - which kind of defeats purpose, although it
        compiles. If we can't create object of the class we will not be able to call/use instance methods of the class.
        e.g.: super class- abstract:
                                    RemoteWebDriver:
                                    get(URL);
                                    quit();
       sub classes:
                CHROME:             extends RemoteWebDriver:
                                    get(URL): opens chrome
                                    quit(): closes chrome
               Firefox              extends RemoteWebDriver:
                                    get(URL): opens firefox
                                    quit(): closes firefox
               Safari               extends RemoteWebDriver:
                                    get(URL): opens safari
                                    quit(): closes safari
                                    * if any new browsers are invented, all we have to do is provide new
                                    implementation by overriding abstract method in parent class*
     ABSTRACT vs NON-ABSTRACT Class
    - NON-ABSTRACT: You can have everything (all methods, constructor, variables, blocks etc) in non-abstract class
    EXCEPT for ABSTRACT methods. You can also create objects in the regular class, as well as make it FINAL.
    - ABSTRACT: You can have everything just like regular class (methods, constructor, blocks etc) + also ABSTRACT methods.
    But we cannot create objects in abstract, because objects need to be concrete, and abstract is not concrete.
    We also cannot make abstract FINAL, because abstract is meant to be inherited.
    Question: if we cannot create object of an abstract class, why do we need a constructor in that class?
    Answer: every class must contain a constructor. Abstract class has a constructor, but you cannot use it to create
    an object. However, you can use it to call constructor from subclass using super keyword, because we have a rule
    of calling at least one constructor from superclass in subclass when class is inherited.
    IF SUBCLASS of abstract class is also abstract, we don't have to override the abstract method of abstract superclass.
    If subclass is abstract, you can either choose to override or not, compiler doesn't give error if you don't.
    However, if the subclass is not abstract, you get compile error unless you override the abstract methods in abstract
    super class.
    NOTE, for sub class, you ONLY have to override all ABSTRACT methods from abstract super class. If there are any
    other instance methods in the super class, they don't have to be overridden in sub class. But they are still
    inherited in our sub class due to inheritance.
    Shortcut of creating override methods in intelliJ: MAC: alt+enter+enter 2 times.
     Or right click - generate - implementation (or smth). Also if you click on red light bulb, it gives option of
     override implementations.
     */
}
