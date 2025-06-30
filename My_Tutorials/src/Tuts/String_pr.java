package Tuts;

public class String_pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String name="Arjun";//string literal
       String sname =new String("Mahale");//using new keyword

       
       System.out.println(name.charAt(0));
       
       
       name=name.toUpperCase();
       name=name.concat(sname);
       //string reversing
       System.out.println("string reverse");
     
       for(int i=name.length()-1;i>=0;i--)
       {
    	   System.out.print(name.charAt(i));
       }
       
       //string comparison ->1]equals (compares actual value)   2]== (compares refernce )   3]comapare (lexicographically comapares -> 1-checks length 2- for same 0 for greater +ve value  for smaller -ve value)
       System.out.println("\n");
       
       if(name.equals(sname))
    	   {
    	   System.out.println("both strings are same.");
    	   }
       else
       {
    	   System.out.println("both strings are not same.");

       }
       if(name==sname)
       {
    	   System.out.println("both strings are same.");
       }
       else
       {
    	   System.out.println("both strings are not same.");
    	   
       }
       if(name.compareTo(sname)==0)
       {
    	   System.out.println("both strings are same.");
       }
       else
       {
    	   System.out.println("both strings are not same.");
    	   
       }
       
       
       
       //string methods -> toUppercase(),toLowercase(),equalsIgnorcase(),equals() ,concat(),substring(beginIndex,startIndex),startswith(),endswith(),toCharArray()-converts string to array
       
       
       
       char[] to_char=name.toCharArray();
       System.out.println(" reprentation of tocharArray()");
       for(int i=0;i<to_char.length;i++)
       {
    	   System.out.print(" "+to_char[i]);
       }
       
	}

}

