package javaprogram;

public class OddINdexUpperCase {
public static void main(String[] args) {
		String name = "aravindfromkarur";
			char[] charArray = name.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				for (int j = 0; j < charArray.length; j++) {
					
				}
				if (i%2 ==  0) {
				//	charArray[i] = (char)((int)(charArray[i])-32);
					
					System.out.print(Character.toUpperCase(charArray[i])+" ");
				}
				else {
					System.out.print(charArray[i]+" ");
				}
			}
		}
}
