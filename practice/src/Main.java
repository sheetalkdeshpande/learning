import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    int arr[] = {3,2,1,3};


     // Arrays.sort(arr);

      int cnt = 0;
      int max = 0;
    for(int i = 0; i < arr.length; i++){
      cnt = 0;
      for(int j = 0; j<arr.length; j++){
        if(arr[i] == arr[j] && i != j){
          cnt++;
        }
      }
      if(cnt > max){
        max = cnt;
      }
    }


System.out.print(max);



    }


}
