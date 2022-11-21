package j10_배열;

public class Array4_copy {

    public static int[] add(int[] array, int value){ /*새롭게 추가*/
        int[] resultArray = new int[array.length +1];

        for(int i = 0; i < array.length; i++){
            resultArray[i] = array[i];
        }
        resultArray[array.length] = value; /* 마지막 인덱스 배열 대입*/

        return resultArray;
    }

    public static int [] getDuplicateArray(int []array1, int[]array2){ /*array 2개를 받았다.*/ /*임시배열 생성*/
        int [] resultArray = new int[0]; /*하나의 공간을 만들면 늘릴 수 없다.*/ /*array1만큼 하나 만들기*/

        for (int i = 0; i < array1.length; i++){
            for (int j= 0; j < array2.length; j++){
                if (array1[i] == array2[j]){ /*array1 번 배열에서 */
                    resultArray = add(resultArray, array1[i]); /*중복된 값을 add 로 넘긴다.*/
                }
            }
        }
        return resultArray;
    }

    public static int[] getNonDuplicateArray(int []array1, int[]array2){ /*array 2개를 받았다.*/
        int [] resultArray = new int[0]; /*하나의 공간을 만들면 늘릴 수 없다.*/

        for (int i = 0; i < array1.length; i++){
            int duplicateCountInArray1 = 0;
            for (int j= 0; j < array2.length; j++){
                if (array1[i] == array2[j]){
                    duplicateCountInArray1 ++;
                }
            }
            if(duplicateCountInArray1 != 0){
                continue;
            }
            resultArray =add(resultArray,array1[i]);
        }

        for (int i = 0; i < array2.length; i++){
            int duplicateCountInArray2 = 0;

            for (int j= 0; j < array2.length; j++){
                if (array2[i] == array1[j]){
                    duplicateCountInArray2 ++;
                }
            }
            if(duplicateCountInArray2 != 0){
                continue;
            }
            resultArray =add(resultArray,array2[i]);
        }
        return resultArray;
    }

    public static int getMinNumberInArray(int[]array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int getMaxNumberInArray(int[]array) {
        int max =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] nums1= new int[]{1,2,3,4,5,6,7,8,9,10}; /*중복된것중 최소값*/
        int[] nums2= new int[]{6,7,8,9,10,11,12,13,14,15}; /*중복되지 않는 것중 최대값*/

        int[] duplicateArray = getDuplicateArray(nums1, nums2);
        int[] nonduplicateArray = getNonDuplicateArray(nums1,nums2);

        int minNumberInDuplicateArray = getMinNumberInArray(duplicateArray);
        int maxNumberInNonDuplicateArray = getMaxNumberInArray(nonduplicateArray);

        System.out.println("중복된 값 중 최소값: " + minNumberInDuplicateArray);
        System.out.println("중복되지 않은 값 중 최대값: " + maxNumberInNonDuplicateArray);

        /*
        1. 두 배열에서 중복된 값 중 최소값
        2. 두 배열에서 중복되지 않은 값 중 최대값
         */

    }
}