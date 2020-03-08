import  java.util.Scanner;
class dynamicpatterntriangle{
	public static void main(String... args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter level for triangle : ");
int lvl =sc.nextInt();
		int sp = lvl-1;
		int star=1;
		for (int j=0;j<lvl ;j++ ) {
			
		for (int i =0;i<sp ;i++ ) {
			System.out.print(" ");
		}
		for (int k=0;k<star ;k++ ) {
			System.out.print("*");
		}
		sp-=1;
		star+=2;
		System.out.println();
	}
}
}