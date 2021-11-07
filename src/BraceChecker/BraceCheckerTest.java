package BraceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "[bare(vo)]ba";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();

    }
}
