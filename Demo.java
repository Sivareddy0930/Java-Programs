import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;



class A{
    public void print(){
        System.out.println("Base");
    }
}
class B extends A{
    public void print(){
        System.out.println("Derived");
    }
}


class Demo {
    public static void doPrint(A obj){
       obj.print();
    }

    public static void main(String[] args) {
        A x=new A();
        A y=new B();
        B z=new B();
        doPrint(x);
        doPrint(y);
        doPrint(z);

    }
}