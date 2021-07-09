class RevString
{
  public static void main ( string args[])
{
  String s="pavani";
  String rev=" ";
for(int i=s.length()-1;i>=0;i--)
{
rev=rev+s.charAt(i);
}
if(s.equals(rev))
{
System.out.println("palindrome string);
}
else{
System.out.println("not a palindrome string");
}
}
}
