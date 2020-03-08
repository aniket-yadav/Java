class patterntriangle{
	public static void main(String... args) {

		int sp = 4;
		int star=1;
		for (int j=0;j<5 ;j++ ) {
			
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