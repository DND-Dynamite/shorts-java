
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class S0007_CopyToClipboard {

    public static void main(String... args) {
        var message = "from java " + System.nanoTime();
        copyingTOClipBoard(message);
    }

    static void copyingTOClipBoard(String message) {

        var clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(new Transferable() {

            @Override
            public DataFlavor[] getTransferDataFlavors() {
                return new DataFlavor[] { DataFlavor.stringFlavor };
            }

            @Override
            public boolean isDataFlavorSupported(DataFlavor flavor) {
                return true;
            }

            @Override
            public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
                return message;
            }
        },
            (clipBoard, transferable) -> {
        });

    }
}