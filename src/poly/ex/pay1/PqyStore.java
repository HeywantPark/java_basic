package poly.ex.pay1;

public abstract class PqyStore {
    public static Pay findPay(String payOption) {
        if (payOption.equals("kakao")) {
            return new KakaoPay();
        } else if (payOption.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
