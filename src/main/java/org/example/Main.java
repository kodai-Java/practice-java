package org.example;

import com.sample.Factory;
import com.sample.Sample;
import com.sample.Test;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.process(new Sample() {
            @Override
            public void execute() {
                System.out.println("hello from Main");
            }
        });
        test.process(() -> {
            System.out.println("hello with lambda");
        });
    }
}
