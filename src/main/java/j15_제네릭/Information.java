package j15_제네릭;

import lombok.Getter;

public class Information<T> {
    @Getter
    private T target; /*T 는 오브젝트. 제네릭을 쓰면 다운 캐스팅을 할 필요 ㄴㄴ*/

    public Information(T target) {
        this.target = target;
    }

    public void printInfo(){
        System.out.println(target);
    }
}
