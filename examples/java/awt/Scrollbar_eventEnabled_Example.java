package examples.java.awt;

import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.MouseAdapter;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.List;

public class Scrollbar_eventEnabled_Example {

    private final Scrollbar scrollbar = new Scrollbar();
    private List<AWTEvent> events = new ArrayList<>();

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Scrollbar_eventEnabled_Example example = new Scrollbar_eventEnabled_Example();
                example.initializeComponents();
                example.addListenersToComponents();
                example.setVisible(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void initializeComponents() {
        scrollbar.setMinimumSize(new Dimension(200, 50)));
        scrollbar.setPreferredSize(new Dimension(200, 50))));
        getContentPane().add(scrollbar);
    }

    private void addListenersToComponents() {
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                events.add(e);
            }
        };
        scrollbar.addMouseListener(mouseAdapter));
        scrollbar.addAdjustmentListener((AdjustmentEvent ae) -> {
                    int verticalScrolled = ae.getValue();
                    events.add(new AdjustmentEvent(verticalScrolled))));
    }

    @Override
    public String toString() {
        return "Scrollbar_eventEnabled_Example [scrollbar=" + scrollbar + ", events=" + events + "]]";
    }

}