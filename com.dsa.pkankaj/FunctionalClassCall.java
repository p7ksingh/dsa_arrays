public class FunctionalClassCall {
    public static void main(String[] args) {
        FunctionalClass fc =(a,b,c)->{return (a+b+c);};
      int add=  fc.add(20,20,20);
      System.out.println(add);
    }
}
