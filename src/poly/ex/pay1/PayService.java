package poly.ex.pay1;

public class PayService {

    public void processPay(String payOption, int amount) {
        System.out.println("결제를 시작합니다. " + "option = " + payOption + ", amount = " + amount);
        Pay pay = PqyStore.findPay(payOption);

        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("결제가 성공하였습니다.");
        }else {
            System.out.println("결제가 실패하였습니다.");
        }

    }

}
