import java.util.*;
class demoJava{
	public static void DecimalToBinary(int decimal){
	String binary="";
	int decimalno=decimal;
	if(decimal==0){
			binary="0";
		}
		while(decimal>0){
			if(decimal%2==0){
			   binary=binary+"0";
		    }else{
			   binary=binary+"1";
		    }
        decimal=decimal/2;
		}

		StringBuffer a = new StringBuffer(binary);
		a.reverse();
		System.out.printf(" binary of decimal %d is %s \n",decimalno,a);
		}
	public static void BinaryToDecimal(int binary){
		int decimal=0;
		int flag=1;
		int n=0;
		int binaryno=binary;
		while(true){
		if(binary==0){
			break;
		}else{
			int temp=binary%10;
			if((temp<0)||(temp>1)){
			   
			    flag=0;
			   break;
			}
			decimal=decimal+temp*(int)Math.pow(2,n);
			binary=binary/10;
			n++;
		}
		}
		if(flag==0){
		  System.out.println("invalid input ");
		}else{
		System.out.printf("decimal of binary %d is %d \n",binaryno,decimal);
	  }
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("select operation :\n\t\t\t1:DecimalToBinary\n\t\t\t2:BinaryToDecimal\n");
        System.out.print("Enter choice :(1 or 2) ");
        int choice = obj.nextInt();
        switch(choice){
        	case 1:System.out.print("Enter decimal value : ");
                   int decimal=obj.nextInt();
                   DecimalToBinary(decimal);
                   break;
            case 2: System.out.print("Enter binary value : ");
                    int binary=obj.nextInt();
                    BinaryToDecimal(binary);
                    break;
             default:System.out.println("invalid choice");
        }
        }
}
