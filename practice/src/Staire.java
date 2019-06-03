public class Staire {


  public void drawStaire() {
    int n = 95;


    int cnt = n;
    for (int j = 0; j < n; j++) {

      printSpace(cnt);
      printHash(j + 1);
      System.out.print("\n\r");
      cnt--;
    }
  }
    private void printHash(int count) {
      for(int i =0; i <count; i++)
        System.out.print("#");
    }

    private  void printSpace(int count) {
      for(int i = 0; i< count-1; i++)
        System.out.print(" ");
    }
  }


