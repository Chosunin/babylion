public class MultipleArrayEx {
    public static void main(String[] args) {
//       [문제 설명]
//        아래와 같은 2차원 배열의 [1][1]에 있는 값을 출력해보세요.
//
//        1 2
//        3 4
        int[][] array  = {{1,2},{3,4}};
        System.out.println(array[1][1]);

//       [문제 설명]
//        아래의 2x2 배열에서 [0][1] 위치의 값을 9로 변경해보세요.
//        int[][] arr = {
//                {1, 2},
//                {3, 4}
//        };

        int[][] arr = { {1,9}, {3,4}};

//      [문제 설명]
//        2x3 크기의 배열에 가로로 1부터 차례대로 숫자를 채워 출력해 보세요.
//        1 2 3
//        4 5 6

      int[][] arr2 = { {1,2,3}, {4,5,6}};

      int[][] arrfor = new int[2][3];
      int value = 1;
      for(int i = 0; i < arrfor.length; i++){
          for(int j = 0; j < arrfor[i].length; j++){
              arrfor[i][j] = value ++;
              System.out.println(arrfor[i][j]);
          }
          System.out.println();
      }
