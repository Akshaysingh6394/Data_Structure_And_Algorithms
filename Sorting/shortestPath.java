package Sorting;

public class shortestPath {
    public static float shortestPat(String path){
        int X =0 , Y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // SOUTH
            if(dir == 'S'){
                Y = Y-1;
            }
            // NORTH
            else if(dir == 'N'){
                Y = Y+1;
            }
            // EAST
            else if(dir == 'E'){
                X = X+1;
            }else{
                X =X-1;
            }
            
        }
        int X2 = X*X;
        int Y2 = Y*Y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortestPat(path));
    }
    
}
