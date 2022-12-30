
public class NumberCount {
	public static void main(String[] args) {
		long num1 = 940143748935203129l;
		int temp;
		for (int i = 0; i <= 9; i++) {
			int count = 0;
			long num = num1;
			while (num > 0) {
				temp = (int) (num % 10);
				if (temp == i)
					count++;
				num /= 10;

			}
			if (count > 0)
				System.out.println(i + " = " + count);
		}
	}
}

