package floodfill;
import java.io.*;
import java.util.ArrayList;
import java.util.List; 

public class combination {
	static List<String> gfg = new ArrayList<String>(); 
    // Driver Code 
    public static void main (String[] args) 
    { 
    	String str = "1243"; 
        int n = str.length(); 
        combination permutation = new combination();         
        permutation.permute(str, 0, n-1,gfg); 
        List<String> gfg2 = new ArrayList<String>(); 
        for (String s:gfg)
        {        	
        	int a= Integer.parseInt( String.valueOf(s.charAt(0)));
        	int b= Integer.parseInt( String.valueOf(s.charAt(1)));
        	int c= Integer.parseInt( String.valueOf(s.charAt(2)));
        	int d= Integer.parseInt( String.valueOf(s.charAt(3)));
        	if ((a==0)&&(b<=9)&&(c<=5)&&(d<=9))
        	{
        		gfg2.add(a+""+b+":"+c+""+d);
        	}
        	else if ((a==1)&&(b<=9)&&(c<=5)&&(d<=9))
        	{
        		gfg2.add(a+""+b+":"+c+""+d);
        	}
        	else if ((a==2)&&(b<=3)&&(c<=5)&&(d<=9))
        	{
        		gfg2.add(a+""+b+":"+c+""+d);
        	}
        }
        for (String s:gfg2)
        {
        	
        	System.out.println(s);
        }
        
        
    } 
     
    private void permute(String str, int l, int length,List<String> gfg) 
    { 
    	
        if (l == length) 
        	gfg.add(str); 
        else
        { 
            for (int i = l; i <= length; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, length,gfg); 
                str = swap(str,l,i);                
            }        
            
        }
		
    } 

    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
 
} 
