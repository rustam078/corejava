
public class CharacterCount {

	public static void main(String[] args) {
		String str ="Sachin @is the #1 Player in the World$";
		
		char s[]=str.toCharArray();
		int vowel,consunant,digit,symbol,space; 
		vowel=consunant=digit=symbol=space=0;
		for(int i=0;i<s.length;i++) {
			if(Character.isLetter(s[i])) {
				if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u') {
					vowel++;
				}else {
					consunant++;
				}
			}
			else if (Character.isDigit(s[i])) {
				digit++;
			}
			else if (Character.isWhitespace(s[i])) {
				space++;
			}else {
				symbol++;
			}
		}
		System.out.println("vowel= "+vowel);
		System.out.println("consunant= "+consunant);
		System.out.println("Digit= "+digit);
		System.out.println("White Space= "+space);
		System.out.println("Symbol= "+symbol);
		System.out.println(str.length()+"==="+(vowel+consunant+digit+space+symbol));
	}
}
