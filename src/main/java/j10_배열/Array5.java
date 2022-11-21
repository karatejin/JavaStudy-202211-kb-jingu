package j10_배열;

public class Array5 {
    public static void main(String[] args) { /*배열*/ /*4개의 배열 중 첫(둘,3,4)번쨰 애들만 뽑아서 최소값*/

        int[] nums1 = new int []{1,8,9,16,17};
        int[] nums2 = new int []{2,7,10,15,18};
        int[] nums3 = new int []{3,6,11,14,19};
        int[] nums4 = new int []{4,5,12,13,20};

        int[] resultArray = new int[5];

        /*배열들 중 동일 인덱스에 위치한 값들 중 최소값들만 뽑아서 새로운 배열을 만든다.*/

        int a = 10;
        int b = 5;
        int c = 7;

        int min = a;
        if(a < b){
            min = a;
        }else{
            min = b;
        }

        if(c < min){
            min = c;
        }
        System.out.println("min: " + min);

        int [] minNum = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            if(nums1[i] < nums2[i]){
                minNum[i] = nums1[i];
            } else if (nums2[i] < nums3[i]){
                minNum[i] = nums2[i];
            } else if (nums3[i] < nums4[i]){
                minNum[i] = nums3[i];
            } else {
                minNum[i] = nums4[i];
            }
        }
        for(int i = 0; i < nums1.length; i++) {
            System.out.print(minNum[i]);
            System.out.print(i != (nums1.length-1) ? ", " : " ");
        }
    }
}
