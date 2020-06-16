package day46_FinalSpecifier_Abstract;

public class Zday46_ClassNotes {
    /*
    06/01/2020
Topics: final keyword
		OOP abstraction intro


package name: day46_final_abstract


final: constant, cannot be changed

		can only be applied to:
				1. variables: cannot be reassigned

				2. methods: implementation of the method can never be changed
							final methods cannot be override, can be overload
							constructors cannot be final

				3. class: immutable class, cannot be inherited

				 			final class cannot be super class




Canvas -> Java -> modules -> day46 -> Exceptions Short Quiz

due by: 11:25 am


abstraction: hiding the implementation details
		concentrating on essentials things, without worrying about the details

	Ex1:
		Car:
			start();


		BMW:
			start(): Push start button

		Toyota:
			start(): Insert key

	Ex2:
		shape:
			Area();

		circle:
			Area(): r * r * PI

		Square:
			Area(): s * s

		Rectangle:
			Area(): a * b

		Triangle:
			Area(): b * h * 1/2



abstract method: a method without body/implementation
				 a method that's meant to be override (cannot be final, static, private)


	 public abstract void method();


two ways of achiving abstraction:
		1. abstract class
		2. Interface


abstract class: a class that's meant to be inherited (can not be final)
				we cannot create objects from abstract class


Thursday: abstraction continue


     */
}
