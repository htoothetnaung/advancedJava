package Generic;
public class generic {
    public static void main(String[] args) {
        /*
        generics = enables types (classes and interfaces)to be parameters when defining
        classes, interfaces, and methods
        a benefit is to eliminate the need to create multiple versions of
        methods or classes for various data types
        use 1 version for all reference data types
         */

//        reference data types
        Integer[] intArray = {1, 2, 3, 4};
        Double[] doubleArray = {1.1, 2.3, 3.2, 4.5, 5.6};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"Bye", "Bye"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);

        System.out.println(getFirst(intArray));

    }

    //    Generic methods >> Thing (meaning it can be anything)
    public static <Thing> void displayArray(Thing[] array){
        for (Thing x: array){
            System.out.print(x +" ");
        }
        System.out.println();
    }

    public static <T> T getFirst(T[] array){
        return array[0];
    }


}
