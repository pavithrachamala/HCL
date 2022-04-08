interface phone{
	
	void call();
	default void message() {
		System.out.println("sent");
	}
}

class Androidphone implements phone{

	@Override
	public void call() {
		System.out.println("calling");
		
	}
	
}

public class DefaultMethods {
	
	public static void main(String args[])
	{
		phone obj= new Androidphone();
		obj.call();
		obj.message();
	}

}
