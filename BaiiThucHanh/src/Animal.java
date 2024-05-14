abstract class animal {
    abstract void run();
}
class dog extends animal {
    void run (){
        System.out.println("Gâu Gâu");
    }
    public static void main(String args []) {
        animal obj = new dog();
        obj.run();
    }
}