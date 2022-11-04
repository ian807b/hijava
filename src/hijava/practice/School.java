package hijava.practice;

public class School {
  public static void main(String[] args) {
    Score korean = new Score();
    korean.setSubject("Literature");
    korean.setScore(90);

    Score math = new Score("Math", 90);

    Score science = new Score("Physics");

    System.out.println(korean);
    System.out.println(math);
  }
}
