package StaticExample;

class staticMethod {
    // static method belongs to the class rather than object
    // there is no need to create an instance/object to access it
    /*
      Can access only static data directly.
      Cannot access instance variables or methods directly.
      Cannot use this or super keywords.
     */
    static void display1(){
        System.out.println("hello from static method");
    }

    //non-static needs object/instance to be created to access
    void display2(){
        System.out.println("hello from non-static method");
    }

    public static void main(String[] args) {
        // static method accessed
        display1();// output - hello from static method

        staticMethod ob = new staticMethod();
        // non-static method accessed
        ob.display2();// output - hello from non-static method
    }
}
