package kata5p2.view;

import kata5p2.model.Histogram;
import kata5p2.model.Mail;

import java.util.List;

public class MailHistogramBuilder {

    public Histogram<String> build(List<String> mailList){
        Histogram<String> histo = new Histogram<>();
        mailList.forEach(e -> histo.increment(e));
        return histo;
    }
}
