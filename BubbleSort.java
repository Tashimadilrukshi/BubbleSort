
import java.util.Scanner;

public class BubbleSort {
    
    
    
     public static int[] sort(int[] a){
         int temp;
            for(int i=0; i<a.length; i++){
                int[] b=new int[a.length-i];  
                for(int j=0; j<b.length; j++){
                    b[j] = a[j];   
                }
                for(int j=0; j<b.length-1; j++){
                      if(b[j]>b[j+1]){
                        temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
            
            return a;
     }
        
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        //to get the number of element of the array
        int n = s.nextInt();
        
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        
        System.out.println();
        
        int[] b = sort(a);
        
        //display sorted array
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        
    }
}
