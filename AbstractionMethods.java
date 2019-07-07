public class AbstractionMethods 
{
	public static void main(String a[])
	{
		PhoneA obj = new PhoneC(); // We create Object of Class PhoneC, as PhoneA and PhoneB cannot be instantiated due to it's abstract nature
		obj.call(); //calling
		obj.camera(); //shooting
		obj.gallery(); // gallery fucntion
	}
}

abstract class PhoneA //abstract class with abstarct methods
{
	public void call()
	{
		System.out.println("Calling...");
	}

	abstract public void camera(); // we be overidden latr by other classes
	abstract public void gallery(); // we be overidden latr by other classes
}

abstract class PhoneB extends PhoneA // inherit the call() method
{
	@Override
	public void camera() 
	{
		System.out.println("Clicked...");
	}	
}

class PhoneC extends PhoneB // inherit the call() & camera() method
{
	@Override
	public void gallery()
	{
		System.out.println("Gallery Opened...");
	}	
}
