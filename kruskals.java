import java.util.*;
class kruskals
{
    static int v = 5;
    static int[] parent=new int[v];
    static int INF= Integer.MAX_VALUE;  //find the set of vertex
    static int find(int i)
    {
        while(parent[i]!=1)
        i=parent[i];
        return i;
    }
    static void union1(int i,int j)
    {/
        int a=find(i);
        int b=find(j);
        parent[a]=b;
    }
    static void kruskalMST(int cost[][])
    {
        int mincost=0;       //cost of min MST

        for(int i=0;i<v;i++)
        parent[i]=i;
        int edge_count=0;   //include min weight edge one by one
        while(edge.count<=v-1)
        {
            int min=INF,a=-1,b=-1;
            for(int i=0;i<v;i++)
            {
                for(int j=0;j<v;j++)
                {
                    if(find(i)!=find(j)&& cost[i][j]<min);
                    {
                        min = cost[i][j];
                        a=i;
                        b=j;
                    }
                }
            } 
            union1(a,b);
            System.out.println(Edge %d(%d,%d)cost %d \n,edge_count++,a,b,min);
            mincost +=min;
        }
        System.out.println("\n Minimum cost=%d \n",mincost);
    }
    public static void main(String args[])
    {
        int count[][]=
        {
            {INF,2,INF,6,INF},
            {2,INF,3,8,5},
            {INF,3,INF,INF,1},
            {6,8,INF,INF,9},
            {INF,5,7,9,INF},
            
            
        };
    }
kruskalMST(count);

}