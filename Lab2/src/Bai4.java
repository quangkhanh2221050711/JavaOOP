import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap so nguyen n :");
        n = sc.nextInt();
        switch (n) {
            case 1: System.out.println("thu 2"); 
                break;
            case 2: System.out.println("thu 3");    
                break;
            case 3: System.out.println("thu 4");
                break;
            case 4: System.out.println("thu 5");
                break;
            case 5: System.out.println("thu 6"); 
                break;
            case 6: System.out.println("thu 7");    
                break;
            default: System.out.println(" khong la ngay nao");
                break;
        }while(Ngay>0&&Ngay<8);
    }
}
