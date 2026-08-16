package principlesOfOOPS;

public class encapsulation {
    private int balance;

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        encapsulation ob = new encapsulation();
        ob.setBalance(20000);
        System.out.println("get balance " + ob.getBalance());
    }
}

