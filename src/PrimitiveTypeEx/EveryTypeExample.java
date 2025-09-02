package PrimitiveTypeEx;

public class EveryTypeExample {
    public static void main(String[] args) {

      //int 타입 변수를 선언하고, 값을 초기화한 후 출력하세요.
        int i = 20;

     // double 타입 변수를 선언하고, 값을 초기화한 후 출력하세요.
     double a = 20.1;

     //int와 double 타입 변수를 선언하고, 두 변수를 더한 결과를 출력하세요.
        int j = 30;
        double b = 30.7;

        System.out.println(j + b);

     //boolean 타입 변수를 조건문에서 사용하여 참/거짓 여부를 출력하세요.

        boolean r = true;
        if(r){
            System.out.println("유효한 값입니다.");
        } else {
            System.out.println("유효하지 않은 값입니다.");
        }
    }
}
