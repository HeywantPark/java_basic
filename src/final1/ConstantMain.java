package final1;

public class ConstantMain {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 : " + Constant.MAX_USER);
        int CurrentUser = 999;
        process(CurrentUser++);
        process(CurrentUser++);
        process(CurrentUser++);

    }
    private static void process (int CurrentUser) {
        System.out.println("현재 참여자 수 :  " + CurrentUser);
        if(CurrentUser > Constant.MAX_USER) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
