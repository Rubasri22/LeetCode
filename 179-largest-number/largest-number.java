class Solution {
    public String largestNumber(int[] nums) {
        String[] p=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            p[i]=nums[i]+"";
        }
        //String s=new StringBuilder(p).reverse().toString();
        //return s;
        /*Arrays.sort(p,new Comparator<String>(){
            @Override
            public int compare(String a,String b){
                String s1=a+b;
                String s2=b+a;
                return s2.compareTo(s1);
            }
        });*/
        for(int i=0;i<p.length-1;i++){
            for(int j=0;j<p.length-i-1;j++){
                String s1=p[j]+p[j+1];
                String s2=p[j+1]+p[j];
                /*long n1=Long.parseLong(s1);
                long n2=Long.parseLong(s2);*/
                if(s1.compareTo(s2)<0){
                    String temp=p[j+1];
                    p[j+1]=p[j];
                    p[j]=temp;
                }
            }
        }
        if(p[0].equals("0")){
            return "0";
        }
        /*if(p[0].equals("1000000000")){
            return "0";
        }*/
        StringBuilder ln=new StringBuilder();
        for(String num:p){
            ln.append(num);
        }
        return ln.toString(); 
    }
}