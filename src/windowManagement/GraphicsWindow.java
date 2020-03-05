package windowManagement;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GraphicsWindow extends JFrame {

    public static void main(String[] args) {
        GraphicsWindow window = new GraphicsWindow("Big Cat");
        window.setVisible(true);
    }

    public ArrayList<Drawable> drawables;

    public GraphicsWindow(String title) {
        super(title);

        init();
    }

    private void init() {
        drawables = new ArrayList<>();

        add(new GraphicsPanel());
    }

    private class GraphicsPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            drawables.forEach(drawable -> drawable.draw(g, getWidth(), getHeight()));
        }
    }
}
