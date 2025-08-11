import java.util.Scanner;

public class PatternProgram {

    public static void main(String[] args) {
        showPatternMenu(); 
    }

    static void showPatternMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nChoose a Pattern:");
            System.out.println("1. Butterfly Pattern");
            System.out.println("2. Hollow Diamond in box");
            System.out.println("3. Hourglass Number Pattern");
            System.out.println("4. Concentric Square Pattern");
            System.out.println("5. Hollow Diamond in Double X");
            System.out.println("6. Net Pattern");
            System.out.println("7. Zebra Strip Pattern");
            System.out.println("8. Hollow Hourglass");
            System.out.println("9. Palindrome number Pyramid");
            System.out.println("10. Pascal's Triangle");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    pattern1();
                    break;
                case 2:
                    pattern2();
                    break;
                case 3:
                    pattern3();
                    break;
                case 4:
                    pattern4();
                    break;
                case 5:
                    pattern5();
                    break;
                case 6:
                    pattern6();
                    break;
                case 7:
                    pattern7();
                    break;
                case 8:
                    pattern8();
                    break;
                case 9:
                    pattern9();
                    break;
                case 10:
                    pattern10();
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 10.");
            }

            System.out.print("\nDo you want to continue? (Press 1 for Yes, any other number to exit): ");
            int repeat = sc.nextInt();

            if (repeat != 1) {
                System.out.println("\nProgram Ended");
                break;
            }
        }
    }

    static void pattern1() {
        System.out.println("\nButterfly Pattern");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int N = s.nextInt();
        for(int i=1;i<=N;i++){
            System.out.println("* ".repeat(i)+"  ".repeat(2*(N-i))+"* ".repeat(i));
        }
        for(int i=N-1;i>=1;i--){
            System.out.println("* ".repeat(i)+"  ".repeat(2*(N-i))+"* ".repeat(i));
        }
    }

    static void pattern2() {
        System.out.println("\nHollow Diamond in box");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int N = s.nextInt();
        for(int i=1;i<=N+N-1;i++){
            for(int j=1;j<=N+N-1;j++){
                System.out.print((j<=N-i+1) || (j>(N+i-2)) || (i>=N && (j<=(i-N+1)|| j>=N+N-(i-N+1)))?
                "X ":"  ");
            }
            System.out.println();
        }
    }

    static void pattern3() {
        System.out.println("\nHourglass Number Pattern");
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int N = sn.nextInt();
        int X = N+N-1, s=0;
        for(int i=1;i<=N+N-1;i++){
            s=i<=N?++s:--s;
            System.out.print("  ".repeat(s));
            for(int j=1,w=0;j<=X;j++){
                System.out.print((j<=N-s+1)?(++w)+" ":(--w)+" ");
            }
            X=(i<N)?(X-2):(X+2);
            System.out.println();
        }
    }

    static void pattern4() {
        System.out.println("\nConcentric Square Pattern");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int N = sc.nextInt();
        int size = N * 2 - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int min = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                System.out.print(((N - min) > 0) ? (N - min) + " " : "  ");
            }
            System.out.println();
        }
    }

    static void pattern5() {
        System.out.println("\nHollow Diamond in Double X");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int N = sc.nextInt();
        int totalCols = 2 * N;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < totalCols; j++) {
                boolean condition = (j == i || j == N - 1 - i || j == N + i || j == 2 * N - 1 - i);
                System.out.print(condition ? "* " : "  ");
            }
            System.out.println();
        }
    }

    static void pattern6() {
        System.out.println("\nNet Pattern");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int N = sc.nextInt();
        System.out.print("Enter a character: ");
        Scanner a =  new Scanner(System.in);
        char ch = sc.next().charAt(0);
        for(int i=1;i<=N;i++){
            char c=(i%2==0)?ch:' ';
            for(int j =1; j<=N;j++){
                System.out.print(c + " ");
                c = (c==' ')?ch:' ';
            }
            System.out.println();
        }
    }

    static void pattern7() {
        System.out.println("\nZebra Strip Pattern");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print((i % 2 == 0) ? "  " : ""); 
            for (int j = 1; j <= N; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    static void pattern8() {
        System.out.println("\nHollow Hourglass");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int N = sc.nextInt();

        for (int i = 1; i <= 2 * N - 1; i++) {
            int r = i <= N ? i : 2 * N - i;
            int space = r - 1, stars = N - r + 1;

            System.out.print(" ".repeat(space));
            for (int j = 1; j <= stars; j++)
                System.out.print((r == 1 || j == 1 || j == stars) ? "X " : "  ");
            System.out.println();
        }
    }

    static void pattern9() {
        System.out.println("\nPalindrome number Pyramid");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print("  ".repeat(N - i));
            for (int j = i; j >= 1; j--) System.out.print(j + " ");
            for (int j = 2; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }

    }

    static void pattern10() {
        System.out.println("\nSymmetric Number Pyramid");
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter number of rows: ");
        int N = sc.nextInt();
        int s = N;
        for(int i = 1 ; i<=N ; i++){
            System.out.print("  ".repeat(s--));
            int h = i;
            for(int j = 1 ; j<=i*2-1 ; j++){
                System.out.print((j<=i)?j+" ":--h+" ");
            }
            System.out.println();
        }


    }
}