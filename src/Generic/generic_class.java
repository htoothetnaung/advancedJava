package Generic;

public class generic_class <Thing> {
//    You can also set more than one genric Types by <Thing, thing2>
    Thing x;

    generic_class(Thing x){
        this.x = x;
    }

    public Thing getValue(){
        return x;
    }
}
