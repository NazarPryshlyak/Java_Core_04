package Animal7v3;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Animal ( " ������� " , 20 , 7  ) ;
		
		animal.viewAnimalInfo( animal.getName(), animal.getSpeed(), animal.getAge()) ;
		
		animal.setName( " ��� " ) ;
		animal.setSpeed( 2 ) ;
		animal.setAge( 14 );
		
		animal.viewAnimalInfo(animal.getName(), animal.getSpeed(), animal.getAge()) ;

	}

}
