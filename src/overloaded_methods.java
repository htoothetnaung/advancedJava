public class overloaded_methods {

    //overloaded methods = methods that share the same name but have different parameters
    // method name + parameters = method signature
    public static void main(String[] args){

    }

    static int add(int a,int b){
        System.out.println("This is overloaded method #1");
        return a + b;
    }

    // same parameters but different data types
    static double add(double a,double b){
        System.out.println("This is overloaded method #2");
        return a + b;
    }

    // different number of parameters but same name
    static int add(int a,int b, int c){
        System.out.println("This is overloaded method #3");
        return a + b;
    }
}
