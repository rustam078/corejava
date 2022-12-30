public class ReplaceString {

	public static void replace(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			s = s.replaceAll("[aeiou]", "*");
			arr[i] = s;

		}
		for (String s2 : arr) {
			System.out.println(s2);
		}
	}

	public static void main(String[] args) {
		String[] student = { "rustam", "simran", "atul", "dravid" };
		replace(student);
	}

}
