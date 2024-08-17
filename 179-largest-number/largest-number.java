class Solution {
    public String largestNumber(int[] nums) {
        String[] p=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            p[i]=nums[i]+"";
        }
        //String s=new StringBuilder(p).reverse().toString();
        //return s;
        Arrays.sort(p,new Comparator<String>(){
            @Override
            public int compare(String a,String b){
                String s1=a+b;
                String s2=b+a;
                return s2.compareTo(s1);
            }
        });
        if(p[0].equals("0")){
            return "0";
        }
        StringBuilder ln=new StringBuilder();
        for(String num:p){
            ln.append(num);
        }
        return ln.toString(); 
    }
}