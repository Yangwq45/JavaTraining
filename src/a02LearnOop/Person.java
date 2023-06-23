package a02LearnOop;
/*
@author YwQ
@version 1.0
*/

import java.util.Scanner;

public class Person {
    double zhijing;
    int day,month,year;

    public double GetSpace() {
        return 3.14 * ((zhijing / 2) * (zhijing / 2));
    }

    public int method(int a, int b) {
        char[][] am = new char[a][b];
        for (int i = 0; i < am.length; i++) {
            for (int i1 = 0; i1 < am[i].length; i1++) {
                am[i][i1] = 'q';
            }
            for (int i3 = 0; i3 < am.length; i3++) {
                for (int i2 = 0; i2 < am[i3].length; i2++) {
                    System.out.print(am[i3][i2]);
                    if (i2 == am[i3].length - 1) {
                        System.out.println('\t');
                    }
                }
            }
        }
        return a * b;

    }
    public void getBirthdfay(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter year month day");
        this.year= scanner.nextInt();
        this.month= scanner.nextInt();
        this.day= scanner.nextInt();

        System.out.println(year+"    "+month+"   "+day);
    }

}