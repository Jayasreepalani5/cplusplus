kiprime number and composite number

int arr[]={4,54,29,71,7,59,98,23};
int com=0,pri=0;
for(int i=0;i<arr.length;i++)
{
 int c=0;
 for(int j=1;j<arr[i];j++)
 {
 if(arr[i]%j==0)
 c++;
 }
 if(c>1)
 com++;
 else
 pri++;
}
System.out.print("Composite Number: "+com);
System.out.println("\nPrime number: "+pri);


nth minimum and maximum

int arr[]={14, 16, 87, 36, 25, 89, 34};
int len=arr.length;
for(int i=0;i<len;i++) {
 for (int j = i + 1; j < len; j++) {
 if (arr[i] > arr[j]) {
 int temp = arr[i];
 arr[i] = arr[j];
 arr[j] = temp;
 }
 }
}
int m=1,n=3;
int max=arr[len-m];
int min=arr[n-1];
System.out.print(m+" maximum number = "+max);
System.out.print("\n"+n+" minimum number = "+min);
int sum=max+min;
int Diff=max-min;
System.out.print("\nSum = "+sum);
System.out.print("\nDifference = "+Diff);


Bank availability 

int n1=500,d1=4,n2=100,d2=20,n3=200,d3=32,n4=2000,d4=1;
int Total=(n1*d1)+(n2*d2)+(n3*d3)+(n4*d4);
System.out.print("Total Available Balance in ATM: "+Total);


palindrome or not

String s1="MADAM";
String s2="";
int len=s1.length();
for(int i=len-1;i>=0;i--)
{
 s2=s2+s1.charAt(i);
}
if(s1.equals(s2))
 System.out.print("Palindrome");
else
 System.out.print("Not palindrome");

decimal to binary and octal

int dec=15;
String bin=Integer.toBinaryString(dec);
String oct=Integer.toOctalString(dec);
System.out.println("Binary number = "+bin);
System.out.print("octal number = "+oct);


employee bones

Scanner input=new Scanner(System.in);
int a,b;
double bonus=0;
System.out.print("Enter the grade of the employee :");
char a1=input.next().charAt(0);
System.out.print("Enter the salary of employee :");
int b1=input.nextInt();
if(a1=='A')
{
 bonus=b1*(0.05);
 if(b1<10000)
 {
 bonus=bonus+b1*(0.02);
 }
 System.out.println("salary = "+b1);
 System.out.println("bonus = "+bonus);
 System.out.println("total to be paid ="+(b1+bonus));
}
else if(a1=='B')
{
 bonus=b1*(0.1);
 if(b1<10000)
 {
 bonus=bonus+b1*(0.02);
 }
 System.out.println("salary = "+b1);
 System.out.println("bonus = "+bonus);
 System.out.println("total to be paid ="+(b1+bonus));
}
else {
 System.out.print("Enter valid grade");


perfect numbers 

Scanner input=new Scanner(System.in);
int n=input.nextInt();
int sum=0,temp=0;
for(int j=2;j<=1000;j++)
{
 if(n>temp)
 sum=1;
 for(int i=2;i<j;i++)
 {
 if(j%i==0)
 sum=sum+i;
 }
 if(sum==j)
 {
 System.out.print(j+" ");
 temp=temp+1;

print multiplication table

int M=4;
int N=5;
for(int i=1;i<=N;i++)
{
 System.out.println(i+"x"+M+"="+(i*M));
}

write a program that stops after seeing -1 

int i=0,j=0;
int n=0;
int s1=0,s2=0;
int possum=0,negsum=0;
while(n!=-1)
{
 n=input.nextInt();
 if(n==-1)
 break;
 if(n>0)
 {
 i++;
 s1=s1+n;
 }
 else
 {
 j++;
 s2=s2+n;
 }
}
System.out.println(i);
System.out.println(j);
double pos=(s1/i);
double neg=s2/j;
System.out.println("The average of positive: "+pos);
System.out.println("The average of negative: "+neg);



read a program till * comes on the way



Scanner input=new Scanner(System.in);
System.out.println("Enter * to exit....");
char c='0';
int lower=0,upper=0,digit=0;
while(c!='*')
{
 c=input.next().charAt(0);
 if(c>=65 && c<=90)
 upper=upper+1;
 else if(c>=97 && c<=122)
 lower=lower+1;
 else if(c>=48 && c<=57)
 digit=digit+1;
}
System.out.println("Lower: "+lower);
System.out.println("Upper: "+upper);
System.out.println("Digit: "+digit);



factorial number using recursion

Scanner input=new Scanner(System.in);
 int n=input.nextInt();
 int fact=1;
 for(int i=1;i<=n;i++)
 {
 fact=fact*i;
 }
 System.out.println("The factorial of "+n+" is: "+fact);


to find the nth largest number in an array


Scanner input = new Scanner(System.in);
int a[] = {14, 67, 48, 23, 5, 62};
int len = a.length;
Arrays.sort(a);binary to octal and
int N = 4;
System.out.println(N + " Largest number: " + a[len-N]):


to find binary to decimal and octal

Scanner input=new Scanner(System.in);
String bin=input.nextLine();
int dec=Integer.parseInt(bin,2);
System.out.println("Decimal: "+dec);
String oct=Integer.toOctalString(dec);
System.out.println("Octal: "+oct);



remove the duplicate in the array

Scanner input=new Scanner(System.in);
System.out.print("Enter the number of elements: ");
int n=input.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
 System.out.print("Enter element: ");
 a[i]=input.nextInt();
}
for(int i=0;i<n;i++)
{
 for(int j=i+1;j<n;j++)
 {
 if(a[i]==a[j])
 {
 for(int k=j;k<n-1;k++)
 {
 a[k]=a[k+1];
 }
 j--;
 n--;
 }
 }
}
for(int i=0;i<n;i++)




