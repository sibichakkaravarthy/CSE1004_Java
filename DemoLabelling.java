class DemoLabelling
{ 
    public static void main(String args[]) 
    { 
        boolean t = true; 
  
        sibi: 
        { 
            chakkaravarthy: 
            { 
                vitap: 
                { 
                    System.out.println("I will get executed first"); 
 
                    if (t) 
                     break chakkaravarthy; 
                    System.out.println("I AM THE FIRST BLOCK."); 
                } 
                System.out.println("i am the second block"); 
            } 
  
             
            System.out.println("This is after second block."); 
        } 
    } 
} 