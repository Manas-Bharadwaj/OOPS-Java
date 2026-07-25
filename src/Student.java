/*create a class
  syntax - class class_name{
               attributes/variables
               constructors
               methods
           }
 */
class Student{
    int roll_no;
    String name;
    float marks;

    static void main(String[] args) {

        /*create an object
          syntax - type variable = new constructor();
         */
        Student student1; // compile time(stored in stack memory)
        student1 = new Student();// runtime(stored in heap memory)
        System.out.println(student1);
    }
}
