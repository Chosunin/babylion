public class ForExample {
    public static void main(String[] args) {


//        [문제 설명]
//        1부터 100까지 출력하는 프로그램을 작성해보세요.
//
//[실행 결과]
//        1
//        2
//        3
//        4
//        5
//…
//        98
//        99
//        100
        for(int i = 1; i<=100; i++) {
            System.out.println(i);
        }
//[문제 설명]
//        80부터 50까지 거꾸로 출력하는 프로그램을 작성해보세요.
//
//[실행 결과]
//
//        80
//        79
//        78
//        77
//….
//        51
//        50

        for(int i = 80; i>=50; i--){
            System.out.println(i);
        }

    }
}
