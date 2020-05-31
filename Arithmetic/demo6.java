public class demo6{
public static void main(String[] args){
	int n1=1;
	int n2=1;
	int next=0;
	int sum =0;
	for(int i=0;i< 8;i++){
	next=n1+n2;
	n1=n2;
	n2=next;
	sum = n1+n2+next;
		}
		System.out.println(sum);
	}
}
