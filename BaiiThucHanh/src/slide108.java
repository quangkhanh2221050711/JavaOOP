import java.util.TreeMap;

public class slide108 {

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Alice", 85);
        treeMap.put("Bob", 70);
        treeMap.put("Charlie", 90);
        System.out.println("TreeMap ban đầu: " + treeMap);

        String key = "Bob";
        int newValue = 75;
        if (treeMap.containsKey(key)) {
            treeMap.put(key, newValue);
            System.out.println("gia tri voi khoa '" + key + "' duoc thay bang : " + newValue);
        } else {
            System.out.println("Khong tim thay khoa '" + key + "' trong TreeMap :");
        }
        System.out.println("TreeMap sau khi thay the : " + treeMap);
    }
}
