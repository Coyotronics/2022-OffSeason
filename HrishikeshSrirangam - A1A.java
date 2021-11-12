import java.util.Scanner;

class HrishikeshSA1A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) 
            numbers[i] = scanner.nextInt();
        for (int i = numbers.length - 1; i >= 0; i--)
            System.out.print(numbers[i] + " "); 
    }
}