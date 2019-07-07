public class Inheritance
{
	public static void main(String a[])
	{
		PhoneA obj = new PhoneA(100045,"Iphone X", 48);
		obj.display();
	}
}

class Features 
{
	int id; String name;

	public Features(int a, String b)
	{
		this.id = a;
		this.name = b;
	}

	public void display()
	{
		System.out.println(name + " with id : " + id + " exists...");
	}
}

class PhoneA extends Features
{
	int pixel;
	public PhoneA(int id, String name, int a)
	{
		super(id, name);
		this.pixel = a;
	}


	@Override
	public void display()
	{	
		super.display();
		System.out.println("Pixels :" + pixel + "MP");
	}
}

