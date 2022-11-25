package j14_스태틱.빌더;

public class ProductMain {
    public static void main(String[] args) {
        Product product = Product.builder()
                .productCode(20221001)
                .productName("갤럭시")
                .price(1000000)
                .stock(10)
                .build();
        System.out.println(product);

    }
}
