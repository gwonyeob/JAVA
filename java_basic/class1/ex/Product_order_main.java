package java_basic.class1.ex;

public class Product_order_main {
    public static void main(String[] args) {

        int sum = 0;
        Product_order guest1 = new Product_order();
        guest1.productname = "두부";
        guest1.price = 2000;
        guest1.quantity = 2;

        Product_order guest2 = new Product_order();
        guest2.productname = "김치";
        guest2.price = 5000;
        guest2.quantity = 1;

        Product_order guest3 = new Product_order();
        guest3.productname = "콜라";
        guest3.price = 1500;
        guest3.quantity = 2;

        Product_order[] order = {guest1, guest2, guest3};

        for(int i=0; i< order.length; i++) {
            System.out.println("상품명: " +order[i].productname + " 가격: " + order[i].price + " 수량: " + order[i].quantity);
            sum += order[i].price * order[i].quantity;
        }
        System.out.println("총 결제 금액: " + sum);

    }
}
