package basicjava;
/*
@author YwQ
@version 1.0
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CompareLogicExer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input how much line U want");
        int a=sc.nextInt();
        int[][]matrix=new int[a][];
            for (int i2=0;i2<a;i2++)
            {
                matrix[i2]=new int[i2+1];
                for (int i=0;i<=i2;i++)
                    matrix[i2][i]=i2+1;

            }

        for (int i=0;i<matrix.length;i++){
        for (int as=0;as<=i;as++){
            System.out.print(matrix[i][as]);
        }
            System.out.println("\t");
                }
        int[][]al={{1,1,2,3},{12,234,}};
        System.out.println(al[0][3]+1);
    }
}
