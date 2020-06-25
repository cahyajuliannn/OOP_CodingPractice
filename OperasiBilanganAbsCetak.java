package codingPractice2;

import java.util.InputMismatchException;
import java.util.Scanner;

final class OperasiBilanganAbsCetak {

	private static void cetaksemua(OperasiBilanganAbs OBA, double a, double b) {
		OBA.setA(a);
		OBA.setB(b);
		OBA.setC();
		OBA.tampil();
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		double y = 0;
		try {
			System.out.print("Enter the first number: ");
			x = sc.nextInt();
			System.out.print("Enter the second number: ");
			y = sc.nextInt();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Exception" + e);
		} finally {
				OperasiPenjumlahan jumlah = new OperasiPenjumlahan();
				cetaksemua(jumlah, x, y);
				OperasiPengurangan kurang = new OperasiPengurangan();
				cetaksemua(kurang, x, y);
				OperasiPerkalian kali = new OperasiPerkalian();
				cetaksemua(kali, x, y);
				OperasiPembagian bagi = new OperasiPembagian();
				cetaksemua(bagi, x, y);
		}
	}

	public static void main(String[] args) {
		OperasiBilanganAbsCetak o = new OperasiBilanganAbsCetak();
		o.input();
	}
}