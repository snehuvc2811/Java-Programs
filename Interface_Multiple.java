package day1;
interface Twitter
{
	void add();
	void sub();
}
interface Tiktok
{
	void mul();
	void div();
}


public class Interface_Multiple implements Twitter,Tiktok {

	public static void main(String[] args) {
		Interface_Multiple im= new Interface_Multiple();
		im.add();
		im.sub();
		im.mul();
		im.div();
	}

	
	public void mul() {
		
		System.out.println("mul");
	}

	
	public void div() {
		System.out.println("div");
	}

	
	public void add() {
		System.out.println("add");
		
	}

	
	public void sub() {
		System.out.println("sub");
		
	}

}
