package com.driver;

class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extendend class B";
    }
}

public class Main {

    public static void main(String[] args) {
       //  A obj = new A();
        B objB = new B();

        // String res = obj.meth("Invoking method from class A");

        System.out.println(objB.meth());
    }
}
