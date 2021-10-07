package test;

public class testMain {
    public static void main(String[] args) {
        Beveredge cappucino = new Cappucino();
        cappucino.foo();
        ((Cappucino) cappucino).moo();
    }
}
