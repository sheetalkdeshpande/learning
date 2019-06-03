public class Exercise {

  public void differernceBetweenDiagonalOfMatrix(){
    int[][] arr = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
    System.out.println("Hello World!");
    System.out.println("Number : " + arr[1][1]);

    int diagonalSum1 = 0;
    int diagonalSum2 = 0;

    final int length = arr[0].length;
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if (i == j) {
          diagonalSum1 = diagonalSum1 + arr[i][j];
        }
        if (i == length - j - 1){
          diagonalSum2 = diagonalSum2 + arr[j][i];
        }
      }
    }



    int difference = diagonalSum1 - diagonalSum2;
    if (difference < 0)
      difference = difference * (-1);
    System.out.println("Result : " + difference);
  }

  public void ratioOfPositivesAndNegativesInAnArray(){
    int arr[] = {1,1,0,-1,-1};
    float positive = 0;
    float negative = 0;
    float zero = 0;

    int length = arr.length;
    for(int i =0; i < arr.length; i++){
      if(arr[i] > 0)
        positive++;
      if(arr[i] < 0)
        negative++;
      if(arr[i] == 0)
        zero++;
    }
    float a = positive/length;
    float b = negative/length;
    float c = zero/length;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}
