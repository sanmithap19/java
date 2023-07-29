package bitmanupliation;

public class removeduplicate {
	public static void removeduplicates(String str,int idx,StringBuilder newStr,boolean map[]) {
		if(idx==str.length()) {
			System.out.println(newStr);
			return;
		}
		//kaam
		char currChar=str.charAt(idx);
		if(map[currChar-'a']==true) {
			//duplicate
			removeduplicates(str,idx+1,newStr,map);
		}else {
			map[currChar-'a']=true;
			removeduplicates(str,idx+1,newStr.append(currChar),map);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="maggie";
		removeduplicates(str,0,new StringBuilder(""),new boolean[26]);

	}

}
