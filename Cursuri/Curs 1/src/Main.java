import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        matrice();
    }

    private static void example1(){
        int a = 5;
        double b = 5.5;
        float c = 2.4f;
        char d =  'a';
        boolean e = false;

        Integer a1 = a;

        switch(a){
            case 1:
                System.out.println("low");
                break;
            case 2:
                System.out.println("not so low");
                break;
            default:
                System.out.println("not found");
                break;
        }
    }

    public static void matrice() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] sumMatrix = new int[n][n];
        int[][] productMatrix = new int[n][n];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                for(int k=0;k<n;k++)
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];

        System.out.println(Arrays.deepToString(sumMatrix));
        System.out.println(Arrays.deepToString(productMatrix));

    }
}
