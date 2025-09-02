package PrimitiveTypeEx;

public class ConversionTypeExample {
    public static void main(String[] args) {
        // int 타입 변수를 double 타입 변수로 변환하세요. 업캐스팅(묵시적 형변환) 이 이루어지는 것을 확인하세요.
        int a = 42;
        double aa = a;

        System.out.println(aa);

        // double 타입 변수를 int 타입 변수로 변환하세요. 다운캐스팅(명시적 형변환)을 통해 소수점 이하 데이터가 손실되는 것을 확인하세요.
         double b = 9.99;
         int doubleb = (int)b;

         System.out.println(doubleb);

         //char 타입 변수를 int 타입 변수로 변환하세요. 문자의 ASCII 코드 값이 저장됩니다.
        char letter = 'A';
        int asciiValue = letter;

        System.out.println(asciiValue);

        //int 타입 변수를 char 타입 변수로 변환하세요. 다운캐스팅(명시적 형변환)을 통해 정수를 문자로 변환합니다.
        int c = 66;
        char asciiValueC = (char) c;

        System.out.println(asciiValueC);

        //Integer.parseInt() 메서드를 사용하여 문자열 변수를 정수형으로 변환하세요. 문자열 변수는 정수형으로 변환할 수 있도록 초기화 해 주세요.

        String str = "30";
        int intStr = Integer.parseInt(str);

        System.out.println(intStr);




    }
}
