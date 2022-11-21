package j10_배열;

public class Array5_copy {

    public static int getMinNumber(int num1, int num2){ /*삼항 연산자*/
        return num1 < num2 ? num1 : num2; /*num1 작다면 num1 return 아니라면 num2 리턴*/
    }
    public static void main(String[] args) { /*배열*/ /*4개의 배열 중 첫(둘,3,4)번쨰 애들만 뽑아서 최소값*/

        int[] nums1 = new int []{1,8,9,16,17};
        int[] nums2 = new int []{2,7,10,15,18};
        int[] nums3 = new int []{3,6,11,14,19};
        int[] nums4 = new int []{4,5,12,13,20};

        int[] resultArray = new int[5];

        /*배열들 중 동일 인덱스에 위치한 값들 중 최소값들만 뽑아서 새로운 배열을 만든다.*/

        for (int i = 0; i < nums1.length; i++) {
            resultArray[i] = getMinNumber(getMinNumber(nums1[i],nums2[i]),getMinNumber(nums3[i],nums4[i]));
            System.out.println(resultArray[i]);
        }



    }
}
