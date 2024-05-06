package day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {

	public static void main(String[] args) {
		
		//1st way
		
		//as  -  .s  
		/*Pattern p =Pattern.compile(".j");
		Matcher m =p.matcher("as");
		boolean b = m.matches();
		System.out.println(b);

		//2nd way
		
		boolean b1 = Pattern.compile(".s+").matcher("as").matches();
		System.out.println(b1);
		
		//3rd way
		boolean b2= Pattern.matches(".s+", "a");
		System.out.println(b2); */
		
		/*System.out.println(Pattern.matches(".s", "mk")); //false  the second character is not s
		System.out.println(Pattern.matches(".s", "mst"));// false it has more than 2 character
		System.out.println(Pattern.matches("..s", "mas"));//true */
		
		
		/*System.out.println(Pattern.matches("[amn]", "abcd")); //false 
		System.out.println(Pattern.matches("[^abc]", "a"));
		
		System.out.println(Pattern.matches("[amn]", "ammmmmmna"));*/
		
		/*System.out.println(Pattern.matches("[amn]?", "a"));
		System.out.println(Pattern.matches("[amn]?", "aaa"));
		System.out.println(Pattern.matches("[amn]?", "aammmmnn"));
		System.out.println(Pattern.matches("[amn]?", "aazzta"));
		
		System.out.println(Pattern.matches("[amn]+", "a"));
		System.out.println(Pattern.matches("[amn]+", "aaa"));
		System.out.println(Pattern.matches("[amn]+", "aammmmnn"));
		System.out.println(Pattern.matches("[amn]+", "azztaa"));
		
		System.out.println(Pattern.matches("[amn]*", "ammmmna"));I*/
		
		/*System.out.println(Pattern.matches("\\d", "abc"));  //false
		System.out.println(Pattern.matches("\\d", "1"));  //true
		System.out.println(Pattern.matches("\\d", "443")); //false
		System.out.println(Pattern.matches("\\d", "443abc")); //false */
		
		//Create a regular expression that accepts alphanumeric characters only.
		//It's length must be six character long only.
		
		/*System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Leema3"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Leema31"));*/
		
		/*Create a regular expression that accepts 10 digit numeric characters starting
		 * with 7,8, or 9 only */
		
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "98765432abd"));
		
		
		
		
	}

}
