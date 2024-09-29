import java.util.Scanner;

public class SimpleTextEditor {
    private StringBuilder s = new StringBuilder();
    private Stack<StringBuilder> history = new Stack<>();
    
    /** Append the given argument to the end of the string. */
    public void append(String w) {
        history.push(new StringBuilder(s));
        s.append(w);
    }

    /** Delete the last k characters of the string. */
    public void delete(int k) {
        history.push(new StringBuilder(s));
        s.setLength(s.length() - k);
    }

    /** Print the kth character of the string. */
    public void print(int k) {
        System.out.println(s.charAt(k - 1));
    }

    /** Undo the last operation. */
    public void undo() {
        s = history.pop();
    }

    /** Test */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        SimpleTextEditor textEditor = new SimpleTextEditor();
        while (q-- > 0) {
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    String w = sc.next();
                    textEditor.append(w);
                    break;
                case 2:
                    int k = sc.nextInt();
                    textEditor.delete(k);
                    break;
                case 3:
                    int n = sc.nextInt();
                    textEditor.print(n);
                    break;
                case 4:
                    textEditor.undo();
                    break;
            }
        }

        sc.close();
    }
}