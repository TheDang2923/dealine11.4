package lap3_1_2;

import java.util.Scanner;

public class tamGiac extends Diem {

	Diem A = new Diem();
	Diem B = new Diem();
	Diem C = new Diem();
    public
	        Scanner sc = new Scanner(System.in);
	        void NhapTG() {
	            A.NhapDiem();
	            B.NhapDiem();
	            C.NhapDiem();
	        }
	        boolean KiemTra() {
	            if(DoDai(A,B) + DoDai(B,C) > DoDai(C,A) && DoDai(B,C) + DoDai(C,A) > DoDai(A,B) 
	            && DoDai(C,A) + DoDai(A,B) > DoDai(B,C)) return true;
	            else return false;
	        }
	        double ChuVi() {
	            return (DoDai(A,B) + DoDai(B,C) + DoDai(C,A));
	        }
	        double DienTich() {
	            double p = ((DoDai(A,B) + DoDai(B,C) + DoDai(C,A)) / 2);
	            return Math.sqrt(p * (p - DoDai(A,B)) * (p - DoDai(B,C)) * (p - DoDai(C,A)));
	        
	}
}
