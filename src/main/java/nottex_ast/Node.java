package nottex_ast;

public abstract class Node {


    public abstract String prettyPrint(int n);


    public String repeatString(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
