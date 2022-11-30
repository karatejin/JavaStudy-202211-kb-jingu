package j16_컬렉션.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StringMap_copy {

	public static void main(String[] args) {

		Map<String, String> language = new HashMap<String, String>(); /* Map 은 add 가 아니라 put */

		language.put("java", "자바2");
		language.put("html", "에이치티엠엘");
		language.put("css", "씨에스에스");
		language.put("js", "자바스크립트");
		language.put("phython", "파이썬"); /* {css=씨에스에스, java=자바, phython=파이썬, phython2=파이썬, js=자바스크립트, html=에이치티엠엘} */
		language.put("phython2", "파이썬"); /* value는 중복 가능하다. 키 값은 중복 불가하다. */
		language.put("phython", "파이썬?"); /* value 중복 되면 나중에 들어온 키값이 출력된다 */ /*
																			 * {css=씨에스에스, java=자바, phython=파이썬?,
																			 * phython2=파이썬, js=자바스크립트, html=에이치티엠엘}
																			 */

		System.out.println(language);

		String s = language.get("java"); /* get이 가능하다. */ /* List와 동일하다. */ /* set 불가 */
		System.out.println(s);

		language.replace("java", "자바2", "자바3"); /* old value 가 일치해야 바뀐다. */ /*
																			 * {css=씨에스에스, java=자바, phython=파이썬?,
																			 * phython2=파이썬, js=자바스크립트, html=에이치티엠엘}
																			 */
		System.out.println(language.get("java"));

		language.remove("phython2"); 
		System.out.println(language); /*{css=씨에스에스, java=자바3, phython=파이썬?, js=자바스크립트, html=에이치티엠엘}*/
		
		language.forEach((k,v) ->{
			System.out.println("key: " + k);
			System.out.println("valye: " + v);
		});
		
		for(Entry<String,String> entry: language.entrySet()) {
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
		}
		System.out.println();
		
		Iterator<String> ir = language.keySet().iterator();
		
		while(ir.hasNext()) {
			String key = ir.next();
			System.out.println("key: " + key);
			System.out.println("value: " + language.get(key));
		}
		
	}

}
