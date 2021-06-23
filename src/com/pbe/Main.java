package com.pbe;

// import graphics.Rectangle;
import graphics.*;

/** Study on Java Object Oriented Programming: packages & interfaces
 @author Pieter Beernink
 @version 1.0
 @since 1.0
 */

// NOTE
// All classes in this project are for information only. Not for actual running. Just for informative purposes only.

// *********************
// PACKAGES
// *********************
// Packages are containers for classes, used to keep the class name space compartmentalized.
// To make types (read: classes & interfaces) easier to find and use, to avoid naming conflicts, and to control access, groups of related types are bundled into packages.
// Packages are stored in a hierarchical manner and are explicitly imported into new class definitions.

// Packages are both a naming and a visibility control mechanism.
// Packages can contain class members that are not exposed to other members of the same package.
// This way classes can have knowledge of each other, without being exposed to the rest of the world.

// Packages are created with the 'package' command: 'package pkg;' where pkg is the package name.
// More than one file can include the same package statement.

// It is possible to create a hierarchy of packages: 'package pkg1.pkg2.pkg3;'
// A package hierarchy must be reflected in the file system of the Java development system.
// Meaning package a.b.c. must be stored in a\b\c (assuming Windows)
// A package cannot be renamed without renaming the directory in which the classes are stored.
// Note that importing 'java.awt.*;' imports all the types in the java.awt package,
// but does NOT import java.awt.color or java.awt.font or any other java.awt.xxx packages.
// To use those packages, they must be imported separately: 'import java.awt.color.*;'

// Java run-time system knows where to look for packages:
// 1. By using it's current working directory as starting point, as default.
// 2. By having a directory path or paths specified by setting the CLASSPATH environmental variable.
// 3. By using the -classpath option with java and javac to specify the path to the classes.
// Note: as per JDK9, a package can be part of a module and as such be found on the module path.

// Setting the CLASSPATH variable in Windows:
// set CLASSPATH=C:\users\username\java\classes

// The package statement ('package pkg') must be the first line in the source file.
// There can be only one package statement in each source file, and it applies to all types in the file.
// If no package statement is used, the type ends up in an unnamed package. This should be prevented.

// Types that comprise a package are known as 'package members'.

// To use a public package member from outside its package, do one of the following (depending on the situation):
// 1. Refer to the member by its fully qualified name
// This is needed when the package is not imported and okay for infrequent use. With frequent use: use import.
// 2. Import the package member: 'import graphics.Rectangle;'
// When using just a few members. Otherwise import the complete package.
// 3. Import the member's entire package: 'import graphics.*;'
// Unlikely but possible: more risk of naming collisions.

// As shown above, to import all the types contained in a particular package, use the import statement with the asterisk (*) wildcard character.
// This also allows public nested classes of an enclosing class to be imported.

// Overall, adding classes that belong together to a package:
// - Makes it easier to determine that these classes are related
// - Makes it easier to find classes that provide certain functionality
// - Prevent naming conflicts with the name types in other package as the package creates a new namespace
// - Allow types within the package to have unrestricted access to one another yet still restrict access for types outside the package

// Naming conventions
// - Package names are to be written in all lower case to avoid conflict with the names of classes or interfaces.
// - Use a reversed company internet domain name to begin a package names.
// For example: com.example.mypackage for a package named mypackage created by the company example.com.
// - Name collisions occurring within a single company are to be handled by convention within that company.
// For example by including the region or the project name after the company name (com.example.region.mypackage).
//- Packages in Java itself begin with java. or javax.
//- For domain names that contain special characters or start with a digit, use an underscore instead for those characters.

// Name ambiguities
// If two packages are imported that have an identical class name, you have to use the members fully qualified name to indicate
// exactly which class you want to use. For example 'Rectangle rect' or 'graphics.Rectangle rect'.

// Static import statement
// Rather than having to prefix the name of classes over and over it's possible to import the constants and static methods that are frequently used.
// For example: double r = Math.cos(Math.PI * theta);
// Can be simplified by importing the Math.PI class as static: 'import static java.lang.Math.PI;'
// Once imported, the static members can be used without qualification. For example: double r = cos(PI * theta);
// Use of static does make code more difficult to read and maintain, because it's hard to know which class defines a particular static object.

// Packages and Member access
// Classes and packages are both means of encapsulating and containing the name space and scope of variables and methods.
// Packages act as containers for classes and subpackages.
// Classes, Java's smallest unit of abstraction, act as containers for data and code.
// Java knows four categories of visibility for class members:
// 1. Subclasses in the same package
// 2. Non-subclasses in the same package
// 3. Subclasses in different packages
// 4. Classes that are neither in the same package nor subclasses

// Private: Anything declared private cannot be seen outside of its class
// Public: Anything declared public can be accesses from different classes and different packages
// Protected: Visible to (sub)classes in own package as well as different package subclasses.
// No modifier: Members without a specific access specification (private, protected, public) is visible to (sub)classes in the same package. This is the default.


public class Main {

    public static void main(String[] args) {

        // Using qualified name to create an instance of graphics.Rectangle:
        graphics.Rectangle myRect = new graphics.Rectangle();

        // Importing a package member: import graphics.Rectangle;
        // To directly call the Rectangle class
        Rectangle myRectangle = new Rectangle();

        // Importing an entire package: import graphics.*
        // To directly call any class that's part of the graphics package.
        Circle myCircle = new Circle();
        Point myPoint = new Point();

    }
}