package vista.recursos.componentesPersonalizados;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class RoundedPanel extends JPanel {
    private int borderRadius;
    private GradientPaint colorGradiant;

    public RoundedPanel(int borderRadius) {
    	super();
        this.borderRadius = borderRadius;
        setOpaque(false);
    } 
    
	public GradientPaint getColorGradiant() {
		return colorGradiant;
	}
	public void setColorGradiant(GradientPaint colorGradiant) {
		this.colorGradiant = colorGradiant;
	}

	protected void paintComponent(Graphics g) {
		int height = getHeight();
		g.setColor(getBackground());
		g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, borderRadius, borderRadius);
		((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawRoundRect(0, 0, getWidth() - 1, height - 1, height, 100);
        super.paintComponent(g);
    }
    protected void paintBorder(Graphics g) {
        g.setColor(getBackground());
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, borderRadius, borderRadius);
        
    }
    public boolean contains(int x, int y) {
        Shape shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, borderRadius, borderRadius);
        return shape.contains(x, y);
    }
}