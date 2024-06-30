/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
		    
		    int dr_dsa = sc.nextInt();
		    int dr_toc = sc.nextInt();
		    int dr_dm = sc.nextInt();
		    int s_dsa = sc.nextInt();
		    int s_toc = sc.nextInt();
		    int s_dm = sc.nextInt();

		    if(dr_dsa+dr_dm+dr_toc  > s_dm+s_dsa+s_toc){
		        
		        System.out.print("DRAGON");
		    }
		    
		    		    if(dr_dsa+dr_dm+dr_toc  < s_dm+s_dsa+s_toc){
		        
		        System.out.print("SLOTH");
		    }
		    
		    if(dr_dsa+dr_dm+dr_toc  == s_dm+s_dsa+s_toc){
		        
		        if(dr_dsa > s_dsa){
		            System.out.print("DRAGON");
		        } else if(dr_dsa < s_dsa){
		            System.out.print("SLOTH");
		    }
		    
		    if(dr_dsa == s_dsa){
		        
		        
		        if (dr_toc > s_toc) {
		            
		            System.out.print("DRAGON");
		            
		        } else if (dr_toc < s_toc){
		            System.out.print("SLOTH");
		        } else if(dr_toc == s_toc){
		            		        if (dr_dm > s_dm) {
		            System.out.print("DRAGON");
		        } else if (dr_dm < s_dm){
		            System.out.print("SLOTH");

		            
		            
		            
		            }
		    
		}
	}
}
        }
    }}