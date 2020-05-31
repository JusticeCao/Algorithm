public class demo2{
  public static void main(String[] args) {
        // 1/2 + 1/3 + ... + 1/100 µÄ×ÜºÍ
        double a = 2;
        double sum = 0;
        while (a <= 100) {
            sum += 1/a;
            a++;
        }
        System.out.println(sum);
    }
}