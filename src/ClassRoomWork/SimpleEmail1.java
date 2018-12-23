
package ClassRoomWork;

import org.testng.annotations.Test;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class SimpleEmail1 {

    @Test
    public void myTest1() throws Exception{

        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("john2525zz@gmail.com", "Trivandrum1"));
        email.setSSLOnConnect(true);
        email.setFrom("john2525zz@gmail.com");
        email.setSubject("TestMail");
        email.setMsg("The test is completed  ... :-)");
        email.addTo("john2525zz@gmail.com");
        email.send();
        System.out.println("Email sent");


    }

}

