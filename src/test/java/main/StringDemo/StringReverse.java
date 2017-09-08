package test.java.main.StringDemo;

public class StringReverse {
	static void reverse(String s, int t) {
		if (t > 0) {

			System.out.print(s.charAt(t - 1));
			t--;
			reverse(s, t);
		}
	}

	public static void main(String[] args) {
		String s = " ";
		StringReverse rs = new StringReverse();
		rs.reverse(s, s.length());
	}
}
