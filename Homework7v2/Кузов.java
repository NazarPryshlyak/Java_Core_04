package Homework7v2;

public class Кузов {

	
	private String колір ;

	public Кузов( String колір ) {
		this.колір = колір;
	}
	
	public String getКолір() {
		return колір;
	}
	public void setКолір(String колір) {
		this.колір = колір;
	}

	@Override
	public String toString() {
		return "Кузов [колір=" + колір + "]";
	}

}
