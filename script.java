import java.util.*;
import javax.script.*;
class script{
	public static void main(String[] args) throws Exception{
		ScriptEngineManager mgr= new ScriptEngineManager();
		ScriptEngine engine= mgr.getEngineByName("JavaScript");

		System.out.println(engine.eval("34+785-55*23/5"));
	}
}