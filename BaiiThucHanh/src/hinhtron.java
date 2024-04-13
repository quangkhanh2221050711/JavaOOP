public class HinhTron{
    public void xuatThongTin(){
        System.out.println("Đây là Hình Tròn");
    }
}
public class HinhTru extends HinhTron {
    @Override
    public void xuatThongTin(){
        System.out.println("Đây là hình Trụ")
    }
}