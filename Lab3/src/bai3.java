class SinhVien {
    private String fullName;
    private float score;

    public String getFullName() {
        return this.fullName;
    }

    public float getScore() {
        return this.score;
    }

    boolean nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        sc.skip("\\R?");
        this.fullName = sc.nextLine().trim();

        if (this.fullName.length() == 0) return false;

        System.out.print("Nhap diem: ");
        this.score = sc.nextInt();

        return true;
    }

    void inThongTin() {
        System.out.println("Ho ten: " + this.fullName);
        System.out.println("Diem: " + this.score);
    }
}