package org.example;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.SQLOutput;
import java.util.Properties;

public class MailHandler {
    void sendMail(){
        Properties sysproperties= System.getProperties();
        System.out.println(sysproperties);

        sysproperties.put("mail.smtp.host",MailMetaData.HostServer);
        sysproperties.put("mail.smtp.port",MailMetaData.port);
        sysproperties.put(MailMetaData.sslproperty,"true");
        sysproperties.put(MailMetaData.authpere,"true");

        //creating session
        Authenticator mailAuthenticator=new customizedMailAuthantication();


        Session mailSession =Session.getInstance(sysproperties,mailAuthenticator);

        MimeMessage mailMessage=new MimeMessage(mailSession);
        try {

            mailMessage.setFrom(MailMetaData.myUserMAil);
            mailMessage.setSubject("This is java code testing");

            mailMessage.setText("hi this is Roman this side");

            Address reciverMAil = new InternetAddress(MailMetaData.reciverMAil)
            mailMessage.setRecipients(Message.RecipientType.TO, reciverMAil);
            Transport.send(mailMessage);
        }
        catch(Exception mailException){
            System.out.println(mailException.toString());
        }




    }
}
