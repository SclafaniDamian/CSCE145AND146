// Made By Damian Sclafani
package CSCE145AND146;
/**
 Class for drawing simple shapes on the screen using keyboard
 characters. This class will draw an asterisk on the screen as a 
 test. It is not intended to create a "real" shape, but rather
 to be used as a base class for other classes of shapes.
*/
public class ShapeBasicsLab20 implements ShapesInterfaceLab20 {
    private int offset;

    public ShapeBasicsLab20()
    {
        this.offset = 0;
    }

    public ShapeBasicsLab20(int xOffset)
    {
        this.setOffset(xOffset);
    }

    public void setOffset(int xOffset)
    {
    	if(this.offset >= 0)
    	{
    		this.offset = xOffset;
    	}
    }

    public int getOffset()
    {
        return this.offset;
    }

    /**
     Draws the shape at lineNumber lines down
     from the current line.
    */
    public void drawAt(int lineNumber)
    {
        for (int i = 0; i < lineNumber; i++)
        {
            System.out.println( );
        }
        drawHere( );
    }

    /**
     Draws the shape at the current line.
    */
    public void drawHere()
    {
        for (int i = 0; i < this.offset; i++)
        {
        	System.out.print("");
        }
        System.out.println("*");
    }
 }
