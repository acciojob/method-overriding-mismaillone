package com.driver;

class A {
    public String meth(String str) {
        return str;
    }
}

class B extends A {
    @Override
    public String meth(String name) {
        return name;
    }
}

public class Main {

    public static void main(String[] args) {
        A obj = new A();
        B objB = new B();

        String res = obj.meth("Invoking method from class A");

        System.out.println(objB.meth("Method is overridden in Extendend class B"));
    }
}