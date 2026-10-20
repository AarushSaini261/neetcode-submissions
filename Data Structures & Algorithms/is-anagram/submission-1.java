class Solution {
    public boolean isAnagram(String s, String t) {
        boolean check=false;
        int len=s.length();
        int len2=t.length();
        s=s.toLowerCase();
        t=t.toLowerCase();
        if (len != len2) {
        	check=false;
        }
        
        else {
        	char []ch1=s.toCharArray();
        	char []ch2=t.toCharArray();
        	//boolean []b=new boolean[len];
        	int count=0;
        	for(int i=0; i<len; i++) {
        		for(int j=0; j<len; j++) {
        			if(ch1[i]==ch2[j]) {
        				count++;
        				ch2[j]=' ';
        				break;
        			}
        		}
        	}
        	if(count == len) {
        		check=true;
        	}
        }
        return check;
    }
}


