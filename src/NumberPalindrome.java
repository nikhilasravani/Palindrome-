import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int number = input.nextInt();
        palindrome(number);

    }
    public static void palindrome(int number){
        int rev=0;
        int rem = 0;
        int temp = number;
        while(number>0) {
            rem = number % 10;
            rev = (rev * 10) + rem;
            number /= 10;
        }
        if(temp == rev){
            System.out.println("Number "+temp+" is Palindrome");
        }
        else
        {
            System.out.println("Number "+temp+" is not Palindrome");
        }

    }
}

