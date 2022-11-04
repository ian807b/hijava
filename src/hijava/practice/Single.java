package hijava.practice;

public class Single { // singleton
  private Single _instance;

  private Single() {}

  // public static -> can call without instantiation (method area)
  public Single getInstance() {
    if (_instance == null) {
      _instance = new Single();
    }
    return _instance;
  }
}
