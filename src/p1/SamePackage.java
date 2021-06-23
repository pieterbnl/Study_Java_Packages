package p1;

// Following 'The Java Language chap. 9
public class SamePackage {

    SamePackage() {
        Protection p = new Protection();
        System.out.println("SamePackage constructor");
        System.out.println("a = " + p.a);

        // System.out.println("a_private = " + p.a_private); // this variable can't be accessed because it's set to private
        System.out.println("a_protected = " + p.a_protected);
        System.out.println("a_public = " + p.a_public);
    }
}
