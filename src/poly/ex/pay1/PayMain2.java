package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.print("원하는 결제 수단을 선택하세요(1.kakao 2.naver 3.종료 : exit) >> ");
            String payOption = sc.nextLine();

            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.print("입금 금액을 입력하세요 >>");
            int amount = sc.nextInt();
            sc.nextLine();

            payService.processPay(payOption,amount);
        }
    }
}
