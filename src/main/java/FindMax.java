public class FindMax {
    public static int find(int[] tab,int start,int end){
        if(start == end){
            return start;
        }
        int m = find(tab,start,Math.floorDiv(start+end,2));
        int u = find(tab,Math.floorDiv(start+end,2)+1,end);
        if(tab[m]>tab[u]){
            return m;
        }
        else {
            return u;
        }

    }
}
