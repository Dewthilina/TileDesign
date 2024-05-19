import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

public class FloorTileDesign {

	public static void main(String[] args) {
		if (args.length != 1) {
      
            drawPattern(2);
            return;
        }

        int num= Integer.parseInt(args[0]);


        StdDraw.setCanvasSize(600, 600);
        StdDraw.setXscale(0, num);
        StdDraw.setYscale(0, num);


        drawPattern(num);
    }


    public static void drawPattern(int num) {
        Color whiteColor = new Color(255, 255, 255);
        Color redColor = new Color(255, 0, 0);
        Color blackColor =new Color(0,0,0);
      

        double size = 1.0 / num;
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if ((i + j) % 2 == 0) {
                    //add color squre
                    StdDraw.setPenColor(whiteColor);
                    StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
                    
                   // StdDraw.setPenColor(blackColor);
                    StdDraw.circle(i+0.5,j+ 0.5, 0.4);
                    
                } else {
                    StdDraw.setPenColor(redColor);
                   // StdDraw.circle(i + 0.5, j + 0.5, 0.2);
                    
                }
                StdDraw.filledSquare(i * size + size / 2, j * size + size / 2, size / 2);
               
            }
            
        }

	}

}
