package ch04.Member;

public class MemberTest {
  public static void main(String[] args) {
    Member m1 = new Member("태경","xorud","qwe123",25);

    System.out.println(m1.toString());

//    m1.Id = "sdfsdf";
    m1.setName("태태태");
    m1.setId("xoxo");
    m1.setPassword("zxc123");
    m1.setAge(11);

    System.out.println(m1.toString());
  }
}
