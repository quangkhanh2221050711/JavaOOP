import java.util.Scanner;

public class employee {
     protected int id;

    public employee(String name,  String age, String address, int id){
        super(name , age , address);
        this.id = id;
    }

    public employee(){
        super();
        id = 123;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap id nhan vien : ");
        id = sc.nextInt();
    }

    public void in(){
        super.inThongTin();
        System.out.println("Id : " + id);
    }
}

// part time : luong theo gio , so ngay lam trong thang
// full time : luong cung , phu cap
    
