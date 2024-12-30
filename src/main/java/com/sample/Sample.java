package com.sample;

// 関数型インターフェースだから抽象メソッド１こしかもてないよってコンパイルエラーにしてくれて安全になる
@FunctionalInterface
public interface Sample {
    // 関数型インターフェースはlambda式を代入できるインターフェース
    // 特徴としてはメソッドを一つしかもてない。
    public void execute();
}
