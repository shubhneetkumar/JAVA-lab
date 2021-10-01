class Equals
{
	public static void main(String args[])
	{

		String str1="JaVa Programming";
		String str2="JaVa Programming";
		System.out.println(str1);
		System.out.println(str2);

		System.out.println("\n\n---------------------------\n\n");
		
		//boolean res=str1.equals(str2);
		boolean res=str1.equalsIgnoreCase(str2);

		System.out.println(res);	

	}
}