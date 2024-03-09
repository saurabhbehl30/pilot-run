package com.behl.pilotrun.programs.PilotRunV3;


import com.behl.pilotrun.PilotRunApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

interface A {
     void foo();
}

interface B {
     void foo();
}

interface C {
     void foo();
}

class D implements B, C {
    @Override
    public void foo() {
        System.out.println("hhhh");
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