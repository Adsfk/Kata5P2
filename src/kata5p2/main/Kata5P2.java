package kata5p2.main;

import kata5p2.model.Histogram;
import kata5p2.model.Mail;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.MailListReaderBD;

import java.util.List;

public class Kata5P2 {

    private List<String> mailList;
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
        mailList = new MailListReaderBD()
                .read(filename);
    }

    private void process(){
        histogram = new MailHistogramBuilder()
                .build(mailList);
    }

    private void output(){
        new HistogramDisplay(histogram).execute();
    }

}
