public class Demo35{
	public static void main(String[] args){
		long sum=0;
		for(int i=1;i<=20;i++){
			long count=1;
			for(int j=1;j<=i;j++){
				count *=i*j;
			}
			sum+=count;
		}
		System.out.println(sum);
		
	}
	
}