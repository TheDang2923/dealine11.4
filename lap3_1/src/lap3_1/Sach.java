package lap3_1;

import java.util.Scanner;

public class Sach {
	
 private String ma,ten,tg,loai, nxb;
 private int trang,tap,gia; 
 
Scanner sc = new Scanner(System.in);
 public void NHAPSACH() {
	 System.out.println("nhapp thong tin sach");
	 System.out.println("nhapp ma sach");
	 ma = sc.next();
	 System.out.println("nhapp ten sach");
	 ten = sc.next();
	 System.out.println("nhapp tac gia ");
	 tg = sc.next();
	 System.out.println("nhapp nxb");
	 nxb = sc.next();
	 System.out.println("nhapp so trang");
	 trang = sc.nextInt();
	 System.out.println("nhapp loai sach");
	 loai = sc.next();
	 System.out.println("nhapp  so tap	");
	 tap = sc.nextInt();
	 System.out.println("nhapp gia ban");
	 gia = sc.nextInt();
 }
public void INSACH() { 
	System.out.println("Ma sach "+ma);
	System.out.println("ten sach " +ten);
	System.out.println("tac gia " +tg);
	System.out.println("nha xuat ban " +nxb);
	System.out.println("loai " + loai);
	System.out.println("so trang "+ trang);
	System.out.println("so tap "+tap);
	System.out.println("gia ban "+ gia);
}



}
