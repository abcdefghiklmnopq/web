/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author thand
 */
public class SendMail {

    /**
     *
     * @param to
     * @param sub
     * @param msg
     * @param user
     * @param pass
     */
    public static void send(String to, String sub,
            String msg, final String user, final String pass) {
        //create an instance of Properties Class   
        Properties props = new Properties();

        /* Specifies the IP address of your default mail server
     	   for e.g if you are using gmail server as an email sever
           you will pass smtp.gmail.com as value of mail.smtp host. 
           As shown here in the code. 
           Change accordingly, if your email id is not a gmail id
         */
        props.put("mail.smtp.host", "smtp.gmail.com");
        //below mentioned mail.smtp.port is optional
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        /* Pass Properties object(props) and Authenticator object   
           for authentication to Session instance 
         */
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, pass);
            }
        });

        try {

            /* Create an instance of MimeMessage, 
 	      it accept MIME types and headers 
             */
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(sub);
            message.setContent(msg, "text/html");

            /* Transport class is used to deliver the message to the recipients */
            Transport.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param args
     */
    public static void sendmail(String email){
        String subject = "Your order has been updated.";
        String message = "hello\n"
                + "you will see your new order";
        SendMail.send(email, subject, message, "abc968593@gmail.com", "12345a6789");
    }
    public static void main(String[] args) {
        String subject = "Your order has been processing.";
        String message = "hello"
                + "you will see your new order";
        SendMail.send("", subject, message, "abc968593@gmail.com", "12345a6789");
        System.out.println("đã gửi mail thanh cong!");
        //vd để gửi email tới "dich@gmail.com" bằng email "nguon@gmail.com" pass "123456"
//        SendMail.send("dich@gmail.com", subject, message, "nguon@gmail.com", "123456");
    }
}