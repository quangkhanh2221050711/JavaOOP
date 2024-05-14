import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class slide38 {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Thêm các phần tử vào LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // In ra danh sách ban đầu
        System.out.println("Danh sách ban đầu:");
        printList(linkedList);

        // Thêm một phần tử vào vị trí đầu tiên của LinkedList
        linkedList.addFirst("Mango");

        // In ra danh sách sau khi thêm vào đầu
        System.out.println("Danh sách sau khi thêm vào đầu:");
        printList(linkedList);

        // Thêm một phần tử vào vị trí cuối cùng của LinkedList
        linkedList.addLast("Grapes");

        // In ra danh sách sau khi thêm vào cuối
        System.out.println("Danh sách sau khi thêm vào cuối:");
        printList(linkedList);

        // Xóa phần tử "Banana" khỏi LinkedList
        linkedList.remove("Banana");

        // In ra danh sách sau khi xóa phần tử "Banana"
        System.out.println("Danh sách sau khi xóa phần tử \"Banana\":");
        printList(linkedList);

        // Sử dụng Iterator để duyệt và in ra các phần tử của LinkedList
        System.out.println("Duyệt danh sách bằng Iterator:");
        iterateAndPrint(linkedList);
    }

    // Phương thức in ra các phần tử của LinkedList
    public static void printList(LinkedList<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
        System.out.println(); // Xuống dòng để phân tách các danh sách
    }

    // Phương thức duyệt và in ra các phần tử của LinkedList bằng Iterator
    public static void iterateAndPrint(LinkedList<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(); // Xuống dòng để phân tách kết quả
    }
}

