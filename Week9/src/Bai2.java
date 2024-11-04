import java.util.*;

public class Bai2 {
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        HashMap<String, Integer> hashMap = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            hashMap.put(name, phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if (hashMap.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + hashMap.get(s));
            }
		}

        in.close();
	}
}