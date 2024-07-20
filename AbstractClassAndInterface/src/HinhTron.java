public class HinhTron extends Hinh{
    int banKinh;

    public HinhTron(String name, int banKinh) {
        super(name);
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich() {
        double s = 3.14 * banKinh * banKinh;
        return s;
    }

    @Override
    public double tinhChuVi() {
        return 0;
    }
}


