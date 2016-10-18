package org.laboration.two.control;

import org.laboration.two.model.Vertex2D;

/**
 * The <code>FigureHandler</code> interface...
 * 
 * @author Andreas Brodin
 * @author Niklas Lindfors
 * @author Joshua Lutakome Yawe
 * @version 1.0
 *
 */
public interface FigureHandler {
	public void createCircle(double x, double y, double radius);
	public void createLine(double x0, double y0, double x1, double y1);
	public void createPoint(double x, double y);
	public void createRectangle(double x, double y, double width, double height);
	public void createTriangle(double x0, double y0, double x1,
				   double y1, double x2, double y2);
	public void removeAll();
}
