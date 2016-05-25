package nottex_ast;

public abstract class Node {

    int INDENT_SIZE = 4;


    abstract String prettyPrint(int n);

    public String prettyPrint() {
        return prettyPrint(0);
    }


    public String repeatString(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
