<h1>Object Oriented Programming(OOPs)</h1>
<br>
Object-Oriented Programming (OOP) is a programming paradigm based on the concept of objects that contain data (fields) and behavior (methods). It focuses on designing software that closely represents real-world entities.</p>
<ul>
<li>Improves code reusability</li>
<li>Enhances maintainability and scalability</li>
<li>Makes programs easier to understand and manage</li>
<li>Closely models real-world entities</li>
</ul>
<br>
<hr>
<b>Class - logical construct</b> <br>
It's a blueprint or template used to create objects. It defines the properties (data) and behaviors (methods) that objects of that class will have.<br><br>
<b>Object - physical reality</b><br>
It's s an instance of a class that represents a real-world entity. It is used to access the variables and methods defined inside a class.<br>
Eg: Car - Class<br>
    BMW, Audi, etc.... - Objects
<br>
<hr>
<b>Constructor</b><br>
Its's a special member of a class that is automatically invoked when an object is created. It is primarily used to initialize the object's data members and set up the initial state of an object.<br>
<ul>
<li>Constructor name must be the same as the class name.</li>
<li>It does not have any return type, not even void.</li>
<li>It is automatically called when an object is created using the new keyword</li>
<li>Constructors help initialize object properties during object creation.</li>
</ul>
Eg- class car having constructor to initialize car_name, brand, etc...</p><br>
Types of constructors<br>
<ul>
<li>Default Constructor: A constructor that does not accept any parameters and initializes an object with default values.</li>
<li>Parameterized Constructor: A constructor that accepts parameters to initialize an object with specific values.</li>
<li>Copy Constructor: A user-defined constructor that creates a new object by copying the data of another object of the same class.</li>
<li>Private Constructor: A constructor declared with the private access modifier that prevents object creation from outside the class.</li>
</ul><br>
<hr>
<b>Wrapper Classes</b><br>
It allow primitive data types to be represented as objects. This enables primitives to be used in object-oriented features<br>
Why wrapper classes?<br>
Java collections (ArrayList, HashMap, etc.) store only objects, not primitives.<br>
Objects support null values, while primitives do not.<br>
<hr>
<b>Garbage Collection</b><br>
It's an automatic memory management process performed by the JVM.<br> 
It helps in removing unused and unreachable objects from heap memory, which improves memory utilization and application performance.<br><br>
<b>Working</b> 
<ul>
<li>Object Creation : Objects are created in the heap memory when a program runs.</li>
<li>Reference Checking: The garbage collector checks whether objects are still referenced by the program.</li>
<li>Identify Unreachable Objects: Objects without any active reference become unreachable and eligible for garbage collection.</li>
<li>Memory Cleanup: The JVM removes unreachable objects and frees heap memory automatically.</li>
<li>Reuse of Memory: Freed memory can now be reused for creating new objects.</li>
</ul>
<hr>
<b>Packages</b><br>
A package in Java is a mechanism to group related classes, interfaces, and sub-packages into a single unit. Packages help organize large applications, avoid naming conflicts, provide access protection, and make code modular and maintainable.<br>
<ul>
<li>Avoiding name conflicts (two classes with the same name can exist in different packages)</li>
<li>Providing access control using public, protected, and default access</li>
</ul>
Types<br>
<b>In-built</b> - comprise a large number of classes that are part of the Java API.<br>
Eg - java.lang: Contains language support classes(e.g, classes that define primitive data types, math operations)<br>
     java.io: Contains classes for supporting input/output operations.<br>
<b>User Defined</b> - packages that are defined by the user.
<hr>
<b>static keyword</b><br>
The static keyword in Java is used for memory management and belongs to the class rather than any specific instance. It allows members (variables, methods, blocks, and nested classes) to be shared among all objects of a class.<br>
<ul>
<li>Memory is allocated only once when the class is loaded.</li>
<li>No object creation is needed to access static members; use the class name directly.</li>
<li>Static methods and variables can’t access non-static members directly.</li>
<li>Static methods can’t be overridden because they belong to the class, not instances.</li>
</ul>
<hr>
<b>Singleton class</b><br>
It ensures that a class has only one instance throughout the application and provides a global access point to it.<br>
It is mainly used when a single shared object is required, such as database connections, logging, or configuration settings<br><br>
To create singleton class, must follow 3 rules - <br>
<ul>
<li>Private Constructor: Prevents other classes from instantiating the class using the new keyword.</li>
<li>Private Static Variable: Holds the only instance of the class.</li>
<li>Public Static Factory Method: Serves as the global access point to retrieve the single instance.</li>
</ul><br>
<hr>
<b>Principles of OOPS</b><br>
<b>---------------------INHERITANCE------------------------</b><br>
OOPS concept that allows a class to acquire properties and behaviors from another class.<br>
It helps in creating a new class from an existing class, promoting code reusability and better organization.<br>
<ul>
<li>A subclass can reuse the fields and methods of the parent class without rewriting the code</li>
<li>A subclass can add its own fields and methods or modify existing ones to extend functionality.</li>
</ul><br>
<b>Types</b><br>
<ul>
<li><b>Single Inheritance</b> A sub-class is derived from only one super class. It inherits the properties and behavior of a single-parent class, also known as simple inheritance.</li><br>
<li><b>Multilevel Inheritance</b> A derived class will be inheriting a base class and as well as the derived class also acts as the base class for other classes.</li><br>
<li><b>Hierarchical Inheritance</b> more than one subclass is inherited from a single base class. i.e. more than one derived class is created from a single base class. For example, cars and buses both are vehicle</li><br>
</ul><br>
<b>---------------------POLYMORPHISM-----------------------</b><br>
Polymorphism means "many forms"<br>
It allows a single entity to take multiple forms. It enables the same method or interface to behave differently depending on the object involved.<br>Polymorphism improves code flexibility, reusability, and maintainability.<br>
Eg: Consider a person who plays different roles in life, like a father, a husband, and an employee.<br><br>
<b>Types</b><br>
<ul>
<li><b>Compile-Time</b> aka static polymorphism, occurs when the method to be executed is determined during compilation. It is primarily achieved through method overloading.<br>
Method selection occurs at compile time.<br><br>
<b>Method Overloading</b> allows multiple methods with the same name but different parameter lists(diff "type" order),return type within the same class.<br>
The compiler chooses the appropriate method based on the arguments passed.<br><br>
<b>Syntax</b><br>
<pre><code>
class class_name{
    void method_name(param1){}
    void method_name(param1,param2,.......){}
}
</code></pre>
</li>
<li><b>Runtime</b> aka dynamic polymorphism, occurs when the method call is resolved during program execution. It is achieved through method overriding.<br>
Method selection occurs at runtime.<br><br>
<b>Method Overriding</b> occurs when a subclass provides its own implementation of a method already defined in its superclass. The overridden method is selected based on the actual object created.<br><br>
<b>Syntax</b><br>
<pre><code>
class parent{
     void method_name(param....){}
}
class child extends parent{
     @Override
     void method_name(param....){}
}
At runtime, the method that gets executed 
depends on the actual object type, not the reference type.
</code></pre>
</li>
</ul><br>
<b>---------------------ENCAPSULATION-----------------------</b><br>
OOPS concept binds data and methods into a single unit, typically a class. It restricts direct access to data by hiding implementation details.<br>
This ensures controlled interaction with the data through defined methods.<br>
Achieved using: Private data members, Public getter and setter methods<br><br>
<b>Key Rules</b><br>
<ul>
<li><b>Declare data as private:</b> Hide the class data so it cannot be accessed directly from outside the class</li>
<li><b>Use getters and setters:</b> Keep variables private and provide public getter and setter methods for controlled access and safe modification, often with validation.</li>
<li><b>Apply proper access modifiers:</b> Use private for data hiding and public for methods that provide access.</li>
</ul><br>
<b>--------------------ABSTRACTION-----------------------</b><br>
The process of hiding internal implementation details and showing only essential functionality to the user. It focuses on what an object does rather than how it does it.
<ul>
<li>It hides the complex details and shows only essential features.</li>
<li>Abstract classes may have methods without implementation and must be implemented by subclasses.</li>
</ul>
Ways to implement Abstraction - Interface, Abstract classes(Partial Abstraction)<br>
<pre>Eg - The television remote control is the best example of abstraction. 
It simplifies the interaction with a TV by hiding all the complex technology.
We don't need to understand how the TV internally works; 
we just need to press the button to change the channel or adjust the volume.
</pre>
<hr>
