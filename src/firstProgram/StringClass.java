package firstProgram;

public class StringClass {

	int a=10;
	int b=20;
	int result;
	
	public void calc() {
		
		result=a+b;
		System.out.println(result);
		
	}
	public static void main(String[] args) {
		
		StringClass obj = new StringClass();
		obj.calc();
		//str ="World";
		/*System.out.println(str);
		
		//System.out.println(str.length());
		
		int index = str.indexOf('e');
		System.out.println(index);
		
		System.out.println(str.charAt(4)); */

		/*String str1="Hello";
		String str2="Hello";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2); */
		
		/*String str2=str1;  //assigning a refernce of str1 to str2
		
		System.out.println("Before updation");
		System.out.println(str1);
		System.out.println(str2);
		
		str1=str1.concat("World"); //helloHello
		
		System.out.println("After updation");
		System.out.println(str1);
		System.out.println(str2); */
		
		
		
		
	}

}
