package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(String.format("latest android OS %f", SamsungMobile.latest_os));
        SamsungMobile.newOS(); // 4.4 -> 4.5
        SamsungMobile s20 = new SamsungMobile("black", 4.8f); // os = 4.5
        SamsungMobile.newOS(); // 4.5 -> 4.6

        // s20 OS = 4.5
        System.out.println(String.format("Android os = %f", s20.current_os)); //4.5
        s20.upgradeToLatestOS();
        System.out.println(String.format("Android os = %f", s20.current_os)); //4.6
        System.out.println();
        SamsungMobile s21 = new SamsungMobile("blue", 5.2f); // os = 4.6
        // the java always take the static field

        Person p1 = new Person("moshe", "netanya");
        Person p2 = new Person("danny", "tel-aviv");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(String.format("how many persons created? %d", Person.next_id - 1 ));

        Transaction t1 = new Transaction(1000);
        Transaction t2 = new Transaction(2000);
        // print average

        System.out.println(String.format("average of trans = %f", Transaction.averageTransaction()));





    }
}
