package j08_클래스;

public class Phone {

    String company; /*변수*/
    String model;

    Phone(){} /*생성자가 오버로딩 되면 작동이 안되기 때문에 아무것도 설정이 안되어 있는것 넣기*/

    Phone(String c, String m){ /*반환 자료 형 없고 이건 생략 됨 이것이 생성자*/
        company = c;  /*메소드 오버로딩*/
        model = m;

    }

    void printPhoneCompany(){  /*두개의 메소드*/
        System.out.println("제조사: " + company);
        System.out.println();
    }
    void printPhoneModel(){
        System.out.println("모델명: " + model);
        System.out.println();
    }
}
