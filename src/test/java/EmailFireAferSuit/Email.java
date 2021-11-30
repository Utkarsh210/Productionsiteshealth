package EmailFireAferSuit;

import org.apache.commons.mail.EmailException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

public class Email {


    @AfterSuite
    public void Send_update() throws InterruptedException, EmailException {

        final String username = "alerts@techryde.com";  // like yourname@outlook.com
        final String password = "0l0@checker";   // password here

        Properties props = new Properties();

        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.office365.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.socketFactory.port", "587");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");


        Session session = Session.getInstance(props, new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("alerts@techryde.com", "0l0@checker");
            }
        });
        session.setDebug(true);

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("utkarsh.kumar@techryde.com,aditya.choudhary@techryde.com,yash.budhwar@techryde.com,rishab.madhian@techryde.com,gursehaj.singh@techryde.com,rajan.nishad@techryde.com,rajat.rathore@techryde.com,manas.arora@techryde.com,sandeep@techryde.com,mohit.mishra@techryde.com,lalit.nagar@techryde.com"));   // like tselenium94@gmail.com
            message.setSubject("Production Stores Online status");


            MimeBodyPart messageBodyPart = new MimeBodyPart();
            BodyPart messageBodyPart1= new MimeBodyPart();
            messageBodyPart1.setText("Hi Team, Store online status has been checked for today,please find the stores which are online and offline");
            String fileName ="C:\\Users\\Administrator\\IdeaProjects\\ProductionsiteshealthTesting.html";
            //String fileName ="";
            MimeBodyPart messageBodyPart2= new MimeBodyPart();
            DataSource source = new FileDataSource(fileName);

            messageBodyPart2.setDataHandler(new DataHandler(source));
            messageBodyPart2.setFileName(fileName);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart2);
            multipart.addBodyPart(messageBodyPart1);




            message.setContent(multipart);
            System.out.println("Sending");
            //  fileName.flush();
            Transport.send(message);
            System.out.println("Done");

        } catch (
                MessagingException e) {
            throw new RuntimeException(e);
        }

    }
}


