public class ArithmeticOperatorsExample {
    public static void main(String[] args) {
        //두 정수형 변수를 선언하고, 두 수의 합을 출력하세요.
        int i = 5;
        int j = 6;
        System.out.println(i + j);

        //두 정수형 변수를 선언하고, 첫 번째 수에서 두 번째 수를 뺀 결과를 출력하세요.
        System.out.println(i - j);

        //두 정수형 변수를 선언하고, 두 수의 곱을 출력하세요.
        System.out.println(i * j);

        //두 정수형 변수를 선언하고, 첫 번째 수를 두 번째 수로 나눈 결과를 출력하세요.
        System.out.println(i / j);

        //두 정수형 변수를 선언하고, 첫 번째 수를 두 번째 수로 나눈 나머지를 출력하세요.
        System.out.println(i % j);

        //정수형 변수를 선언하고, 증감 연산자(++, --)를 사용하여 값을 변경한 뒤 출력하세요.
        System.out.println(i++ - j--);
        System.out.println(++i - --j);

    }
}
