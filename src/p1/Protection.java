package p1;

// Following 'The Java Language chap. 9
public class Protection {

    int a = 1;
    private int a_private = 2;
    protected int a_protected = 3;
    public int a_public = 4;

    public Protection() {
        System.out.println("Protection (base) constructor");
        System.out.println("a = " + a);
        System.out.println("a_private = " + a_private);
        System.out.println("a_protected = " + a_protected);
        System.out.println("a_public = " + a_public);
    }

}