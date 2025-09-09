public class WhileExample {
    public static void main(String[] args) {
//[문제 설명]
//        1부터 20까지의 숫자 중 3의 배수를 찾아 출력하고,
//        3의 배수가 나올 때마다 "찾았다!"를 출력하세요.
//
//        3의 배수가 아닌 경우, 숫자가 출력됩니다.
//
//[실행 결과]
//        1
//        2
//        3 (찾았다!)
//        4
//        5
//        6 (찾았다!)
//...
        int i = 1;
        while (i <= 20) {
            if (i % 3 == 0) {
                System.out.println(i + " (찾았다!)");
            } else {
                System.out.println(i);
            }
            i++;
        }


    }
}

