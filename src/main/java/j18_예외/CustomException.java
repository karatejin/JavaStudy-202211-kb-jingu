package j18_예외;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 1L; /* 직렬화 */

	Map<String, String> errorMap;

	public CustomException() { /*오버로드*/ /*아무것도 없을때*/
		super();
	}
	
	public CustomException(String message) { /*오버로드*/ /*메세지만 있을때.*/
		super(message);
	}
	
	public CustomException(Map<String,String> errorMap) { /*오버로드*/ /*errorMap 만 있을때*/
		super();
		this.errorMap = errorMap;
	}
	
	public CustomException(String message,Map<String,String> errorMap) {
		super(message);
		this.errorMap = errorMap;
	}
	
	public void printErrorMap() {
			
		Objects.requireNonNull(errorMap); /*만약에 errorMap이 Null인 경우 NullpointException를 날려준다.*/
		for(Entry<String, String> entry : errorMap.entrySet()) {
			System.out.println(entry.getKey() + ">>>" + entry.getValue());
		}
		System.out.println();
	}

}
