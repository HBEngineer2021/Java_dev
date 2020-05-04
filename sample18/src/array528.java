
public class array528 {
     public static void main(String[] args) {
    	 int[][] scores = { {50,55,70,65,80},
    			            {60,77,90,73,55},
    			            {66,85,76,95,98}
    	 };
    	 
		int sum_all = 0,sum;
    	 
    	 for(int i = 0;i < 3;i++) {
    		 sum=0;
    		 for(int j=0;j<5;j++) {
    			 sum+=scores[i][j];
    		 }
    	 double average = (double)sum/5.;
    	 if(i==0) {
    	 System.out.printf("2015 年度の平均点：%.1f\n",average);
    	 }else if(i== 1) {
    	 System.out.printf("2016 年度の平均点：%.1f\n",average);
    	 } else {
    	 System.out.printf("2017 年度の平均点：%.1f\n",average);
    	 
    	 }
    	 sum_all+=sum;
     }
     double average = (double)sum_all/(5.*3);
     System.out.printf("3年間の平均点：%.1f\n",average);
    	 }
}


