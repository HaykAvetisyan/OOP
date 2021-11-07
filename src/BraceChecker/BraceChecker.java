package BraceChecker;

public class BraceChecker {

    private String text;

    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceChecker(String text) {
        this.text = text;

    }

    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե stack-ի հետ, թե վերևի text-ի
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
