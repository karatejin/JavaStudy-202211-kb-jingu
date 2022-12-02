package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main2 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("임지현");
		names.add("신경수");
		names.add("고희주");
		names.add("문승주");
		
		Supplier<String> firstName = () -> names.get(0); /*-> 다음은 리턴, 변수명으로 뭘 가져오는지 명시 할 수 있음*/
		/*names.get(0) 이것 자체로 의미 전달 안될때 변수명 firstName 을명시하면 아 저기서 가져 오는 구나 한다.*/
		
		System.out.println(firstName.get());
	}
}
