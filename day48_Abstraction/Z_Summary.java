package day48_Abstraction;

public class Z_Summary {
    /*
    Abstraction:
            hiding the implementation details
            two ways to achieve abstraction:
                1. abstract class
                2. interface
interface:
            is blue print of class
            it is not the class
            it is used to specify the behaviors that a class should implement
            it is the 2nd way to achieve abstraction
            it is 100% abstraction. PURE ABSTRACTION. ONLY for abstraction
            No need to add abstract keyword to interface we create. It is already abstract.
            No need to add abstract keyword to methods created in interface
            ACCESS MODIFIER IS ALWAYS PUBLIC by default
            No need to add public keyword as access modifier: IT IS DEFINITELY PUBLIC IN INTERFACE
            ALL METHODS in INTERFACE are PUBLIC ABSTRACT by default
            PUBLIC is the only access modifier permitted in interface.
            interface can be super type to a class using "implements" keyword
            interface can NOT be super class to a class using "extends" keyword
            Once we implement super type interface we MUST override all the methods in the non-abstract class
            if our class is abstract we don't have to override our abstract methods
            Access modifiers of all overridden methods MUST be public too, of course
            in interface, you can have Only one kind of variable: static final ( by default - no need for final static keywords)
creating class:
            public class className{ }
creating interface:
            public interface interfaceName{ }
            to create it in our package:
                        1. we right click on our package
                        2. we select new --> java class
                        3. from drop menu we select interface (instead of class)
                        4. we type in the name
                        5. hit enter
 class vs interface:
            * class can ONLY EXTEND ONE CLASS ==> can inherit from 1 class only
            * class can IMPLEMENT MULTIPLE INTERFACES ==> can inherit from many interfaces
            * to create class we have to give access-modifier, give abstract keyword
            * to create interface, access-modifier OR abstract keyword are not needed
            * you can create object from class
            * you can not create object from interface
            * in class,  you can have many variables and methods
            * in interface, you can have Only one kind of variable: static final variable
                        can be called from interface name (static) & must be initialized immediately (final)
            * interface can NOT HAVE:
                        instance variables: instance variable belong to object that came from class by using a constructor
                        constructor: ==> can not create object
                        instance methods
                        instance block
                        static block : is used to initialize static variable. Can not here re-initialize final static variable
            * interface can HAVE:
                        static final variable by default
                        abstract method
                        static method
                        default method (can only exist in interface)
     */
}
