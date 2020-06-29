package day52_Collection;

public class Zday52_ClassNotes {
    /*
    06/22/2020
Topics: Collection

package name: day52_Collection

please go to Canvas -> java -> modules - > day52
		download day52 presentation and Collection Hierarchy

Data Structurs: in order to managae the data effeciently and in an organized manner

		-- Array (fixed)
		-- Collection (Dynamic)
		-- Map

Array: size is fixed
	   supports primitives and objects
	   Can be multi-dimensional
	   has index, accept duplicates

	   Arrays.sort(arrayName);
	   Collections.sort()

collections framework:  consists of multiple interfaces, each interfaces has multiple implementations
			all the classes and interfaces are presented in "java.util"

Iterable(I): root interface. super-type of all interfaces in collections framework.

Collection (I):    extended by by List(I), Set(I), Queue(I)

			List(I): implemented by ArrayList(C), LinkedList(C), Vector(C)
					has Index Numbers, accepts duplicates, size is dynamic

				ArrayList(C): array based class. internally uses array
						retrieving data is faster ( get() )

				LinkedList(C): each objects are doubly linked
						doubly linked ==> removing & adding are faster ( remove(), add() )

				Vector(C): array based class, is synchronized. only prefered in muti-thread

						extended by Stack(C): array based class, is synchronized, Last In First Out order
								pop(): LIFO, returns the last object from the stack and removes it from stack


			Queue(I): does not have index numbers, size is dynamic, accepts duplicates, First in first out order

					Poll(): removes the first object in the queue.


			Set(I): does not accept duplicates. does not have index number, size is dynamic
					hashset vs linkedhasset:
									linkedhashset keeps the insertion order as it is
									hashset is faster than linkedhasset

					set is extended by SortedSet(I): sorted set is implemented by TreeSet
							TreeSet(C): does not accept duplicates, and sort the objects

						hashset vs TreeSet:
								hashset accepts null, TreeSet does not accept null
								hashset is faster than TreeSet



null: default value of all reference-type (all non-primitives).
		does not refer to any objects
		it's not instance of anything

		WebElement element;  ==> null
		String str;  ===> null


// List<WebElement> list = driver.findElements(By.xpath(""));



synchronized: used for achieving thread-safety
		advantage: thread safe
		disadvantage: slower

thread-safe: one thread at a time in multi-thread environment

thread: process of operating system scheduling object

multi-thread: two or more thread are being executed


Tasks:
 1. write a program that can remove the duplicated characters from String

 2. write a program that can identify if two strings are build out of the same letters
 		ex:
 			str1 = "abababa"
 			str2 ="ab";

 			output: true

     */
}
