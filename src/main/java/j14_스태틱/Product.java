package j14_스태틱;

import lombok.Data;

/*
 공유영역

 */
@Data
public class Product {
    /*선언되자 마자*/ /*이미 존재한다.*/
    private static int autoIncrement = 20220000; /*새로 만들어지지 않고 공유하는 것일뿐*/ /*메모리 할당.*/

    private int serialNumber; /*생성자 Product 가 생성되면 autoIncrement를 받아온다.*/
    private String name; /*생성할때 받아온다.*/

    public Product(String name) {
        this.serialNumber = ++autoIncrement; /*생성자 안에서만 증가시키자*/
        this.name = name;
    }

    public static void print(){ /*선언되자 마자*/ /*이미 존재한다.*/ /*할당되어야 가져 올수 있다.*/
        System.out.println(autoIncrement);
        Product product = new Product("아이폰");
        System.out.println(product.add(10,20));

       // product.add(10,20); /*호출 불가. static 이 없으니까.*/ /*static 하거나 메로리 할당 새로하기*/
    }
    public int add(int a, int b) {
        return a + b;
    }
}
