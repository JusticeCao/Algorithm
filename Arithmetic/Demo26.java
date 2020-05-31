public class Demo26{
	public static void main(String[] args){
		long sum = 0;
		long n = 1;
		for(int i =1;i<=20;i++){
				n *=i;
				sum +=n;
		}
		System.out.println("sum:"+sum);
	}
}