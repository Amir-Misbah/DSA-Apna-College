public class fastExponention{
    public static int powers(int base,int exo){
        int ans = 1;
        while( exo > 0){ 
          if((exo & 1) != 0 ){
            ans = ans * base;
          }
          base = base * base;
          exo = exo >> 1; 
        }  
        return ans;
        }
    
    public static void main(String args[]){
        System.out.println(powers(3,5));
    }
}