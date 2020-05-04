import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class saiten514 {
	public static void main(String[] args) throws IOException{

		System.out.println("テストの点数を入力してください：");
		System.out.println("演習の点数を入力してください：");
		System.out.println("出席点を入力してください：");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int test = Integer.parseInt(str);
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String str2 = reader2.readLine();
		int practice = Integer.parseInt(str2);
		BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
		String str3 = reader3.readLine();
		int attendance = Integer.parseInt(str3);
		

		if(test >= 80 || practice >= 80) {
   		 System.out.println("あなたの成績はAです。");
   		 
   		if(test >= 80 || practice < 80) {
      		 System.out.println("あなたの成績はBです。");
      		 
      	if(test < 80 || practice >= 80) {
      	   	 System.out.println("あなたの成績はBです。");
      	   	 
      	if(test < 80 || practice < 80 || attendance >= 50) {
         		 System.out.println("あなたの成績はCです。");
         		 
        if(test < 80 || practice < 80 || attendance < 50) {
            	 System.out.println("あなたの成績はDです。");
        }
     }
    }
   }
  }
 }
}
