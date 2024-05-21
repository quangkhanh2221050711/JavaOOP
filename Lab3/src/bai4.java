import java.out.Hashset;
import java.out.Scanner;
public class bai4 {
    public static void main(String[] args) {
        String qua;
        HashSet<String> HashSetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap loai trai cay :");
        System.out.println(HashSetString);
        qua = scanner.nextString();
        String kt;
        System.out.println("Nhap phan loai trai cay can kiem tra");\
        System.out.println(kt);
        if(!HashSetString.contain(qua)){
            System.out.println("khong tim thay");
            System.out.println(qua);
        }
        else{
            System.out.println("Tim thay");
        }
        System.out.println("Nhap phan tu can xoa");
        System.out.println(qua);
        if(!HashSetString.contain(qua));
        HashSetString.remove(name);{
            System.out.println("Xoa thanh cong");
            System.out.println(qua);
            System.out.println('cac loai trai cay con lai la :');
        }
        else{
            System.out.println("Xoa khong thanh cong");
            
        }

    }
    
}
