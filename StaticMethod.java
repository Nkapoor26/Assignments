package prg14;

public class StaticMethod {
public static int max(int a, int b)
{
	int result;
	{
		if(a>b)
		{
			result=a;
		}
		else
			{result=b;
			}
		return result;
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m=StaticMethod.max(45,89);
System.out.println("value of m:"+m);
	}

}
