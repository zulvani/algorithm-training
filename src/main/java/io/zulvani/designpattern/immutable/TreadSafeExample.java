package io.zulvani.designpattern.immutable;

public class TreadSafeExample {

    public TreadSafeExample() {
        Person agus = new Person("agus");
        System.out.println(agus.getName());
    }

    public static void main(String[] args){
        new TreadSafeExample();
    }
}
