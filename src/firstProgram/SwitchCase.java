package firstProgram;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dayofweek=4;
		String dayname;
		
		switch(dayofweek) {
		
		case 1:
			dayname="Monday";
			System.out.println(dayname);
			break;
		case 2:
			dayname="Tuesday";
			System.out.println(dayname);
			break;
		case 3:
			dayname="Wednesday";
			System.out.println(dayname);
			break;
		case 4:
			dayname="Sunday";
			System.out.println(dayname);
			break;
		default:
			System.out.println("Invalid number");
			break;
		}
	}

}
