package Homework7v2;

public class ������ {

	private double ����� ;
	private String ��� ;

	public ������( double ����� , String ��� ) {
		this.��� = ���;
		this.����� = �����;
	}
	
	public double ����� ( int coeff ) {
		double new����� = this.����� * coeff ;
		return new����� ;
	}

	public double get�����() {
		return �����;
	}

	public void set�����(double �����) {
		this.����� = �����;
	}

	public String get���() {
		return ���;
	}

	public void set���(String ���) {
		this.��� = ���;
	}

	@Override
	public String toString() {
		return "������ [�����=" + ����� + ", ���=" + ��� + "]";
	}
}
	