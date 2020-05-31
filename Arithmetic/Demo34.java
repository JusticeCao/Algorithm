public class Demo34{
	public static void main(String[] args){
		int count =0;
		for(int i =101;i<=200;i+=2){
			for(int j =2;j<=i;j++){
			if(i%j ==0){
				count++;
				break;
			} 
				if(i%j !=0){
			System.out.println(i);
				}
			}
		}
	}
}