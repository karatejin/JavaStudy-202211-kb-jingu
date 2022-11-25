package j15_제네릭;

public class ResponseMain {

    public static CMRespDto<?> response(String msg, Object data) { /* <?>: 어떤 자료형이 들어 올지 모르겠다.*/
        return  new CMRespDto<>(msg, data); /*<> 비우면 자동으로 Object 타입이 바뀜*/
    }

    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(20220001)
                .name("유열림")
                .build();

        System.out.println(response("학생데이터 응답", student));
        System.out.println(response("student code error!!", "학번에 오류가 있습니다."));
    }
}
