package io.zulvani.collection;

import java.util.LinkedList;

public class Queue {

    public Queue(){
        java.util.Queue<String> people = new LinkedList<>();

        people.add("Agus");
        people.add("Bilqis");
        people.add("Doni");
        people.add("Lala");

        System.out.println(people.poll());
        System.out.println(people.size());

    }

    public static void main(String[] args){
        new Queue();
    }

}
