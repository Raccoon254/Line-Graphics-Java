import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        Frame f = new Frame("DDA");
        DDA dda = new DDA();
        dda.init();
        f.add(dda);
        f.setSize(800, 800);
        f.setVisible(true);
        //close frame f on default exit
        f.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                System.exit(0);
            }
        });
    }
}
