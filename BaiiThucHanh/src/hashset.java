import java.until.hashset;
import java.until.Scanner;
public class HashSet {
    public static void main(String[] args ){
        int number;
        HashSetashSet<String> hashSetString = new hashset();
        Scanner scanner = new Scanner(System.in);
         
        hashSetString.add("Tucson");
        hashSetString.add("CX");
        hashSetString.add("Vios");
        hashSetString.add("Lux");
        hashSetString.add("Civic");
        hashSetString.add("Glc");

        System.out.println("Cac phan tu trong hashset");
        System.out.println(hashSetInteger);
        System.out.println("Nhap phan tu can xoa");
        name = Scanner.nextLine();

        if (hashSetString.contain(name)) {
            (hashSetString.remove(name))
            System.out.println("Xoa thanh cong");
            System.out.println("Cac phan tu con lai trong hashSetString");
            System.out.println(hashSetString);
        }
        else{
            System.out.println("Xoa khong thanh cong ");
        }
    }
}