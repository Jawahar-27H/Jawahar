class posnegzero
{
public static void main(String[] args)
{
int a=Integer.parseInt(args[0]);
if(a>0){
System.out.println("The given no is positive"+a);
}
else if(a<0){
System.out.println("The given number is negative"+a);
}
else{
System.out.println("The given number is zero"+a);
}
}
}