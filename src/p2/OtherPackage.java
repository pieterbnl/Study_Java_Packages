package p2;

// Following 'The Java Language chap. 9
public class OtherPackage {
    OtherPackage() {
        p1.Protection p = new p1.Protection();
        System.out.println("OtherPackage constructor");

        // System.out.println("a = " + p.a); // this variable has no access modifier and can therefore not be accessed outside it's own package

        // System.out.println("a_private = " + p.a_private); // this variable can't be accessed because it's set to private
        // System.out.println("a_protected = " + p.a_protected);  // this variable has been set to protected and can therefore not be accessed outside it's own package

        System.out.println("a_public = " + p.a_public);
    }
}
