// Let us just see the implementation of Abstraction 

abstract class Phone
{
   abstract call();
   abstract camera();
}

public class Iphone
{
    public void call();
    {
      //body
    }
    public void camera();
    {
      //body
    }
}    
 
 
 public class Nokia
{
    public void call();
    {
      //body
    }
    public void camera();
    {
      //body
    }
}


public class WorkingWithPhone
{
    public void work(Phone p);
    {
     p.call();
    }
}




// <-- work(new Nokia());
// <-- work(new Iphone());
