/**
 * ScatterPlot.java
 * 5 jan 2017
 */
package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;
import org.knowm.xchart.style.Styler.LegendPosition;

/**
 * @author jlnmsi
 *
 */

public class ScatterPlot  {

	  public static void main(String[] args) {
		  // Create and Customize Chart
		    XYChart chart = new XYChartBuilder().width(800).height(600).build();
		    chart.getStyler().setDefaultSeriesRenderStyle(XYSeriesRenderStyle.Scatter);
		    chart.getStyler().setChartTitleVisible(false);
		    chart.getStyler().setLegendPosition(LegendPosition.InsideSW);
		    chart.getStyler().setMarkerSize(5);

		    // Generate data
		    List<Double> xData = new ArrayList<Double>();
		    List<Double> yData = new ArrayList<Double>();
		    Random random = new Random();
		    int size = 1000;
		    for (int i = 0; i < size; i++) {
		      xData.add(random.nextGaussian() );
		      yData.add(random.nextGaussian());
		    }
		    
		    // Display scatter plot
		    chart.addSeries("Gaussian Blob", xData, yData);
		    new SwingWrapper<XYChart>(chart).displayChart();
	  }
}
