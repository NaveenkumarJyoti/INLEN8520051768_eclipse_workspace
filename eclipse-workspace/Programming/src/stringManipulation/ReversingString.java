package stringManipulation;

public class ReversingString 
{
	public static void main(String[] args) 
	{
		String  s="Monsieur",rev="";

		//Using charAt()
		for(int i=s.length()-1;i>=0;i--) 
			rev+=s.charAt(i);
		System.out.println(rev);

		//Converting string to char array
		char arr[]=s.toCharArray();
		String rev1="";
		for(int i=arr.length-1;i>=0;i--)
			rev1+=arr[i];
		System.out.println(rev1);
		
		//Using reverse() method of StringBuffer and StringBuilder
		StringBuffer sb=new StringBuffer("Monsieur");
		System.out.println(sb.reverse());
	}
}
