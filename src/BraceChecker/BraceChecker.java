package BraceChecker;

public class BraceChecker {

    private String text;

    
    public BraceChecker(String text) {
        this.text = text;

    }

    
    public void check() {
        Stack st = new Stack();
        char ar[] = text.toCharArray();
        for (int i = 0; i < ar.length; i++)
            switch (ar[i]) {
                case '(':
                case '[':
                case '{':
                    st.push(ar[i]);
                    break;
                case ')':
                    if (st.pop() != '(') {
                        System.err.println("Error ) at " + i);
                    }
                    break;

                case ']':
                    if (st.pop() != '[') {
                        System.err.println("Error ] at " + i);
                    }
                    break;

                case '}':
                    if (st.pop() != '{') {
                        System.err.println("Error } at " + i);
                    }
                    break;
                default:
                    break;


            }

    }
}
