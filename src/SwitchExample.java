import java.io.*;

public class SwitchExample {
    public static void main(String[] args) throws IOException {

        /* [문제 설명]
        숫자 1~7을 입력받아 해당하는 요일을 출력하는 프로그램을 만드세요.
        1=월요일, 2=화요일, ... 7=일요일

                [출력 예시]

        1 → "월요일"
         */

    //최신문법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String nNumber = br.readLine();
        int num = Integer.parseInt(nNumber);
        String result;
        switch (num) {
            case 1 -> result = "월";
            case 2 -> result = "화";
            case 3 -> result = "수";
            case 4 -> result = "목";
            case 5 -> result = "금";
            case 6 -> result = "토";
            case 7 -> result = "일";
           default -> result = "없는 요일입니다.";
        }

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();

    //기존문법

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(System.out));
        String nNumberSeason = br.readLine();
        int nN = Integer.parseInt(nNumberSeason);
        String season;

        switch (nN) {
            case 1:
                season = "월";
                break;
            case 2:
                season = "화";
                break;
            case 3:
                season = "수";
                break;
            case 4:
                season = "목";
                break;
            case 5:
                season = "금";
                break;
            case 6:
                season = "토";
                break;
            case 7:
                season = "일";
                break;
            default:
                System.out.println("없는 요일입니다..");

        }

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();

    }
}
