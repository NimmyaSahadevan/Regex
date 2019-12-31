import java.util.regex.*;

public class RegexExample2 
{
	public static void main(String[] args) 
	{
		Pattern p=Pattern.compile("Fa[a-z]e"); // range of characters from a to z
		Matcher m=p.matcher("Fake");
		if(m.find())
			System.out.println("true");
		else
			System.out.println("false");
		System.out.println(Pattern.matches("Fa[ac]e", "Fabe")); // false,takes either a or c
		System.out.println(Pattern.matches("Do\\[", "Do["));    // true  
		System.out.println(Pattern.matches("Do[\\[\\]]", "Do]"));
		
		// Regex metacharacters
		System.out.println(Pattern.matches("Hi\\d", "Hi5"));
		System.out.println(Pattern.matches("Hi\\D", "Hi5"));
		System.out.println(Pattern.matches("Hello\\sWorld", "Hello World"));
		System.out.println(Pattern.matches("Hello\\SWorld", "Hello World"));
		System.out.println(Pattern.matches("Hi\\wWorld", "Hi5World"));
		System.out.println(Pattern.matches("Hi\\WWorld", "Hi5World"));
		Pattern p1=Pattern.compile("\\A[a-zA-Z]"); // range of characters from a-z or A-z 
		Matcher m1=p1.matcher("Be strong");
		while(m1.find())
		{
			System.out.println(m1.group());
		}
	}
}
