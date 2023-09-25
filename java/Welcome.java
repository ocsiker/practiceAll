/** Welcome */
public class Welcome {

  public static void main(String[] args) {
    /*
     * create object welcome
     */
    Welcome wc = new Welcome();
    System.out.println(" welcome file ");
    String hl = wc.hello();
    System.out.println(hl);
  }

  public String hello() {
    return "show String";
  }
}
