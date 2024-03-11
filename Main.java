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
        B obj1 = new B();

        String s = obj.meth("Hello");
        System.out.println(s);

        String c = obj1.meth("World");
        System.out.println(c);
    }
}