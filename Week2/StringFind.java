class Solution {
    public boolean isAnagram(String s, String t) {
      int count=0;
        char[] s1= s.toCharArray();
        char[] t1=t.toCharArray();
        if(s1.length!=t1.length){
            return false;
        }
        for(int i=0;i<s1.length;i++){
             for(int j=0;j<t1.length;j++){
                if(s1[i]==t1[j]){
                    t1[j]='0';
                    count++;
                    break;
                }
             }
//            System.out.println(s1[i]+" "+t1[i]);
        }
        if(count==s1.length){
            return true;
        }else{
            return false;
        }
    }
}