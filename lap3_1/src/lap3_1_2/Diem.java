package lap3_1_2;

import java.util.Scanner;
import java.lang.Math;

public class Diem {
double x,y;


Scanner sc = new Scanner(System.in);
public void NhapDiem( ) {
	System.out.println("nhap x");
	x = sc.nextInt();
	System.out.println("nhap y");
	y = sc.nextInt();
}
	double DoDai(Diem A, Diem B) {
        return Math.sqrt(Math.pow((B.x - A.x), 2) + Math.pow((B.y - A.y), 2));
	}
}