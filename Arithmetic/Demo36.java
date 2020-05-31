public class Demo36{
	public static void main(String[] args){
		int number = 2345678;
		boolean flag=true;
		while(flag){
		int b = number%10;
		System.out.print(b);
		number/=10;
		if(number==0){
		flag=false;
			}
		}
	}
}