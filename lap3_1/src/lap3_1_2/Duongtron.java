package lap3_1_2;

public class Duongtron extends Diem {
 
	private
    Diem O = new Diem();
    double r;
public
    void NhapDT() {
        System.out.print("Nhap Toa Do Tam: ");
        O.NhapDiem();
        System.out.print("Nhap Ban Kinh: ");
        r = sc.nextDouble();
    }
    double ChuVi() {
        return (2 * 3.14 * r);
    }
    double DienTich() {
        return (3.14 * r * r);
    }
}
