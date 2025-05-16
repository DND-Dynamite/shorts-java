import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class S0008_ReadFromClipBoard {

    public static void main(String[] args) throws UnsupportedFlavorException, IOException  {
        var clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        var content = clipboard.getData(DataFlavor.stringFlavor);
        System.out.println(content);
    }

}