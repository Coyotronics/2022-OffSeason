import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int[] nums = new int[5];
    for (int i = 0; i < 5; i++){
      
      nums[i] = scan.nextInt();
      
    
    }
    for (int i = 4; i >= 0; i--){
      System.out.print(nums[i] + " ");
    }

  }
}