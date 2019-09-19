import java.util.*;
public class LabellingPattern {  
public static void main(String[] args) {

    int n;
    Scanner in = new Scanner(System.in); 
    n = in.nextInt(); 
    aa:  
        for(int i=1;i<=n;i++){  
            bb:  
                for(int j=1;j<=n;j++){  
                    if(i==2&&j==2){  
                        //continue bb;
                        break bb;   
                    }  
                    System.out.println(i+" "+j);  
                }  
        }  
}  
}  