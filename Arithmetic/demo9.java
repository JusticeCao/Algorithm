public class demo9{
	public static void main(String[] args){
	int a=1;
	int b=2;
	int c=3;
	int max1=a>b ? a:b;
	max1=max1>c ? max1:c;
	int max2=(a>b&&a>c)?a:(b>c?b:c);
	System.out.println(max1);
	System.out.println(max2);
	}
}