package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main4 {

	public static void main(String[] args) {
		
		Function<Integer,String> fx1 = age -> age + "살"; /*함수의 매개변수로 많이 쓰인다.*/
		 
		System.out.println(fx1.apply(20));
		
		Function<Function<Integer, String>,String> fx2 = fx -> fx.apply(20) + "입니다"; /*binary Function*/
		
		System.out.println(fx2.apply(age -> age + "살")); /*람다 안에서 람다 쓰기?*/ /*return 자체여 Function 주기?*/
		
		BiFunction<Integer, String , Map<Integer,String>> createMap = (number, name) -> {
			Map<Integer,String> map = new HashMap<>();
			map.put(number, name);
			return map;
		};
		
		List<Map<Integer,String>> list = new ArrayList<>();
		list.add(createMap.apply(100,"김준일"));
		list.add(createMap.apply(200,"유열림"));
		list.add(createMap.apply(300,"이승아"));
		list.add(createMap.apply(400,"이영인"));
		list.add(createMap.apply(500,"임지현"));
		
		System.out.println(list);
	}

}
