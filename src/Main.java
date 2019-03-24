import java.util.*;

public class Main
{ int i;
	public static void main(String[] args)
	{int word=1;
	String str="count no of words";
	for(int i=0;i<str.length();++i){
		if(str.charAt(i)==' ')
			word++;
		
	
	}System.out.println("no of words= "+word);
		System.out.println("no of space= "+(word-1));
		}
}
