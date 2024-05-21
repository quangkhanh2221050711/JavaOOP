import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Nhap day so nguyen: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; ++i){
            int num = sc.nextInt();
            arr.add(num);
        }
        int maxx = -1;
        for(int value : arr)
            maxx = Math.max(maxx, value);
        System.out.println("So nguyen lon nhat la : " + maxx);

        ArrayList<Integer> tmp = new ArrayList<>();
        System.out.print("So nguyen muon xoa : ");
        int num = sc.nextInt();
        tmp.add(num);
        arr.removeAll(tmp);

        Collections.sort(arr);
        System.out.println("Day so nguyen la :")
        System.out.println(arr);
    }