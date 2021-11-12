import java.util.Scanner;
class HrishikeshSrirangamA2C
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] fibonacci = new int[input];
        fibonacci[0] = 1;
        int current = 1;
        System.out.print(current + " ");
        for (int i = 1; i < fibonacci.length; i++)
        {
            fibonacci[i] = current;
            System.out.print(current + " ");
            current += fibonacci[i - 1];
        }    
    }   
}