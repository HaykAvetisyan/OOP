package CharUtillWithOOP;

public class CharClass {

    int getCountOFc(char bolola[], char c) {
        int countOFc = 0;
        for (char aBolola : bolola) {
            if (aBolola == c) {
                countOFc++;
            }
        }
        return countOFc;
    }

    void printCenter(char bolola[]) {
        System.out.println(bolola[bolola.length / 2]);
        System.out.println(bolola[bolola.length / 2 - 1]);
    }

    boolean findLy(char bolola[]) {
        Boolean findLy = false;
        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            findLy = true;
        }
        return findLy;
    }

    boolean bobFinder(char [] bolola) {
        Boolean bobishere = false;
        for (int i = 0; i < bolola.length - 2; i++) {
            if (bolola[i] == 'b' && bolola[i + 2] == 'b') {
                bobishere = true;
            }
        }
        return bobishere;
    }

    char [] findNewWithoutSpace(char[] text){

        int start = 0;
        int end = text.length-1;
        while (start<end && text[start]==' '){
            start++;
        }
        while (end > start && text[end]==' '){
            end--;
        }
        char[] newText = new char[(end-start)+1];

        int index = 0;
        for (int i = start; i <= end; i++) {
            newText[index++] = text[i];
        }

        return newText;
    }


}
