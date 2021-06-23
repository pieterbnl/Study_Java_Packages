package p1;

// Following 'The Java Language chap. 9
public class Derived extends Protection {

    Derived() {
        System.out.println("Derived constructor");
        System.out.println("a = " + a);

        // System.out.println("a_private = " + a_private); // this variable can't be accessed because it's set to private
        System.out.println("a_protected = " + a_protected);
        System.out.println("a_public = " + a_public);
    }

}