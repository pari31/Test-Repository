import java.util.Scanner;

public class Impl implements intf {
	
	private Scanner input =new Scanner(System.in);
	private Abs obj=new Abs();

	@Override
	public void HoldData() {
		obj.setName(input.nextLine());
		obj.setEmp_id(input.nextInt());
		obj.setBonus(input.nextInt());

	}

	@Override
	public void print() {
		System.out.println(obj.getName());
		System.out.println(obj.getEmp_id());
		System.out.println(obj.getBonus());
	}

}
