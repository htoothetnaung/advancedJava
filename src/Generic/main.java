package Generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {

        generic_class<Integer> myInt = new generic_class<>(1);
        generic_class<Double> myDouble = new generic_class<>(3.14);
        generic_class<Character> myChar = new generic_class<>('@');
        generic_class<String> myString = new generic_class<>("hello");

//
//         arrayList accpets only one generic data types
        ArrayList<String> myFriends = new ArrayList<>();
//Hash map accepts two generic data types
        HashMap<Integer, String> users = new HashMap<>();

        /*
        Bounded types = you can create the objects of a generic class to have data
        of specific derived types ex: Number

        public class GenericClass<Thing extends Number, Thing2 extends >
        Meaning >> we can only use subclasses under Number class (String,Character) no longer supported
         */
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

    }
}
