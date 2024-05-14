import java.until.ArrayList
public class color {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>(3);
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("green");
        colors.remove("green");
        colors.add("orange");
        colors.add("pink");

        System.out.println(colors.get(1));
        System.out.println(colors.contains("orange"));
        System.out.println(colors.size());
        System.out.println(colors);
    }
}