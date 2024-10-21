
//signleton
class WashinMachine{
     private WashinMachine(){};

    public static WashinMachine instance=new WashinMachine();

    public static WashinMachine getInstance(){
        return instance;
    }
    void wash(){
        System.out.println("this is singleton ");
    }

}
class user{
    public static void main(String[] args) {

        WashinMachine obj= WashinMachine.getInstance();
        obj.wash();


    }
}