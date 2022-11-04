package hijava.practice;

public class Person {

  public static final String KOREAN = "Man";
  public String name;
  protected String tel; // Shared among the same package
  private String ssn1;
  private String ssn2;

  public Person(String name) {
    this.name = name;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getSsn() {
    return ssn1 + "*******";
  }
}
