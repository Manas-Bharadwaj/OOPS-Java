package SingeltonClass;

public class SingletonEg {

    private static SingletonEg instance;

    private SingletonEg(){

    }

    public static SingletonEg getInstance(){
        //check whether only one object is created or not
        if(instance == null){
            instance = new SingletonEg();
        }
        return instance;
    }
}
