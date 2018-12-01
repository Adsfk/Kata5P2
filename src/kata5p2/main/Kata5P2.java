package kata5p2.main;

import kata5p2.model.Histogram;
import kata5p2.model.Mail;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.MailListReader;

import java.util.List;

public class Kata5P2 {

    private List<Mail> mailList;
    private Histogram<String> histogram;

    public static void main(String[] args) {
        new Kata5P2().control();
    }

    private void control(){
        input();
        process();
        output();
    }

    private void input(){
        String filename = "email.txt";
        mailList = new MailListReader()
                .read(filename);
    }

    private void process(){
        histogram = new MailHistogramBuilder()
                .build(mailList);
    }

    private void output(){
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }

}
