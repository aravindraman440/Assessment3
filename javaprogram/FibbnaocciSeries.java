package javaprogram;

public class FibbnaocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=0;
int num2=1;
int nextnum;
for (int i = 0; i < 7; i++) {
	nextnum=num1+num2;
	num1=num2;
	num2=nextnum;
	System.out.print(nextnum+ " ");
}
	}

}
