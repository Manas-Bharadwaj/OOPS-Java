package StaticExample;

class staticVariable {
    int roll_no;
    String name;
    // static var aka class var
    // shared among all objects/instance and store data which is common for all objects
    static String college = "ABC";

    staticVariable(int roll_no,String name){
        this.roll_no = roll_no;
        this.name = name;
    }

    void display(){
        System.out.println(roll_no + " " + name + " " + college);
    }

    public static void main(String[] args) {
        staticVariable ob1 = new staticVariable(1,"john");
        staticVariable ob2 = new staticVariable(2,"jacob");

        ob1.display(); //output - 1 john ABC
        ob2.display(); //output - 1 jacob ABC
    }

}
