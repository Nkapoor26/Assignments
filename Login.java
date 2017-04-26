package prg22;

public class Login {
	String Username="Neha";
	String Password="Neha";
	public void check()
	{
		if (Username.equals("KAPOOR")&& Password.equals("Neha"))
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("InValid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login obj= new Login();
		obj.check();
	}

}
