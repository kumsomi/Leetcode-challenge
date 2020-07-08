class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int n=(N-1)%14+1;
        while(n>0)
        {
            int temp[]=new int[cells.length];
            for(int i=0;i<cells.length;i++)
            {
                if(i==0||i==cells.length-1)
                {
                    temp[i]=0;
                    continue;
                }
            
            if(cells[i-1]==cells[i+1])
                    temp[i]=1;
            else
                temp[i]=0;
            }
            
            cells=temp;
            n--;    
    }
        return cells;
}
}
