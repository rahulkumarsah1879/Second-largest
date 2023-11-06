import java.util.Scanner;
class SecondLargestAmongFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the four numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        if(a > b && a > c && a > d) {
            if(b > c &&  b > d) {
                System.out.println(b);
            }
            else if(c > d) {
                System.out.println(c);
            }
            else {
                System.out.println(d);
            }
        }
        else if(b > c && b > d) {
            if(a > c && a > d) {
                System.out.println(a);
            }
            else if(c > d){
                System.out.println(c);
            }else {
                System.out.println(d);
            }
        }
        else if(c > d) {
            if(a > b && a > d) {
                System.out.println(a);
            }
            else if(b > d){
                System.out.println(b);
            }
            else {
                System.out.println(d);
            }
        }
        else {
            if(a > b && a > c) {
                System.out.println(a);
            }
            else if(b > c) {
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }

    }
}

