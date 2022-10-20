
public abstract class Machine1 
{public void rotate()
{
	System.out.println("i am in rotate method");
}
abstract protected void crush();

}
abstract class Mixer extends Machine
{
public void crush()
{
	System.out.println("i am in crush method of juicer class");
}
public void blend()
{
	System.out.println("i am in filer method");
}

}
