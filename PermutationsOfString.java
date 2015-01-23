
public class PermutationsOfString {
	
	
	public static void permute(String fixed,String remaining)
	{
		//this is the base case
		if(remaining.equals("")){System.out.println(fixed);return;}
		
		for(int i=0;i<remaining.length();i++)
		{
			String next_fixed=fixed+remaining.charAt(i);
			String next_remaining=remaining.substring(0,i)+remaining.substring(i+1,(remaining.length()));
			permute(next_fixed,next_remaining);
		}
		
	}
	
	public static  void permuteWrapper(String permuteString)
	{
		permute("",permuteString);
	}
	
	public static void main(String[] args)
	{
	String testString="abcd";
	permuteWrapper(testString);
	
	}

}
