package kata3;

public class kata3 {

    public static void main(String[] args) {
        
        Histogram histogram = new Histogram();
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("alu.com");
        histogram.increment("hotmail.com");
        histogram.increment("gmail.com");
        
        histogram.increment("gmail.com");
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
}