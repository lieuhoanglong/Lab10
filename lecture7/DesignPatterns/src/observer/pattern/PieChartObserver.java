package observer.pattern;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JPanel;

import observer.CourseRecord;
import observer.LayoutConstants;

/**
 * This class represents a pie chart view of a vector of data. Uses the Observer
 * pattern.
 */
public class PieChartObserver extends JPanel implements Observer {
	private Vector<CourseRecord> courseData;
	
	/**
	 * Creates a BarChartObserver object
	 * @param data: a CourseData object to observe
	 */
	public PieChartObserver(CourseData data) {
		data.attach(this);
		this.courseData = data.getUpdate();
		this.setPreferredSize(new Dimension(2 * LayoutConstants.xOffset
				+ (LayoutConstants.barSpacing + LayoutConstants.barWidth)
				* this.courseData.size(), LayoutConstants.graphHeight + 2
				* LayoutConstants.yOffset));
		this.setBackground(Color.white);
	}

	/**
	 * Paint method
	 * @param g: a Graphics object on which to paint
	 */
	public void paint(Graphics g) {
		//super.paint(g);
		int radius = 100;
		//LayoutConstants.paintBarChartOutline(g, this.courseData.size());
		//first compute the total number of students
		double total = 0.0;
		for (int i = 0; i < courseData.size(); i++) {
			CourseRecord record = (CourseRecord) courseData.elementAt(i);
			total += record.getNumOfStudents();
		}
		//if total == 0 nothing to draw
		if (total != 0) {
			double startAngle = 0.0;
			for (int i = 0; i < courseData.size(); i++) {
				CourseRecord record = (CourseRecord) courseData.elementAt(i);
				double ratio = (record.getNumOfStudents() / total) * 360.0;
				//draw the arc
				g.setColor(LayoutConstants.courseColours[i]);
				g.fillArc(LayoutConstants.xOffset + 300, LayoutConstants.yOffset, 
						2 * radius, 2 * radius, (int) startAngle, (int) ratio);
				startAngle += ratio;
			}
		}
	}

	/**
	 * Informs this observer that the observed CourseData object has changed
	 * @param o: the observed CourseData object that has changed
	 */
	public void update(Observable o) {
		CourseData data = (CourseData) o;
		this.courseData = data.getUpdate();

		/*this.setPreferredSize(new Dimension(2 * LayoutConstants.xOffset
				+ (LayoutConstants.barSpacing + LayoutConstants.barWidth)
				* this.courseData.size(), LayoutConstants.graphHeight + 2
				* LayoutConstants.yOffset));
		*/
		this.revalidate();
		this.repaint();
	}
}
