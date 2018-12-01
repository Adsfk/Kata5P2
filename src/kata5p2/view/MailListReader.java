package kata5p2.view;

import kata5p2.model.Mail;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {

    public List<Mail> read(String fileName){
        List<Mail> mailList = new ArrayList<>();
        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            String st;
            while((st = bf.readLine()) != null){
                if(st.indexOf('@')!=-1){
                    mailList.add(new Mail(st));
                }
            }
            return mailList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mailList;
    }

}