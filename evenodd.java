class evenodd{
public static void main(String[] args){
int a=Integer.parseInt(args[0]);
if((a%2==0)&&(a!=0))
System.out.println("the no is even");
else if((a%2!=0)&&(a!=0))
System.out.println("the no is odd");
else
System.out.println("the no is zero");
}
}