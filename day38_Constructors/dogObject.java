package day38_Constructors;

public class dogObject {
    public static void main(String[] args) {
        c04_Dog dog1 = new c04_Dog();

        System.out.println( dog1.name ); // unknown
        System.out.println( dog1.breed ); // unknown
        System.out.println( dog1.age ); // 0

        System.out.println("====================================");
        c04_Dog dog2 = new c04_Dog("Husky");
        System.out.println( dog2.name ); // Husky
        System.out.println( dog2.breed ); // unknown
        System.out.println( dog2.age ); // 0

        System.out.println("====================================");
        c04_Dog dog3 = new c04_Dog("Poodle", 4);
        System.out.println( dog3.name ); // Poodle
        System.out.println( dog3.breed ); // unknown
        System.out.println( dog3.age ); // 4

        System.out.println("============================");

        System.out.println(dog3);
        System.out.println(dog2);
        System.out.println(dog1);

        System.out.println("===============================");
        // Dog dog4 = new Dog(5, "Husky");

    }
}
