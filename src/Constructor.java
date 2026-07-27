class Constructor {
    int roll_no;
    String name;
    float marks;

    /*
    this keyword - is a reference keyword that points directly to the
    current object executing a non-static method or constructor
    */

    //default constructor
    Constructor(){
        this.roll_no = 1;
        this.name = "manas";
        this.marks = 86.9f;
    }

    // parameterized constructor
    Constructor(int roll_no,String name, float marks){
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    //copy constructor
    Constructor(Constructor other){
        this.roll_no = other.roll_no;
        this.name = other.name;
        this.marks = other.marks;
    }

    // when you want to call a constructor from another constructor, we use this()
    // internally its new Constructor(13,"default",55.7f);
    /*
    Constructor(){
        this(13,"default",55.7f);
    }
     */

    public static void main(String[] args){
        Constructor ob1 = new Constructor(); // default constructor
        System.out.println(ob1.roll_no + " " + ob1.name + " " + ob1.marks); // 1 jacob 86.9

        Constructor ob2 = new Constructor(2,"john",88.9f); // parameterized constructor
        System.out.println(ob2.roll_no + " " + ob2.name + " " + ob2.marks); // 2 john 88.9

        Constructor ob3 = new Constructor(ob2); // copy constructor
        System.out.println(ob3.roll_no + " " + ob3.name + " " + ob3.marks);// 2 john 88.9

        Constructor one = new Constructor();
        Constructor two = one;
        one.name = "change";
        System.out.println(two.name);// change
        // here one and two are referred to the same object
        // so if you change one object , object two will change
    }
}
