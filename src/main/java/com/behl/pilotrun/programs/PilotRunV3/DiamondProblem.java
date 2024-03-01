package com.behl.pilotrun.programs.PilotRunV3;


import com.behl.pilotrun.PilotRunApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

interface A {
    default void foo() {
        System.out.println("A's foo");
    }
}

interface B {
    default void foo() {
        System.out.println("B's foo");
    }
}

interface C {
    default void foo() {
        System.out.println("C's foo");
    }
}

class D implements B, C {
    @Override
    public void foo() {
        B.super.foo();
    }

    // No need to provide an implementation for foo
}

@SpringBootApplication
public class DiamondProblem {

    public static void main(String[] args) {

        SpringApplication.run(PilotRunApplication.class, args);
        D d = new D();
        d.foo(); // Outputs: B's foo
    }

}