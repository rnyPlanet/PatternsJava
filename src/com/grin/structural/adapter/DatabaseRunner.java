package com.grin.structural.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new JavaToDatabaseAdapter();

        database.create();
        database.read();
        database.update();
        database.delete();
    }
}
