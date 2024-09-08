public class FourDirections{
    public static float calculate(String str){
        int x =0;
        int y = 0;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == 'E'){
                x++;
            }
            else if(str.charAt(i) == 'W'){
                x--;
            }
            else if(str.charAt(i) == 'N'){
                y++;
            }
            else if(str.charAt(i) == 'S'){
                y--;
            }
        }
        int ans = ( (x*x) + (y*y));
        float finalAns = (float)Math.sqrt(ans);

        return finalAns;
    }
    public static void main (String args[]){
        String str = "WNEENESENNN";
        System.out.println(calculate(str));
    }
}