
public class conversion {

	public static void main(String[] args) {
		String str="My NaME iS RuSTaM Ali";
		String result="";
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
			 result+= (char)(str.charAt(i)+32);
			}
			else if (Character.isWhitespace(str.charAt(i))) {
				result+=" ";
			}
			else {
				result+= (char)(str.charAt(i)-32);
				
			}
		}
		System.out.println(str);
		System.out.println(result);
//		System.out.println(str.toLowerCase());
	}
}
