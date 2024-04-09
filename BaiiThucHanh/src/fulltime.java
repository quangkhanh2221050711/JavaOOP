package Person;
import java.util.*;
public class fulltime extends employee{

    private int luongCung, phuCap;
    private long luong;

    public fulltime(String name, String age, String address , int id, int luongCung, int phuCap){
        super(name , age , address , id);
        this.luongCung = luongCung;
        this.phuCap = phuCap;
    }

    public fulltime(){
        super();
        luongCung = 150000;
        phuCap = 1000000;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap luong cung : ");
        luongCung = sc.nextInt();
        System.out.print("Nhap phu cap : ");
        phuCap = sc.nextInt();
    }

    public void tinhLuong(){
        luong = this.luongCung + this.phuCap;
    }

    public void in(){
        super.in();
        tinhLuong();
        System.out.println("Luong nv part time : " + this.luong);
        System.out.println("---------------------------------");
    }
}