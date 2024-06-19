package java_basic.ref.ex;

import java.util.Scanner;

public class product_order_main_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = input.nextInt();

        input.nextLine();
        product_order[] orders = new product_order[n];
        for(int i = 0; i < orders.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productname = input.nextLine();

            System.out.print("가격: ");
            int price = input.nextInt();

            System.out.print("수량: ");
            int quantity = input.nextInt();
            input.nextLine();//입력 버퍼를 비우기 위한 코드

            orders[i] = create_order(productname, price, quantity);
        }
        print_orders(orders);
        int sum = get_total(orders);
        System.out.println("총 결제 금액: " + sum);


    }

    static product_order create_order(String productname, int price, int quantity) {
        product_order order = new product_order();
        order.productname = productname;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void print_orders(product_order[] orders) {
        for (product_order order : orders) {
            System.out.println("상품명: " + order.productname + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }
    //for (product_order order : orders) -> 베열 orders를 product_order 타입의 order로 하나씩 넣기

    static int get_total(product_order[] orders) {
        int total_amount = 0;
        for (product_order order : orders) {
            total_amount += order.price * order.quantity;
        }
        return total_amount;
    }

}
