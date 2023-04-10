package lap3_1_2;

public class test {
public static void main(String[] args) {
        tamGiac ABC = new tamGiac();
        ABC.NhapTG();
        if(ABC.KiemTra()) System.out.println("ABC la Tam Giac");
        else System.out.print("ABC Khong Phai Tam Giac");
        System.out.println("Chu Vi Tam Giac la:" + ABC.ChuVi()); 
        System.out.println("Dien Tich Tam Giac la:" + ABC.DienTich()); 

        Duongtron O = new Duongtron();
        O.NhapDT();
        System.out.println("Chu Vi Duong Tron la:" + O.ChuVi()); 
        System.out.println("Dien Tich Duong Tron la:" + O.DienTich()); 
    }
}

