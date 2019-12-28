public class BubbleSort{
   
    public static void sort(int a[]){
        int temp = 0;
        for(int i = 0; i<a.length; i++){
            for(int j = 1; j<a.length-i; j++){
                if(a[j-1]>a[j]){
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                    //ok
                }
            }
        }
        
    }
    public static void main(String[]args){
       int ar[] = {1,3,7,4,5,6,9,8};
       sort(ar);
       System.out.print(ar[2]);
       
       
    }
}