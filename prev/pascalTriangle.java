class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstrow =new ArrayList<>();
        firstrow.add(1);
        triangle.add(firstrow);
        for(int i=1; i<numRows;i++){
            List<Integer> prevrow = triangle.get(i-1);
            List<Integer> currrow= new ArrayList<>();
            currrow.add(1);
            for(int j=1; j<i; j++){
                currrow.add(prevrow.get(j-1)+ prevrow.get(j));
            }

            currrow.add(1); 
            triangle.add(currrow);           
        }
        return triangle;
    }
}