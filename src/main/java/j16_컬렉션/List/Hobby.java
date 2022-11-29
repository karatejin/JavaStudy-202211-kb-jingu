package j16_컬렉션.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder /*빌더를 쓰면 AllArgsConstrocter 따라온다.*/
public class Hobby {
    private int id;
    private String hobbyName;

}
