package com.company;

import lombok.ToString;

@ToString
public class Person {


        public int id;
        public String name;
        public String address;

        public static int next_id = 1;

        public Person(String name, String address) {
            this.name = name;
            this.address = address;
            this.id = next_id;
            next_id++;
        }

        //public static void sequentialId() {
        //    for (int index = 1; index < id; index++){
        //        System.out.println(index);
        //    }



}


