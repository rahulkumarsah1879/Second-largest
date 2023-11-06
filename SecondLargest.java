import java.util.Scanner;
class SecondLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 3 Numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println("b is 2nd largest");
                } else {
                    System.out.println("c is 2nd largest");
                }
            } else {
                System.out.println("a is 2nd largest");
            }
        }
            else if(b>c)
            {
                if(a>c)
                {
                System.out.println("a is 2nd largest");
                }
                else
                {
                    System.out.println("c is 2nd largest");
                }
            }

        else
    {
        System.out.println("b is 2nd largest");
    }
    }
}
