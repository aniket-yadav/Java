class eliminateDuplicatewithtwoarray  {

	public static void main(String[] args) {
		//Object array with duplicate value
		Object[] intarr = {"aniket",4,4,3,2,6,"aniket",'a','b','a'};

		//printing array with duplicate value
		System.out.println("Array with duplicate value ");
		for (Object i : intarr ) {
			System.out.print(i+" ");
		}

		//calling findDuplicate method to find all duplicate value and make them 0 
		//return array with unique value
		Object[] uniquearr=findDuplicate(intarr);
		System.out.println();
		System.out.println("Array with unique value ");
		for (Object i : uniquearr ) {
			System.out.print(i+" ");
		}
	}
//find duplicate method find duplicate value by linear search

	private static Object[] findDuplicate( Object[] arr){
		for (int i=0;i<arr.length ;i++ ) {
			for (int j=i+1;j<arr.length ;j++ ) {
				if (arr[i]==arr[j]) {
					//if match found make it zero
					arr[j]=null;
				}
			}
		}

//in return statement it calls filterArray method 
		return filterArray(arr);
	}
//remove every null from the array
	private static Object[] filterArray(Object oldarr[]){
		//counter count non null values with foreach loop
		int counter=0;
		for (Object a : oldarr) {
			if (a==null ){
				continue;
			}
			counter++;
		}
		Object[] filteredArr = new Object[counter];
				int j=-1;
			for (int i=0;i<oldarr.length ;i++ ) {
				if (oldarr[i]!=null) {
					j++;
					//if found non null value assign it to filteredArr
					filteredArr[j]=oldarr[i];
				}
			}
			return filteredArr;
	} 
}