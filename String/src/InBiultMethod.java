
public class InBiultMethod {

	public static void main(String[] args) {
		String str = "RajaRamMohanRoy";
		String str1 = new String("RajaRamMohanRoy");
		StringBuffer str2 = new StringBuffer("RajaRamMohanRoy");

//		System.out.println(str.length());
//		System.out.println(str.compareTo(""));

//		if(str.equals(str2.toString()))
//			System.out.println("equal");
//		else {
//			System.out.println("not equal");
//		}

//		if(str.compareTo(str1)==0)
//			System.out.println("equal");
//		else if (str.compareTo(str1)>0) {
//			System.out.println("str1 is greater");
//		}else {
//			System.out.println("str is greater");
//			
//		}

//		if(str.regionMatches(true,0, str1, 4, 2))
//			System.out.println("equal");
//		else {
//			System.out.println(" not equal");
//			
//		}
//		if(str.contentEquals(str2))
//			System.out.println("equal");
//		else
//			System.out.println(" not equal");
//		
//		System.out.println(str.charAt(0));
//		char c[]=str.toCharArray();
//		for(char a:c) {
//			System.out.print(a+"\t");
//		}
//		System.out.println();

//		System.out.println(str.indexOf('y'));
//		System.out.println(str.indexOf("y"));
//		System.out.println(str.indexOf("Ra",1));
//		
//		String s= str.substring(4, 7);
//		System.out.println(s);

//		String s= "       raja      ";
//		System.out.println(s.length());
//		System.out.println(s.stripTrailing().length());
//		System.out.println(s.stripLeading().length());
//		System.out.println(s.strip().length());
//		System.out.println(s.trim().length());

//		String s="my name is Rustam Ali";
//		String s1[]=s.split(" ",2);
//		System.out.println(s1.length);
//		for(String a:s1)
//			System.out.println(a);

//		System.out.println(str.toLowerCase());
//		System.out.println(str.toUpperCase());
//		System.out.println(str.isEmpty());

//		System.out.println(str.repeat(3));
		System.out.println(str.replaceFirst("R", "M"));
		System.out.println(str.replaceAll("R", "M"));
		System.out.println(str.replaceAll("Ram(.)", "india"));
		
		
	}
}
