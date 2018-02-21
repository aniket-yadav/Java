import java.util.*;


enum Answer{
	NO,YES,MAYBE,LATER,SOON,NEVER
}

class Question{
	Random rand = new Random();
	Answer Ask(){
		int prob = (int)(100*rand.nextDouble());
		if(prob<15)

		{
			return Answer.MAYBE;
		}
		else if(prob<30)
		{
			return Answer.NO;
		}
		else if(prob<60)
		{
			return Answer.YES;
		}
		else if(prob<75)
		{
			return Answer.LATER;
		}
        
		else if(prob<98)
		{
			return Answer.SOON;
		}
		else{
			return Answer.NEVER;
		}

    }
}

class AskMe{
	static  void answer(Answer result){


	switch(result)
	{
		case YES:
		System.out.println("YES");
		break;
		case NO:
		System.out.println("NO");
		break;
		case MAYBE:
		System.out.println("MAYBE");
		break;
		case LATER:
		System.out.println("LATER");
		break;
		case NEVER:
		System.out.println("NEVER");
		break;
		case SOON:
		System.out.println("SOON");
		break;
	}
   }

   public static void main(String[] args) {
   	
   	Question q = new Question();
   	System.out.print("Possible Answers: ");
   	for(Answer  a: Answer.values()){
   		System.out.print(a+"-> ");
   	}
   	System.out.println();
   	answer(q.Ask());
   	answer(q.Ask());
   	answer(q.Ask());
   	answer(q.Ask());
   	answer(q.Ask());
   	answer(q.Ask());
   	answer(q.Ask());

   }


}