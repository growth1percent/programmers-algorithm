class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            int combined = arr1[i] | arr2[i];
            
            String binaryString = String.format("%" + n + "s", Integer.toBinaryString(combined));
            
            binaryString = binaryString.replace('1', '#');
            binaryString = binaryString.replace('0', ' ');
            
            answer[i] = binaryString;
        }
        
        return answer;
    }
}