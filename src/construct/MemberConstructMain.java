package construct;

public class MemberConstructMain {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("hyewon",27,95);
        MemberConstruct member2 = new MemberConstruct("jiwon",25,83);

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct member : members) {
            System.out.println("이름 : " + member.name + " 나이 : " + member.age + " 성적 : " + member.grade);
        }
    }
}
