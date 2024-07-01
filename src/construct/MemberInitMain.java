package construct;

public class MemberInitMain {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("hyewon",27,89);

        System.out.println("이름 : " + member1.name + " 나이 : " + member1.age + " 성적 : " + member1.grade);
    }
}
