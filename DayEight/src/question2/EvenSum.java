//Q2) Even Sum in Columns
//Description
//● You have to create a 2D array, whose dimensions are N, M, and take the input from the user.
//● The value stored in N denotes the number of rows, and the value in M denotes the number of
//columns
//● If the array looks like arr = [1,2,3],[4,5,6],[7,8,9]
//● For all columns, you have to print the sum of even elements present in the column
//4 (Even numbers in the column are, [4]. Therefore, the sum becomes 4)
//10 (Even numbers in the row are, [2,8]. Therefore, the sum becomes 10)
//6 (Even numbers in the row are, [6]. Therefore, the sum becomes 6)
//Sample Input 1
//Enter no of rows: 3
//Enter no of columns: 3
//1 2 3
//4 5 6
//7 8 9
//Sample Output 1
//4
//10
//6
//Hint
//In the sample test case, the value stored in N = 3,M = 3, and the array is [1,2,3],[4,5,6],[7,8,9], then the required
//output will be
//4 (Even numbers in the column are, [4]. Therefore, the sum becomes 4)
//10 (Even numbers in the row are, [2,8]. Therefore, the sum becomes 10)
//6 (Even numbers in the row are, [6]. Therefore, the sum becomes 6)



package question2;

import java.util.Scanner;

public class EvenSum {
	
	

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row: ");
        int N = sc.nextInt();

        System.out.print("Enter the Colomn: ");
        int M = sc.nextInt();

        int arr[][] = new int[N][M];
        int a=1;
//input
        for(int i=0; i<N; i++) {

            for(int j=0; j<M; j++) {
                arr[i][j] = a;
                System.out.print(a+" ");
                a++;
            }
            System.out.println("");
        }

        System.out.println("Sample Output");

        for(int j=0; j<M; j++) {
            int sum=0;
            for(int i=0;i<N;i++) {

                if(arr[i][j] % 2 == 0) {
                    sum+= arr[i][j];
                }
            }
            System.out.println(sum);
        }

    }
}