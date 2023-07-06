package a04LearnOopPro.a01static;
/*
@author YwQ
@version 1.0
*/

public class staticAfterClass {
    private String account;
    private int passwd;
    private double balance;
    private static double benefit;
    private static double minbalance;

    public staticAfterClass(String account, int passwd, double balance) {
        this.account = account;
        this.passwd = passwd;
        this.balance = balance;
    }

    public staticAfterClass() {
    }
    //GaS


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getPasswd() {
        return passwd;
    }

    public void setPasswd(int passwd) {
        this.passwd = passwd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getBenefit() {
        return benefit;
    }

    public static void setBenefit(double benefit) {
        staticAfterClass.benefit = benefit;
    }

    public static double getMinbalance() {
        return minbalance;
    }

    public static void setMinbalance(double minbalance) {
        staticAfterClass.minbalance = minbalance;
    }
    //GaS over

    @Override
    public String toString() {
        return "staticAfterClass{" +
                "account='" + account + '\'' +
                ", passwd=" + passwd +
                ", balance=" + balance +
                ",benefit="+benefit
                +"minbalance = "+minbalance+
                '}';

    }
}
