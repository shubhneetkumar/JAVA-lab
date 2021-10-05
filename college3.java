interface AKTUniversity
{
	abstract void btech();
	static void func()
	{
		System.out.println("static fn is working in iterface");
	}
}

class college3 implements AKTUniversity
{
	public void btech()
	{
		System.out.println("btech prog....");
	}
	
	public static void main(String args[])
	{
		college2 obj=new college2();
		obj.btech();
		AKTUniversity.func();
		
	}
}
	
	