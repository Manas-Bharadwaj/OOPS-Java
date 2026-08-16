package principlesOfOOPS;

//compile-time example
class compileTime {
    static int add(int x,int y){
        return x + y;
    }
    static int add(int x,int y,int z){
        return x + y + z;
    }
}

//runtime example
class parent{
    void display(){
        System.out.println("parent class");
    }
}
class child extends parent{
    @Override
    void display(){
        System.out.println("child class");
    }
}

public class polymorphism {
    public static void main(String[] args) {

        System.out.println("compile-time polymorphism");
        System.out.println("Method 1- " + compileTime.add(2,3));
        System.out.println("Method 2- " + compileTime.add(2,3,4));

        System.out.println("runtime polymorphism");
        parent ob1 = new parent();
        parent ob2 = new child();
        ob1.display();
        ob2.display();
    }
}
