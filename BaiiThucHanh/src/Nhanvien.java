import java.util.Scanner;
class NhanVien {
    int loai;
    int soGioLam;
    linh == 1;
    sep == 2;
    thoiVu == 3;
 
    public NhanVien(int loai, int soGioLam) {
        this.loai = loai;
        this.soGioLam = soGioLam;
    }
    public double tinhLuong() {
        if (loai.equals("1")) {
            if (soGioLam > 0) {
                return 10000000 + soGioLam * 800000; 
            } else {
                return 10000000; 
            }
        if (loai.equals("2")){
            if (soGioLam > 0) {
                return 20000000 + soGioLam * 800000;
            } else {
                return 20000000;
            }
        }   
        } else if (loai.equals("thoiVu")) {
            return soGioLam * 100000; 
        }
        return 0;
    }
}

// Lớp chính
public class TinhLuongNhanVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin từ người dùng
        System.out.println("Nhập loại nhân viên (1 ,2 hoặc 3):");
        int loai = scanner.nextInt();

        System.out.println("Nhập số giờ làm việc:");
        int soGioLam = scanner.nextInt();
        NhanVien nhanVien = new NhanVien(loai, soGioLam);

    
        double luong = nhanVien.tinhLuong();
        System.out.println("Lương của nhân viên là: " + luong);
        
        scanner.close();
    }
}
