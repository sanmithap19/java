package arrays;
import java.util.*;
public class buysell {
	
	public static int buyandsellstocks(int prices[]) {
		int buyprice=Integer.MAX_VALUE;
		int maxprofit=0;
		for(int i=0;i<prices[i];i++) {
			if(buyprice<prices[i]) {
				int profit=prices[i]-buyprice;
				maxprofit=Math.max(maxprofit, profit);
			}else {
				buyprice=prices[i] ;
				
					
				}
			}
		return  maxprofit;
		}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int prices[]= {7,1,5,3,6,4};
       System.out.println(buyandsellstocks(prices));
	}

}
