package Homework7v2;

public class Колесо {

	private double розмір ;
	private String тип ;

	public Колесо( double розмір , String тип ) {
		this.тип = тип;
		this.розмір = розмір;
	}
	
	public double розмір ( int coeff ) {
		double newрозмір = this.розмір * coeff ;
		return newрозмір ;
	}

	public double getРозмір() {
		return розмір;
	}

	public void setРозмір(double розмір) {
		this.розмір = розмір;
	}

	public String getТип() {
		return тип;
	}

	public void setТип(String тип) {
		this.тип = тип;
	}

	@Override
	public String toString() {
		return "Колесо [розмір=" + розмір + ", тип=" + тип + "]";
	}
}
	