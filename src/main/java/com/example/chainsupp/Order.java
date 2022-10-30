package com.example.chainsupp;

public class Order {

    public static boolean orderProduct(int productId, String customerEmail) {

        String query = String.format("INSERT INTO orders(quantity, customer_id ,product_id) VALUES(1,( select cid from customer where email = '%s'),%s);",customerEmail,productId);
        DatabaseConnection dbCon = new DatabaseConnection();
        System.out.println(dbCon.executeQuery(query));

        return  true;


    }

    public static void main(String[] args) {

        Order.orderProduct(3,"yogita@gmail.com");
    }
}
