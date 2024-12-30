package com.sample;

public class Factory {
    // Factoryの呼び出しを変えるだけで処理を変えることができる
    public static Sample createInnerClass() {
        return new Factory().new InnerSample();
    }

    public static Sample createAnonymousClass() {
        // 匿名クラス
        // 無名クラス
        // クラス名を与えていない。interfaceのコンストラクタの後ろにクラスの内部を定義しているように定義できる
        // 情報隠蔽する目的のインナークラスをさらに簡単に書く方法が匿名クラス
        return new Sample() {
            @Override
            public void execute() {
                System.out.println("test");
            }
        };
    }

    public static Sample create() {
        Sample sample = () -> {
            System.out.println("lambda");
        };
        if (true) {
            return sample;
        }
        // 関数型インターフェースという
        return () -> {
            System.out.println("lambda");
        };
    }
    // 同じパッケージ内でも隠したい場合はインナークラスを作る
    private class InnerSample implements Sample {

        @Override
        public void execute() {
            System.out.println("Inner Class");
        }
    }
}
