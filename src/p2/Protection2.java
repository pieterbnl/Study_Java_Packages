package p2;

// Following 'The Java Language chap. 9
public class Protection2 extends p1.Protection {

    Protection2() {
        System.out.println("Protection2 constructor derived");

        // System.out.println("a = " + a);   // this variable has no access modifier and can therefore not be accessed outside it's own package

        // System.out.println("a_private = " + a_private); // this variable can't be accessed because it's set to private
        System.out.println("a_protected = " + a_protected);
        System.out.println("a_public = " + a_public);

    }
}