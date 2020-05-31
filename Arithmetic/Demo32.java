public class Demo32{
	public static void main(String[] args){
		for (int i = 1;i<=33;i++){
			for(int j = 1;j<=50;j++){
			int k = 100-(i+j);
			if(k%3 ==0&&3*i+j*2+k/3 ==100){
				System.out.println(k+","+j+","+i+"\t");
				}
			}
		}
		
	}
	
}