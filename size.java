#include<stdio.h>
#include<conio.h>
int a(const void*d,const void*s)
{
return(*(char*)s)-(*(char*d));
}
void main()
{
int i,j,s;
char s[2*10];
scanf("%d",&a);
j=a;
while(i<a)
{
i=0;
s[i]='B';
s[j+1]='W';
j++;
}
s[a*2]='\0';
qsort(n,2*a,sizeof(char),a);
printf("%s",s);
}
