package day1;

public class UpdateStNStGlobal_Var {

	int a=56;
	static double v=5.35;
	
	public static void main(String[] args) {
		UpdateStNStGlobal_Var upst=new UpdateStNStGlobal_Var();
		upst.a=67;
		System.out.println(upst.a);
		v=90;
		System.out.println(v);
		
	}

}
