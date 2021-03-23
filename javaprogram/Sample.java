package javaprogram;

public class Sample {
private static char charAt;

public static void main(String[] args) {
	System.out.println("aravind like as ajava developer");
	String txt = "aravind like as ajava developer";
	int length = txt.length();
	System.out.println(length);
//	for (int i = 0; i < length; i++) {
//		char charAt = txt.charAt(i);
//		System.out.print(charAt+ "  ");
for (int i = 0; i < length; i++) {
	char charAt = txt.charAt(i);
	System.out.print(charAt+" ");
	//System.out.println();

System.out.println();
	for (int j=i+1;j <length ; j--) {
	char charAt2 = txt.charAt(i);
	System.out.print(charAt2+" ");
		if(charAt==charAt2) {
			System.out.println("print duplicate"+charAt2
					);
		
	}
		else {
			System.out.println("=======");
		}
	
	}
}
}

	
}