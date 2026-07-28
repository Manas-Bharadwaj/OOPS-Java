class garbageCollector {
    final int num = 10;
    String name;


    public garbageCollector(String name){
        System.out.println("object created");
        this.name = name;
    }

    // Before destroying an object, the garbage collector calls
    // the finalize() method to perform cleanup activities.
    @Override
    protected void finalize() throws Throwable{
        System.out.println("object distroyed");
    }
    // finalize() method is deprecated since Java 9 because
    // it is unpredictable and can cause performance issues.

    public static void main(String[] args){
        garbageCollector obj;

        for(int i=0;i<1000000000;i++){
            obj = new garbageCollector("random"); // output - object distroyed
        }
    }
}

