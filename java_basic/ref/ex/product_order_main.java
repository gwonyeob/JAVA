package java_basic.ref.ex;

import java_basic.class1.ex.Product_order;

public class product_order_main {
    public static void main(String[] args) {
        product_order[] orders = new product_order[3];

        orders[0] = create_order("두부", 2000, 2);
        orders[1] = create_order("김치", 5000, 1);
        orders[2] = create_order("콜라", 1500, 2);

        /* product_order order1 = new product_order();
        order1.productname = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        orders[0] = order1;

        product_order order2 = new product_order();
        order2.productname = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        orders[1] = order2;

        product_order order3 = new product_order();
        order3.productname = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        orders[2] = order3; */

        int total_price = 0;
        for(int i=0; i< orders.length; i++) {
            System.out.println("상품명: " +orders[i].productname + " 가격: " + orders[i].price + " 수량: " + orders[i].quantity);
            total_price += orders[i].price * orders[i].quantity;
        }
        System.out.println("총 결제 금액: " + total_price);

    }

    static product_order create_order(String productname, int price, int quantity) {
        product_order order = new product_order();
        order.productname = productname;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

}
