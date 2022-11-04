package hijava.practice;

public class Student {
  private String studentNo;
  private String name;
  private int age;
  private String phoneNo;

  public Student() {}

  public Student(String name) {
    this.name = name;
  }

  public String getPhoneNo() {
    if (this.phoneNo == null || phoneNo.length() < 4) {
      return phoneNo;
    } else {
      return phoneNo.substring(0, phoneNo.length() - 4);
    }
  }

  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }

  public String getStudentNo() {
    return studentNo;
  }

  public void setStudentNo(String studentNo) {
    this.studentNo = studentNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{"
        + "studentNo='"
        + studentNo
        + '\''
        + ", name='"
        + name
        + '\''
        + ", age="
        + age
        + ", phoneNo='"
        + phoneNo
        + '\''
        + '}';
  }
}
