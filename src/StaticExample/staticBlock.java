package StaticExample;

class staticBlock {

    /*
      it's executed only once when the class is first loaded into memory.
      often used to initialize static variables or
      perform configuration tasks before the main method executes.
     */
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {

        System.out.println("Main method");
        /*
          output - static block
                   Main method
         */
    }
}
