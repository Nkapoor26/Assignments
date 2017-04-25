package prg5;

public class Pattern {
	int i, j;

	public void disp() {
		for (i = 0; i < 4; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern obj = new Pattern();
		obj.disp();
	}

}
