package kata3;

import java.awt.Container;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
    public HistogramDisplay(){
        super("Histograma con JFree");
        setContentPane(createPanel());
        pack(); 
        }
    
    public  void execute(){
        setVisible(true);
    }
    private Container createPanel(){
        ChartPanel chartPanel = new ChartPanel (createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension (500,400));
        return chartPanel;
    }
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart(
                "Histograma",
                "Dominio",
                "nº emails",
                dataSet,
                PlotOrientation.VERTICAL,
                true,
                rootPaneCheckingEnabled,
                rootPaneCheckingEnabled);
        return chart;
        
        
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(15, "", ".ulpgc.es");
        dataSet.addValue(7, "", ".ull.es");
        dataSet.addValue(10, "", ".google.es");
        dataSet.addValue(4, "", ".hotmail.es");
        return dataSet;
        
    }
}


