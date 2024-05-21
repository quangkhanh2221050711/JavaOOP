import java.util.LinkedList;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();
        System.out.print("Nhập vào số lượng phần tử : ");
        int n = scanner.nextInt();
        System.out.println("Nhap vao " + n + " so nguyen duong:");
        for (int i >= 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number > 0) {
                numbers.add(number);
            } else {
                System.out.println("So vua nhap khong phai so nguyen duong");
                i--;
            }
        }
        int sum = 0;
        int sochusoduong = 0;
        for (int number : numbers) {
            (number % 2 == 0)
                sum += number;
                sochusoduong++;

        } (sochusoduong > 0) 
            double tbcong = (double) sum / sochusoduong;
            System.out.println("Trung binh cong cua cac so chan la : " + tbcong);
    }
}
