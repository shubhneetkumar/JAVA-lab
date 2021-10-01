class trim
{

	public static void main(String args[])
	{
		String str1="            HeLLo We are leaRnING JaVa                  ";
		
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println("\n\n-----------------------------\n\n");

		String res=str1.trim();
		System.out.println(res);
		System.out.println(res.length());
	}
		
	
}