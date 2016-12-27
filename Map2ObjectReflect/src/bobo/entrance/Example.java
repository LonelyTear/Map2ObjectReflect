package bobo.entrance;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bobo.obj.VHL;

public class Example {
	static VHL vhl = new VHL();
	static Map<String ,List<Map<String,Object>>> outMap = null;
	static Map<String,Object> innerMap = new HashMap<String,Object>();
	static{
		innerMap.put("A", "18");
		innerMap.put("B", "1951-05-19");
		innerMap.put("C", "ccc");
	}
	public static void main(String[] args) throws Exception{
		reflect();
		System.out.println("end");
	}
	
	public static void reflect() throws Exception{
		Class clazz = vhl.getClass();
		
		for(Map.Entry<String, Object> entry : innerMap.entrySet()) {
			String key = entry.getKey();
            Object value = entry.getValue();    
            Field field = clazz.getField(key);
            field.set(vhl, value);
		}
		
		System.out.println(vhl.getA());
		System.out.println(vhl.getB());
		System.out.println(vhl.getC());
	}
}
