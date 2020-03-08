import java.util.*;
import javax.script.*;
class StringEvaluteWithScriptEngineManager{
	public static void main(String[] args) throws Exception{
		//ScriptEngineManager let you use Javascript
		ScriptEngineManager mgr= new ScriptEngineManager();
		ScriptEngine engine= mgr.getEngineByName("JavaScript");
		//using javascript method eval to evaluate math expresition
		System.out.println(engine.eval("34+785-55*23/5"));
	}
}
