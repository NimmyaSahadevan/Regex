import java.util.regex.*;

public class RegexExample 
{

	public static void main(String[] args) 
	{
		String content="Face-Focus Academy for Career Enhancement-Face";
		String string="Face";
		Pattern p=Pattern.compile(string);  // pattern class used to define the pattern
		Matcher m=p.matcher(content);       // matcher class used to find the match
		while(m.find())
		{
			System.out.println("Found at: "+m.start()+"-"+(m.end()-1));	
		}
		System.out.println(Pattern.matches("focu.", "focus"));
		System.out.println(Pattern.matches("face", "face"));
		System.out.println(Pattern.matches("fa*", "faa"));
		System.out.println(Pattern.matches("fa*e", "fake"));
	}

}
