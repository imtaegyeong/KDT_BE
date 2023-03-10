package ch04.Member;

public class Member {
  private String name;
  private String Id;
  private String Password;
  private int age;

  Member(String name, String Id, String Password, int age) {
    this.name = name;
    this.Id = Id;
    this.Password = Password;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return Id;
  }

  public void setId(String id) {
    Id = id;
  }

  public String getPassword() {
    return Password;
  }

  public void setPassword(String password) {
    Password = password;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Member{" +
        "name='" + name + '\'' +
        ", Id='" + Id + '\'' +
        ", Password='" + Password + '\'' +
        ", age=" + age +
        '}';
  }
}
