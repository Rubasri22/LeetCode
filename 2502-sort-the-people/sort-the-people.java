class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=heights.length;
        HashMap<Integer, String> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String res[]=new String[n];
        int a=0;
        for(int i=n-1;i>=0;i--){
            res[a]=map.get(heights[i]);
            a++;
        }
        return res;
    }
}