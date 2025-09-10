import java.util.Scanner;
//[문제 설명]
//사용자가 0을 입력할 때까지 계속해서 메뉴를 보여주는 프로그램입니다.
//
//[실행 결과]
//        === 메뉴 ===
//
//        1. 아메리카노
//2. 카페라떼
//3. 녹차
//0. 종료
//
//
//선택: 1 ← Scanner 입력
//선택하신 메뉴 번호는 1번 입니다.
//        ... (메뉴 반복)
//
//        0 입력 시, ‘프로그램을 종료합니다.’ 를 출력합니다.
public class DoWhileExample {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);


        do {

            System.out.println("=== 메뉴 ===");
            System.out.println("1. 아메리카노");
            System.out.println("2. 카페라떼");
            System.out.println("3. 녹차");
            System.out.println("0. 종료");
            System.out.print("선택: ");


            a = sc.nextInt();
            System.out.println("선택하신 메뉴 번호는 " + a + " 번 입니다.");



            switch (a) {
                case 1 -> System.out.println("아메리카노를 선택하셨습니다.");
                case 2 -> System.out.println("카페라떼를 선택하셨습니다.");
                case 3 -> System.out.println("녹차를 선택하셨습니다.");
                case 0 -> System.out.println("프로그램을 종료합니다.");
                default -> System.out.println("잘못된 선택입니다. 다시 입력해주세요.");


            }
        } while (a != 0);


    }
}



