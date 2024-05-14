import java.util.ArrayList;
import java.util.Scanner;

public class Nhapvatimsomax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> songuyen = new ArrayList<Integer>();
        System.out.println("Nhập các số nguyên (nhập -1 để kết thúc):");
        int input;
        while ((input = scanner.nextInt()) != -1) {
            songuyen.add(input);
        }
        int somax = somax(songuyen);

        System.out.println("Phần tử lớn nhất trong ArrayList là: " + somax);

        scanner.close();
    }
        int somax = list.get(0); 

        
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > somax) {
                somax = list.get(i);
            }
        }

        return somax;
    }
}
