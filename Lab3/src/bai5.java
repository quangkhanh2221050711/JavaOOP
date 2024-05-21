import java.until;
class sinhvien {
    private String msv,ten,lop;
    Scanner sc = new scanner(System.in);
    public sinhvien;
    public String getTen(){
        return ten;
    }
    public String getMsv(){
        return msv;
    }
    public String getLop(){
        return lop;
    }
    public void Nhap(){
        System.out.println("Nhap ma sinh vien");
        msv = sc.nextLine();
        System.out.println("Nhap ten sinh vien");
        ten = sc.nextLine();
        System.out.println("Nhap lop cua sinh vien");
        lop = sc.nextLine();
    }
    public void in(){
        System.out.println("Ma sinh vien :" +msv);
        System.out.println("Ten sinh vien :" +ten);
        System.out.println("Lop cua sinh vien :" +lop);
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("So sinh vien ban muon nhap la");
        ArrayList<sinhvien> arr = new ArrayList<>();
        
    
    }



    
}
