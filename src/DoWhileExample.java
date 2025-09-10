import java.util.Scanner;

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



