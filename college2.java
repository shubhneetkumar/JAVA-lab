interface AKTUniversity
{
	abstract void btech();
}
interface LPU
{
	abstract void mtech();
	public void mba();
}
class college2 implements AKTUniversity,LPU
{
	public void btech()
	{
		System.out.println("btech prog....");
	}
	public void mtech()
	{
		System.out.println("mtech prog....");
	}
	public void mba()
	{
		System.out.println("mba prog....");
	}
	public static void main(String args[])
	{
		college2 obj=new college2();
		obj.btech();
		obj.mtech();
		obj.mba();
	}
}
	
	