class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str="";
        int []len=new int[strs.length];

        for (int i=0; i<strs.length; i++) {
            len[i]=strs[i].length();
            System.out.println(len[i]);
        }
        int maxLen=len[0];
        for (int i=0; i<len.length; i++) {
            if(len[i]<maxLen) {
                maxLen=len[i];
            }
        }
        char[][]ch=new char[strs.length][maxLen];
        char []ans=new char[maxLen];

        for (int i=0; i<strs.length; i++) {
            for (int j = 0; j<maxLen; j++) {
                ch[i][j]='.';
            }
        }

        for (int i=0; i<strs.length; i++) {
            char []now=strs[i].toCharArray();
            for (int j=0; j<now.length && j<maxLen; j++) {
                ch[i][j]=now[j];
            }
        }

        int req=0;
        for (int i=0; i<maxLen; i++) {
            boolean match=true;
            for(int j=1; j<strs.length; j++) {
                if (ch[0][i] != ch[j][i]) {
                    match=false;
                    break;
                }
            }
            if (!match) {
                break;
            }
            ans[req]=ch[0][i];
            req++;
        }
        char []real=new char[req];
        for (int i=0; i<req; i++) {
            real[i]=ans[i];
        }
        str=new String(real);
        return str;
    }
}