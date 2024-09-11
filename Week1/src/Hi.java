public class Hi {
    public static void main(String[] args) {
        System.out.print("Hi, ");
        System.out.print(args[0]);
        System.out.println(". How are you?");
    }
}

/*
• java Hi: lỗi java.lang.ArrayIndexOutOfBoundsException
• java Hi @!&^%: lỗi
• java Hi 1234: "Hi, 1234. How are you?"
• java Hi.class Bob: lỗi java.lang.ClassNotFoundException
• java Hi.java Bob: "Hi, Bob. How are you?"
• java Hi Alice Bob: "Hi, Alice. How are you?"
 */