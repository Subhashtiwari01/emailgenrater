package org.example;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class customizedMailAuthantication extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {

        return new PasswordAuthentication(MailMetaData.myUserMAil, MailMetaData.mypassword);
    }
}
