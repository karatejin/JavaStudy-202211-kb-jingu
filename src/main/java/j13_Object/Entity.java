package j13_Object;

import lombok.*; /*추가하자마자 반영된다.*/

@NoArgsConstructor /*기본생성자*/
@AllArgsConstructor /*모든 변수들을 받겠다. 전체생성자*/
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data /*데이터가 거의 다포함한다.*/
public class Entity { /*정보를 담는 개체*/ /*오브젝트 같은 애들 = 서비스 개체 = 기능을 담은 개체*/
    private String name;
    private int age;
    private Object address;

    public boolean cmp(){
        return this.getClass() == Entity.class; /*결과는 true*/ /*클래스가 생성된 주고사 있을때 getClass  //Entity.class 생성하지 않아도 씀*/
    }
}
