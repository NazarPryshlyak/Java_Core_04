package Homework7v2;

public class Кермо {

	private double діаметр ;
	private String матеріал ;

	public Кермо(double діаметр , String матеріал ) {
		this.діаметр = діаметр;
		this.матеріал = матеріал;
	}
    public double halfКермодіаметр () {
		double newдіаметр = this.діаметр / 2 ;
    	return newдіаметр;
    	
    }
	
	public double getДіаметр() {
		return діаметр;
	}

	public void setДіаметр(double діаметр) {
		this.діаметр = діаметр;
	}

	public String getМатеріал() {
		return матеріал;
	}

	public void setМатеріал(String матеріал) {
		this.матеріал = матеріал;
	}

	@Override
	public String toString() {
		return "Кермо [діаметр=" + діаметр + ", матеріал=" + матеріал + "]";
	}
}
