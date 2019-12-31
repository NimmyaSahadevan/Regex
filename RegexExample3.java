import java.util.regex.*;

public class RegexExample3 
{
	public static void main(String[] args) 
	{
		Pattern p=Pattern.compile("H{3}");
		Matcher m=p.matcher("HHHHHHHH");
		while(m.find())
		{
			System.out.println("Pattern found from : "+m.start()+"to:"+(m.end()-1));
		}
		//using quantifiers
		
		System.out.println(Pattern.matches("[fce]?",""));
		System.out.println(Pattern.matches("[fce]?","ffff"));
		System.out.println(Pattern.matches("[fce]*",""));
		System.out.println(Pattern.matches("[fce]*","f"));
		System.out.println(Pattern.matches("[fce]*","ffff"));
		System.out.println(Pattern.matches("[fce]+",""));
		System.out.println(Pattern.matches("[fce]+","f"));
		System.out.println(Pattern.matches("[fce]+","ffff"));
		System.out.println("{n} quantifiers...");
		System.out.println(Pattern.matches("[fce]{2}","f"));
		System.out.println(Pattern.matches("[fce]{2}","ff"));
		System.out.println(Pattern.matches("[fce]{2}","fff"));
		System.out.println("{n,} quantifiers...");
		System.out.println(Pattern.matches("[fce]{2,}","f"));
		System.out.println(Pattern.matches("[fce]{2,}","ff"));
		System.out.println(Pattern.matches("[fce]{2,}","fff"));
		System.out.println("{n,m} quantifiers...");
		System.out.println(Pattern.matches("[fce]{2,4}","f"));
		System.out.println(Pattern.matches("[fce]{2,4}","ff"));
		System.out.println(Pattern.matches("[fce]{2,4}","fff"));
		System.out.println(Pattern.matches("[fce]{2,4}","fffff"));
		System.out.println(Pattern.matches("[abc]+","bb"));
		System.out.println(Pattern.matches("[a-c]+",""));
		System.out.println(Pattern.matches("[a-cA-C]?","A"));
		System.out.println(Pattern.matches("[^abc]?","5"));
		System.out.println(Pattern.matches("[HI]*","HIHI"));

	}

}
