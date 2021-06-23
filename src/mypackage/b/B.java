package mypackage.b;

// Need to import class A from package a to be able to use class A
// Note that when importing a package, all the classes and interface of that package will be imported excluding the classes and interfaces of the subpackages.
// As package a is a subclass of mypackage, it gets imported specifically
import mypackage.a.A;

// Alternatively: import all classes from package a
// import mypackage.a.*;

// Note:


public class B {

    // Creating object from class A
    A object1 = new A();

    // Alternatively, if not having imported class A, import by fully qualified name
    mypackage.a.A object2 = new mypackage.a.A();
}