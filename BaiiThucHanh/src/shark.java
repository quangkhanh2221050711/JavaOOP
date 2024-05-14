interface animal2{
    public void run();
}
public class shark implements animal2{
    public void run(){
        System.out.println("hello");
    }
    public static void main ( String args []){
        shark obj = new shark();
        obj.run();
    }
}
