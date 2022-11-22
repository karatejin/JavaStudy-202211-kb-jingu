package j12_추상.인터페이스;
    /*
    급여정산
    */
public class Salary implements Calculator{
        @Override
        public int calc(int[] value) {
            System.out.println("급여 정산을 진행합니다.");
            int result = 0;
            for (int i = 0; i < value.length; i++) {
                    result += value[i];
            }

            result = (result-(int)(result*0.03));

            return result;
        }
    }
