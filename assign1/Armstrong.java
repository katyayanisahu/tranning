package com.techment.assign1;
class Armstrong
{ 
    public static void main(String args[])
    {
    int num=153,org_num,result=0,rem;
    org_num=num;
    while(org_num!=0)
    {
        rem=org_num%10;
        result+=Math.pow(rem,3);
        org_num/=10;
    }
    if(result == num)
      System.out.println(num + "is an armstrong no");
    else
      System.out.println(num + "is not an armstrong no");
    }
}
