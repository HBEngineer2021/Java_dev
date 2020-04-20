import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogicalSumExample2 {
public static void main(String[] args) throws IOException{

		System.out.println("年齢を入力してください：");

		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();

		int age = Integer.parseInt(str);

		if(age < 13 || age >= 65) {
   		 System.out.println("入場料は無料です。");
   	 } else {
   		 System.out.println("料金が必要です。");
   	 }
    }
}
