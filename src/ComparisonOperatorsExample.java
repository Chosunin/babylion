public class ComparisonOperatorsExample {
    public static void main(String[] args) {
        int i = 5;
        int j = 6;
        String a = "in";
        String b = "sun";


        //두 정수형 변수를 선언하고, 두 수가 같은지 비교하여 결과를 출력하세요.
        System.out.println(i == j);

        //두 정수형 변수를 선언하고, 첫 번째 수가 두 번째 수보다 큰지 비교하여 결과를 출력하세요.
        System.out.println(i > j);

        //두 정수형 변수를 선언하고, 첫 번째 수가 두 번째 수보다 작은지 비교하여 결과를 출력하세요.
        System.out.println(i < j);

        //두 문자열 변수를 선언하고, 문자열이 같은지 비교하여 결과를 출력하세요. (equals 메서드를 사용해야 합니다.)
        System.out.println(a.equals(b));

        //두 정수형 변수를 선언하고, 첫 번째 수가 두 번째 수와 같거나 작은지 비교하여 결과를 출력하세요.
        System.out.println(i <= j);

    }

}
