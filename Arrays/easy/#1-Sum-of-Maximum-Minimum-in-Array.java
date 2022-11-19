class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        if (N <= 1) return A[0];
        else{
            int mini = A[0];
            int maxi = A[1];
            if (mini > maxi){
                int temp = mini;
                mini = maxi;
                maxi = temp;
            }
            for(int x : A){
                if (x > maxi) maxi = x;
                if (x < mini) mini = x;
            }
            return maxi + mini;
        }
    }
}
