package com.driver;

public class Main {

   public static class A {
        public String meth() {

            return "Hello World";
        }

    }

    public static class B extends A {
            @Override
      public String meth() {
        return "Method is Overriddden";
      } 
    }

    public static void main(String[] args) {
        A obj = new A();

        B obj1 = new B();

       String s =  obj.meth();
       System.out.println(s);

       String c = obj1.meth();
       System.out.println(c);
    }
}