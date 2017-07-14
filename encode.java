#include<stdio.h>
#include<conio.h>
char* encode(char* str) {
   int i = 0;
   while (str[i] != '\0')
    {
      str[i] = str[i]-30;
   }
   return (str);
}
void main() {

   char *str;
   printf("\nEnter the String to Encode is : ");
   gets(str);
   str = encode(str);
   printf("\nEncoded String  is: %s", str);
   getch();
}