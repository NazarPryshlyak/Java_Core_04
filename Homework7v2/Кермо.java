package Homework7v2;

public class ����� {

	private double ������ ;
	private String ������� ;

	public �����(double ������ , String ������� ) {
		this.������ = ������;
		this.������� = �������;
	}
    public double half����������� () {
		double new������ = this.������ / 2 ;
    	return new������;
    	
    }
	
	public double getĳ�����() {
		return ������;
	}

	public void setĳ�����(double ������) {
		this.������ = ������;
	}

	public String get�������() {
		return �������;
	}

	public void set�������(String �������) {
		this.������� = �������;
	}

	@Override
	public String toString() {
		return "����� [������=" + ������ + ", �������=" + ������� + "]";
	}
}
