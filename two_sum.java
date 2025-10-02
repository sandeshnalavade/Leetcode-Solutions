class Solution {
    public int[] twoSum(int[] a, int target) {
    
        int n=a.length;
        
        int arr[]=new int[2];
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }
}
