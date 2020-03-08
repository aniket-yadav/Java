import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Countcharoccurence {
	public static void main(String[] args) {
	// create object of scanner
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter word get Occurence of each character: ");
	String word =sc.nextLine();
	char[] chars = word.toCharArray();//word into char array
	//Creating HashMap with key type character and value type Integer
	Map<Character,Integer> hm = new HashMap<Character,Integer>();
	//iterating char array
	for (Character ch : chars){
		//check if char is in hashmap
		if (hm.containsKey(ch)) {
			//if present get value add 1 to it and put back
			hm.put(ch,hm.get(ch)+1);
		}else{
			//if not put
			hm.put(ch,1);
		}
	}
	//display hashmap
	System.out.printf("Occurence of each Character in %s\n",word);
	for (Map.Entry<Character,Integer> m : hm.entrySet() ) {
		System.out.printf("%s = %d\n",m.getKey(),m.getValue());
	}
	}
	
}