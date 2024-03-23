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
         B objB = new B();

        
        System.out.println(objB.meth("hello"));
}
