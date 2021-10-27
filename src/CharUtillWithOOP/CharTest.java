package CharUtillWithOOP;

public class CharTest {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'b', 'l', 'b'};

        CharClass cc = new CharClass();
        boolean bob = cc.bobFinder(bolola);
        boolean ly = cc.findLy(bolola);

        char[] newWithoutSpace = cc.findNewWithoutSpace(bolola);

        int o = cc.getCountOFc(bolola, 'o');

        cc.printCenter(bolola);


    }
}
