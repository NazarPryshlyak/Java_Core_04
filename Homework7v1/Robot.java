package Homework7v1;

public class Robot {
	
	private String name ;
	private String act ;
	
	public Robot ( String name, String act) {
		this.name = name ;
		this.act = act ;
	}
	
	public Robot () {
		this.name = " Robot " ;
		this.act = " ������ ������ " ;
	}
	
	public void work () {
		System.out.println( " � " + this.name + " - � " + this.act + "!" ) ;
	}
}
