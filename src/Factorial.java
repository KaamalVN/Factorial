import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(fact(input));

    }

    static int fact(int input) {
        if(input==0){
            return 1;
        }
        else if(input==1){
            return  1;
        }

        return fact(input-1)*input;
    }
}
