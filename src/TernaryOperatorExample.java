import java.io.*;

public class TernaryOperatorExample {
    public static void main(String[] args) throws IOException {
        /* [문제 설명]
        시험 점수가 60점 이상이면 "합격", 미만이면 "불합격"을 출력하는 프로그램을 만드세요.
[출력 예시]
        합격
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String nscore = br.readLine();
        int n = Integer.parseInt(nscore);
        String result = (n >= 60)? "합격" : "불합격";
        bw.write(result);
        bw.flush();
        System.out.println();

        /*
        숫자가 짝수면 "짝수", 홀수면 "홀수"를 출력하는 프로그램을 만드세요.

        (힌트: 2로 나눈 나머지가 0이면 짝수입니다)

        [출력 예시]
        짝수
        */
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(System.out));
        String nNumber = br2.readLine();
        int n2 = Integer.parseInt(nNumber);
        String result2 = (n2 % 2 == 0)? "짝수" : "홀수";
        bw.write(result2);
        bw.flush();






    }
}
