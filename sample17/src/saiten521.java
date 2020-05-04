import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class saiten521 {
	public static void main(String[] args) throws IOException{



		;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test,practice,attendance;
        System.out.println("テストの点数を入力してください。");
        test = Integer.parseInt(reader.readLine());

        System.out.println("演習の点数を入力してください。");
		practice = Integer.parseInt(reader.readLine());

		System.out.println("出席点を入力してください。");

		attendance = Integer.parseInt(reader.readLine());


		if((test >= 80) && (practice >= 80)) {
   		 System.out.println("あなたの成績はAです。");

   		if((test >= 80) && (practice < 80)) {
      		 System.out.println("あなたの成績はBです。");

      	if((test < 80) && (practice >= 80)) {
      	   	 System.out.println("あなたの成績はBです。");

      	if((test < 80) && (practice < 80) && (attendance >= 50)) {
         		 System.out.println("あなたの成績はCです。");

        if((test < 80) && (practice < 80) && (attendance < 50)) {
            	 System.out.println("あなたの成績はDです。");
        }
     }
    }
   }
  }
 }
}
