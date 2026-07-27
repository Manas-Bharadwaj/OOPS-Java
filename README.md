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