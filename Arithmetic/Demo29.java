public class Demo29{
	public static void main(String[] args){
		double sum=0;
		int i =1;
		double num= (i+1)/i;
		do{
			 sum +=num; 
				i++;
		} while(i<=20);
		System.out.println(sum);
	}
}