package a04LearnOopPro.a01static;
/*
@author YwQ
@version 1.0
*/

import java.util.Scanner;

public class staticAfter_Interface {
    public static void main(String[] args) {
        System.out.println("how much people U want");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        staticAfterClass[] sac = new staticAfterClass[num];
        System.out.println("enter 1 to get request \t  enter 2 to print ");

        switch (1) {
            case 1:
        for (; ; ) {
            int i = 0;
            sac[i] = new staticAfterClass();
            System.out.println("enter account ");
            String account = scanner.next();
            sac[i].setAccount(account);
            System.out.println("enter pwd");
            int pwd = scanner.nextInt();
            sac[i].setPasswd(pwd);
            System.out.println("enter balance");
            double balance = scanner.nextDouble();
            sac[i].setPasswd(pwd);
            System.out.println("enter minProfit");
            staticAfterClass.setMinbalance(scanner.nextDouble());
            System.out.println("enter Profit");
            staticAfterClass.setBenefit(scanner.nextDouble());
            break;
        }

            case 2:
                for (int i = 0; i < sac.length; i++) {
                    System.out.println(sac[i].toString());
                }

    }
    }
}
