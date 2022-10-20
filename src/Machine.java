
public abstract class Machine 
{
	public void rotate()
	{
		System.out.println("i am in rotate method");
	}
	abstract protected void crush();

}
abstract class Juicer extends Machine
{
	
	public void filter()
	{
		System.out.println("i am in filer method");
	}
	
}
class Mixed extends Juicer
{
	public void crush()
	{
		System.out.println("i am in crush method of mixed class");
	}
}
