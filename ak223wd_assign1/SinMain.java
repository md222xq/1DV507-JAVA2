package ak223wd_assign1;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import java.util.ArrayList;
import java.util.List;

public class SinMain {
    public static void main(String[] args){
        XYChart chart = new XYChartBuilder().width(800).height(600).build(); // build the chart size
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Scatter);
        chart.getStyler().setMarkerSize(1);



        //y = (1 + x/pi)*cos(x)*cos(40*x)
        //range 0 <= x <= 2*pi

        List xData = new ArrayList();
        List yData = new ArrayList();

        //Random random = new Random();
        double size = 2*Math.PI;
        for (Double i = 0.0; i <= size; i=i+0.0001) {
            Double y = (1+i/Math.PI)*Math.cos(i)*Math.cos(i*40);
            Double x = i;
            yData.add(y);
            xData.add(x);
        }

        chart.addSeries("SinMain", xData,yData);

        new SwingWrapper<>(chart).displayChart(); //display chart
    }
}
