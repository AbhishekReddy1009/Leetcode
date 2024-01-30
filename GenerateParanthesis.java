class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
         allPara(result, "" , 0 , 0, n);
         return result;
    }
    void allPara(List<String> result, String str, int open, int close, int n){
        if(str.length()== 2*n){
            result.add(str);
            return;
        }

        if(open<n){
        allPara(result, str + "(", open + 1 ,close ,n);
        }
        if(close<open){
        allPara(result, str + ")", open, close + 1, n);
        }    
    }   
}