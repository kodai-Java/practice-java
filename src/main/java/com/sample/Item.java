package com.sample;

import java.util.function.Consumer;

/**
 * メソッドチェーンを使ったインスタンスの初期化
 */
public class Item {
    private String id;
    private String name;
    private String description;
    private int price;


    public Item() {
    }
    // コンストラクタをいちいち書くのは大変
    public Item(String id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // setterをいちいち書くのも大変
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // メソッドthisをreturnしてメソッドチェーンを作るとsetを書かなくても良くなる
    public Item id(String id) {
        this.id = id;
        return this;
    }

    public Item name(String name) {
        this.name = name;
        return this;
    }

    public Item description(String description) {
        this.description = description;
        return this;
    }

    public Item price(int price) {
        this.price = price;
        return this;
    }

    public static void save(Consumer<Item> con) {
        Item item = new Item();
        con.accept(item);
        System.out.println("save: "+ item);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
