package ak223wd_assign1;

import org.knowm.xchart.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args){
        //XYChart chart = new XYChartBuilder().width(800).height(600).build(); // build the chart size

        CategoryChart chartB = new CategoryChartBuilder().width(800).height(600).build();

        PieChart chartP = new PieChartBuilder().width(800).height(600).build();

        chartB.getStyler().setDefaultSeriesRenderStyle(CategorySeries.CategorySeriesRenderStyle.Bar);
        chartP.getStyler().setDefaultSeriesRenderStyle(PieSeries.PieSeriesRenderStyle.Pie);
        //chartB.getStyler().setMarkerSize(4);

        ArrayList<Integer> text = new ArrayList<>();
        int count = 0;
        int countO = 0;

        //read the numbers in the file.

        try{
            Scanner sC = new Scanner(System.in);
            System.out.print("Reading integers from file : ");
            String fileN = sC.nextLine();

            File file = new File(fileN);
            Scanner sc = new Scanner(file);

            while(sc.hasNext()){
                int nb = sc.nextInt();
                //we count how many number are >0 and <100

                if (nb>0 && nb<=100){
                    count++;

                } else if (nb<=0 || nb>100){
                    countO++;
                }

                text.add(nb);
            }
            sc.close();

        }
        catch (IOException e){
            e.printStackTrace();

        }



        System.out.println("Number of integers in the interval [1,100] : "+count);
        System.out.println("Others :"+countO);

        //print histogram bar chart for all int between 1-100

        //List xData = new ArrayList();
        //List yData = new ArrayList();
        int [] yData = {0,0,0,0,0,0,0,0,0,0,0};
        int [] xData = {10,20,30,40,50,60,70,80,90,100,0};
        for (int i = 0; i < text.size(); i++) {
            if (text.get(i)>0&&text.get(i)<=10){
                yData[0]++;
                xData[0]+=10;
            } else if (text.get(i)>10&&text.get(i)<=20){
                yData[1]++;
            } else if (text.get(i)>20&&text.get(i)<=30){
                yData[2]++;
            } else if (text.get(i)>30&&text.get(i)<=40){
                yData[3]++;
            } else if (text.get(i)>40&&text.get(i)<=50){
                yData[4]++;

            } else if (text.get(i)>50&&text.get(i)<=60){
                yData[5]++;
            } else if (text.get(i)>60&&text.get(i)<=70){
                yData[6]++;
            } else if (text.get(i)>70&&text.get(i)<=80){
                yData[7]++;

            } else if (text.get(i)>80&&text.get(i)<=90){
                yData[8]++;
            } else if (text.get(i)>90&&text.get(i)<=100){
                yData[9]++;
            }
        }

        chartB.addSeries("Histogram", xData,yData);
        chartP.addSeries("1-10", yData[0]);
        chartP.addSeries("11-20", yData[1]);
        chartP.addSeries("21-30", yData[2]);
        chartP.addSeries("31-40", yData[3]);
        chartP.addSeries("41-50", yData[4]);
        chartP.addSeries("51-60", yData[5]);
        chartP.addSeries("61-70", yData[6]);
        chartP.addSeries("71-80", yData[7]);
        chartP.addSeries("81-90", yData[8]);
        chartP.addSeries("91-100", yData[9]);


        new SwingWrapper<>(chartB).displayChart(); //display chart
        new SwingWrapper<>(chartP).displayChart();
    }
}
