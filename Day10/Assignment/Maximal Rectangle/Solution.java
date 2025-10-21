import java.util.*;
class Solution {
    public int largestRectangle(int[] arr){
        int maxArea = 0;
        Stack <Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while(!st.empty() && arr[st.peek()] > arr[i]){
                int element = st.peek();
                st.pop();
                int nse = i;
                int pse = st.empty() ? -1 : st.peek();

                maxArea = Math.max(maxArea, arr[element] * (nse - pse -1));
            }
            st.push(i);
        }
        while(!st.empty()){
            int nse = arr.length;
            int ele = st.peek();
            st.pop();
            int pse = st.empty() ? -1 : st.peek();

            maxArea = Math.max(maxArea, arr[ele] * (nse - pse -1));            
        }

        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        int [][] pSum = new int[n][m];
        int maxArea = 0;
        for(int i = 0; i < m; i++){
            int sum =0;
            for(int j = 0; j < n; j++){
                
                if(matrix[j][i] == '0'){
                    sum = 0;
                }
                else {sum += 1;}
                pSum[j][i] = sum; 
            }
        }
        for(int i = 0; i < n; i++){
             maxArea = Math.max(maxArea, largestRectangle(pSum[i]));
        }
        return maxArea;
    }
}