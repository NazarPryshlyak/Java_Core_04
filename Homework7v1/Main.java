package Homework7v1;

/*) �������� ���� Robot �� ����� ��� ����������� CoffeRobot, RobotDancer, RobotCoocker. � Robot � ����� work(), 
 *  � ����� ��� ������� ������ ��� ������ ����� � ������.
� ��� Robot � ����� work() ��� �������� ���, ��� �� ������� ��������� ��������� ����� �� Robot � � ������ �������.
� ��� CoffeRobot � ����� work() ��� �������� ���, ��� �� ������� ��������� ��������� ����� �� CoffeRobot � � ���� ����.
� ��� RobotDancer � ����� work() ��� �������� ���, ��� �� ������� ��������� ��������� ����� �� RobotDancer � � ������ �������.
� ��� RobotCoocker � ����� work() ��� �������� ���, ��� �� ������� ��������� ��������� ����� �� RobotCoocker � � ������ ������.
� �������� � Main ���� ���������� ������������ ����� � ��������� �� ������� � ��� ����� work().
� �������� � Main ���� ����� ����� Robot , ��������� ����� ������������ ������������ �����. �������� ���� for , �������� 
�� ��� ��������� ������ � ��������� ��� ������� ������� ������ ����� work().
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