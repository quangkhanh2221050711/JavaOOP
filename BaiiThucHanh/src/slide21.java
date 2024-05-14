import java.until.Arraylist;
public class ArrayList {
    public static void main(String[] args){
        ArrayList<Integer> songuyen = new ArrayList<Integer>();
        songuyen.add(23);
        songuyen.add(8);
        songuyen.add(65);
        songuyen.add(54);
        songuyen.add(100);
        songuyen.remove(8);
        songuyen.add(20);

        System.out.println("Cac so nguyen co trong arraylist la :");
        for(Integer songuyen : songuyen){
            System.out.println(so nguyen);
        }
    }
}
