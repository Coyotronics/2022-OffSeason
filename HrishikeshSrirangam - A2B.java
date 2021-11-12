import java.util.Scanner;
class HrishikeshSA2B
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        printPrimeFactors(scanner.nextInt());
    }

    private static void printPrimeFactors(int input)
    {
        for (int i = 2; i < 7; i++) 
        {
            while(input % i == 0 && input > 0)
            {
                System.out.print(i + " ");
                input /= i;
            }
        }
    }
}