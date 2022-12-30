
public class StringBuilderExample {
	public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("my name is rustam ali");
	System.out.println(sb.toString());
	sb.append(" and i m a developer");
	System.out.println(sb.toString());
	sb.insert(32, "full stack ");
	System.out.println(sb.toString());
	sb.reverse();
	System.out.println(sb);
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	sb.trimToSize();
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	
	
	}
}

