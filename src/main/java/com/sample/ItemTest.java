package com.sample;

public class ItemTest {
    public static void main(String[] args) {
        new Item().id("A100").name("XL100").description("test").price(1000);
        Item.save(item -> {
            item.id("A100").name("LX100G").description("sample").price(1000);
        });
    }
}
