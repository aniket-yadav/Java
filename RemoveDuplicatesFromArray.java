class RemoveDuplicatesFromArray  {
	public static void main(String[] args) {
		int[] intarr = {2,4,4,3,2,6};
		int[] obarr=filterArray(intarr);
		for (int o: obarr ) {
			System.out.print(o+" ");
		}
	}

	private static int[] filterArray( int[] arr){
		for (int i=0;i<arr.length ;i++ ) {
			for (int j=i+1;j<arr.length ;j++ ) {
				if (arr[i]==arr[j]) {
					arr[j]=0;
				}
			}
		}
		return arr;
	}
}