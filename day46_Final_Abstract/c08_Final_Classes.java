package day46_Final_Abstract;
/*
    3. Classes: Final Classes = Immutable class can NOT be inherited
                final class can not be super class = compiler error
 */
class Data{

}

public final class c08_Final_Classes extends Data{ // can not extend class Data if class Data was final. But sub class can be final

    // We all know that String is immutable
    // Any time class is declared as final = can not be inherited (can NOt be super class)

    // class Data2 extends c08_Final_Classes{ }     // final class Final_Classes can not be

}