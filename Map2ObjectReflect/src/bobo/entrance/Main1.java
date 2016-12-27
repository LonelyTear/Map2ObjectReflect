package bobo.entrance;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bobo.obj.PACKAGE;
import bobo.obj.VHL;


public class Main1 {
	public static PACKAGE pack = new PACKAGE();
	public static VHL vhl = new VHL();
	public static Map<String ,List<Map<String,Object>>> outMap = new HashMap<String ,List<Map<String,Object>>>();
	public static Map<String,Object> innerMap = new HashMap<String,Object>();
	static{
		innerMap.put("A", "18");
		innerMap.put("B", "1951-05-19");
		innerMap.put("C", "ccc");
		ArrayList<Map<String,Object>> list = new ArrayList<Map<String,Object>> ();
		list.add(innerMap);
		outMap.put("VHL", list);
	}
	public static void main(String[] args) throws Exception{
		reflect();
//		reflectInnerObject("bobo.obj.VHL",innerMap);
		System.out.println("end");
	}
	
	public static void reflect() throws Exception{
		for(Map.Entry<String, List<Map<String,Object>>> outEntry :outMap.entrySet()){
			String key = outEntry.getKey();
			List<Map<String,Object>> list = outEntry.getValue();
			List<VHL> vhlList = new ArrayList<VHL>();
			for(int i = 0 ; i < list.size(); i++){
				Class clazz = Class.forName("bobo.obj."+key);
				Object obj = reflectInnerObject("bobo.obj."+key,(list.get(i) ) );
				vhlList.add((VHL)obj);
			}
			pack.setVHL(vhlList);
		}
		System.out.println(pack.getVHL().get(0).getA());
	}
	
	public static Object reflectInnerObject(String name,Map<String,Object> map) throws Exception{
		Class clazz = Class.forName(name);
		Object obj =  clazz.newInstance();
		for(Map.Entry<String, Object> entry : innerMap.entrySet()) {
			Field field = clazz.getField(entry.getKey());
			field.set(obj, entry.getValue());//Date,Integer的话在此行前转换
		}
//		System.out.println(((VHL)obj).getA());
//		System.out.println(((VHL)obj).getB());
//		System.out.println(((VHL)obj).getC());
		return obj;
	}
	
}
