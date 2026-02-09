class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> li=new ArrayList<List<Integer>>();
         for(int i=0;i<numRows;i++){
            List<Integer> li1=new ArrayList<>();
            long val=1;
            for(int j=0;j<=i;j++){
            li1.add((int) val);
            val=val*(i-j)/(j+1);
            }
            li.add(li1);
         }
         return li;
    }
}