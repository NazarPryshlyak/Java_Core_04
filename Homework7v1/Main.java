package Homework7v1;

/*) —творити клас Robot в≥д €кого сл≥д унасл≥дувати CoffeRobot, RobotDancer, RobotCoocker. ¬ Robot Ї метод work(), 
 *  в €кому сл≥д описати роботу €ку виконуЇ кожен з робот≥в.
Х ƒл€ Robot в метод≥ work() сл≥д написати код, щоб на консоль виводивс€ наступний текст Ђя Robot Ц € просто працююї.
Х ƒл€ CoffeRobot в метод≥ work() сл≥д написати код, щоб на консоль виводивс€ наступний текст Ђя CoffeRobot Ц € варю кавуї.
Х ƒл€ RobotDancer в метод≥ work() сл≥д написати код, щоб на консоль виводивс€ наступний текст Ђя RobotDancer Ц € просто танцююї.
Х ƒл€ RobotCoocker в метод≥ work() сл≥д написати код, щоб на консоль виводивс€ наступний текст Ђя RobotCoocker Ц € просто готуюї.
Х —творити в Main клас≥ екземпл€ри вищеописаних клас≥в ≥ викликати до кожного з них метод work().
Х —творити в Main клас≥ масив класу Robot , заповнити масив екземпл€рами вищеописаних клас≥в. —творити цикл for , пройтись 
по вс≥х елементах масиву ≥ викликати дл€ кожного елемент масиву метод work().
*/
 
public class Main {

	
	public static void main(String[] args) {
		
	Robot robot = new Robot () ;
	CoffeRobot coffeRobot = new CoffeRobot () ;
	RobotCoocker robotCoocker = new RobotCoocker () ;
	RobotDancer robotDancer = new RobotDancer () ;
	
	robot.work();
	coffeRobot.work();
	robotDancer.work();
	robotCoocker.work();
	
	System.out.println();
	
	Robot [] robotArray = new Robot [4] ;
	robotArray[0] = robot ;
	robotArray[1] = coffeRobot ;
	robotArray[2] = robotCoocker ;
	robotArray[3] = robotDancer ;
	
	for ( int i = 0; i < robotArray.length ; i++ ) {
		robotArray[i].work();
	}
			
	

	
	}
}