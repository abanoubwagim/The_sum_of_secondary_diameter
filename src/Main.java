import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows : ");
        int rs = sc.nextInt();
        System.out.println("Enter the size of columns :");
        int cs = sc.nextInt();
        int[][] arr = new int[rs][cs];
        for (int i = 0; i < arr.length; i++) {
            int loop = i+1;
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter The number of element "+"Row NO "+loop+" Column NO "+(j+1));
                arr[i][j] = sc.nextInt();
            }
            loop++;
        }
        int sum = 0, r = (arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[r][i];
            r--;
        }
        System.out.println("The sum of secondary diameter = " + sum);
    }
}