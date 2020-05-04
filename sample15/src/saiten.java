
public class saiten {
    public static void main(String[] args) {
    	int score;
    	score = 101;
    	if(score > 100) {
    		System.out.println("入力値が不正です。");
    	} else if(score >= 90) {
        	System.out.println("あなたの成績はSです");
    	} else if(score >= 80) {
        	System.out.println("あなたの成績はAです");
    	} else if(score >= 70) {
        	System.out.println("あなたの成績はBです");
    	} else if(score >= 60) {
        	System.out.println("あなたの成績はCです");
    	} else if(score >= 0) {
        	System.out.println("あなたの成績はDです");
    	} else {
        	System.out.println("入力値が不正です。");
    	}
    }
}
