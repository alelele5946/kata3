package kata3;

import java.awt.Dimension;
import org.jfree.ui.ApplicationFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class HistogramDisplay extends ApplicationFrame{

    
    public HistogramDisplay(){
        super("Histograma");
        
        pack();
        setContentPane(createPanel());
    }
   
    
    
    
    public void execute(){
        setVisible(true);
    }
    
    public JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
        
    }
    public JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart", "Dominios email","Nº de emails", dataset,PlotOrientation.VERTICAL,false,false,rootPaneCheckingEnabled );
        return chart;
    
    }
    
    public DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(12,"","ulpgc.es");
        dataSet.addValue(2,"","gmail.es");
        dataSet.addValue(15,"","jkhsf.es");
        return dataSet;
    
    }
    
    
    
}