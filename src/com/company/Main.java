package com.company;

import java.util.function.Consumer;

public class Main {

    static class Resource {

        private Resource(){}

        void open() {
            System.out.println("opening resource");
        }

        void doSomething() {
            System.out.println("doing something");
        }

        void doSomethingElse() {
            System.out.println("doing something else");
        }

        void close() {
            System.out.println("closing the resource");
        }

        static void use(Consumer<Resource> user) {
            Resource r = new Resource();
            r.open();
            user.accept(r);
            r.close();
        }

    }

    public static void main(String[] args) {

        Resource.use(r -> {
            r.doSomething();
            r.doSomethingElse();
        });

    }
}
