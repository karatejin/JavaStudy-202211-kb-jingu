package j09_접근지정자.test;

public class Access3 {
    private String address;

    private void printAddress(){
        //String address = null; /*값을 초기화 하면 */
        System.out.println("address: " + address); /*this 가 생략  ("address: " + this.address)*/
    }
}
