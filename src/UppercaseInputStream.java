import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Seyyid Tiryaki on 14.04.2016.
 */
public class UppercaseInputStream extends FilterInputStream{

    protected BufferedInputStream in;

    public UppercaseInputStream(BufferedInputStream in)
    {
        super(in);
    }

    public String readUpper()
    {
        String upper = "";
        try {
            for (int i = 0; i < in.available(); i++) {
                upper += (char) in.read();
            }
        } catch(IOException e)
        {
            e.printStackTrace();
        }
        upper = upper.toUpperCase();
        return upper;
    }
}
