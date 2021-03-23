package javaprogram;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int length = text.length();
		System.out.println(length);
		char[] charArray = text.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char charAt = text.charAt(i);
			System.out.print(charAt+" ");
		}
	}

}
