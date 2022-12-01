package j17_JSON;

import com.google.gson.annotations.Expose;

import lombok.Builder;
import lombok.Data;

/*
 * serialize (Object -> Json)
 * deserialize(Json -> Object )
 * 중요하고 민감한 정보를 보호하기 위해서
 * jwt 가 있다면 데이터를 암호화 할수 있다. 알겠니?
 */

@Builder
@Data
public class User {
	@Expose(serialize = true, deserialize = true ) /*serialize = true 뜨게한다.*/ /*deserialize = true 뜨게한다.*/
	private String username;
	@Expose(serialize = false,deserialize = false ) /*serialize =* 이거 잡는순간 다 해줘야함.*/
	private String password;
	@Expose(serialize = true ,deserialize = false)
	private String name;
	@Expose(serialize = true ,deserialize = true)
	private String email;

}
