package codingPractice2;

public class OperasiPembagian extends OperasiBilanganAbs {

	@Override
	protected void setA(double a) {
		// TODO Auto-generated method stub
		this.a = a;
	}

	@Override
	protected void setB(double b) {
		// TODO Auto-generated method stub
		this.b = b;
	}

	@Override
	protected void setC() {
		// TODO Auto-generated method stub
		this.c = a / b;
	}

	@Override
	protected double getA() {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	protected double getB() {
		// TODO Auto-generated method stub
		return b;
	}

	@Override
	protected double getC() {
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	protected void tampil() {
		// TODO Auto-generated method stub
		System.out.println("Hasil Pengurangannya adalah: "+ a + " / " + b + " = " + c );
	}

}
