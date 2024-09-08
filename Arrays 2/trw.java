public class trw{
    public static void main (String args[]){
        int arr[] = new int[]{4,2,0,6,3,2,5};
        int leftAux[] = new int[arr.length];
        int rightAux[] = new int[arr.length];
        int waterLevel;
        int trw = 0;
        for(int i = 1 ; i < arr.length ; i++){
            leftAux[0] = arr[0];
            leftAux[i] = Math.max(leftAux[i-1],arr[i]);
        }
        for(int i = arr.length-2 ; i >= 0 ; i--){
            rightAux[arr.length-1] = arr[arr.length-1];
            rightAux[i] = Math.max(rightAux[i+1],arr[i]);
        }
        
        for(int i =0; i < arr.length;i++){
            waterLevel = Math.min(leftAux[i],rightAux[i]);
            trw += waterLevel - arr[i];
        }
        System.out.println(trw);
    }
}