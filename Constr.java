package prg3;

public class Constr {
int n1,n2,res;
public Constr()// constructor
{
	n1=212;
	n2= 345;
	res=n1+n2;
	System.out.println("result is:"+res);
}
public Constr(int a,int b)//parameterized constructor  overloading
		{
	res=a+b;
	System.out.println("para result"+res);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constr obj=new Constr(); 
Constr oo=new Constr(19,56); 
	}

}
