package com.sample;

public class SampleImpl2 implements Sample {

    // 付け替え可能にする
    // 実際に動作する場所は隠す
    @Override
    public void execute() {
        System.out.println("Hello 2");
    }
}
