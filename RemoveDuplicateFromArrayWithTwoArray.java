class RemoveDuplicateFromArrayWithTwoArray  {
	public static void main(String[] args) {
		//int array with duplicate value
		int[] intarr = {2,4,4,3,2,6};

//printing array with duplicate value
		System.out.println("Array with duplicate value ");
		for (int i : intarr ) {
			System.out.print(i+" ");
		}

		//calling findduplicate method to find all duplicate value and make them 0 
		//return array with unique value
				int[] uniquearr=findDuplicate(intarr);
 

System.out.println();
		System.out.println("Array with unique value ");
		for (int i : uniquearr ) {
			System.out.print(i+" ");
		}
	}

	private static int[] findDuplicate( int[] arr){
		for (int i=0;i<arr.length ;i++ ) {
			for (int j=i+1;j<arr.length ;j++ ) {
				if (arr[i]==arr[j]) {
					arr[j]=0;
				}
			}
		}


		return filterArray(arr);
	}

	private static int[] filterArray(int oldarr[]){
		
		int counter=0;
		for (int a : oldarr) {
			if (a==0) {
				continue;
			}
			counter++;
		}
		int[] filteredArr = new int[counter];
				int j=-1;
			for (int i=0;i<oldarr.length ;i++ ) {
				if (oldarr[i]!=0) {
					j++;
					filteredArr[j]=oldarr[i];
				}
			}
			return filteredArr;
	} 
}