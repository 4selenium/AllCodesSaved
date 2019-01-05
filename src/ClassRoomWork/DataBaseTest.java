package ClassRoomWork;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.commons.mail.SimpleEmail;

public class DataBaseTest {
    @Test
    public void myTest1()  throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","baltimore");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from city\n" +
                "where CountryCode='AFG'");
        int counter=1;
        while (resultSet.next()) {
            String col1 = resultSet.getString(1);
            String col2 = resultSet.getString(2);
            String col3 = resultSet.getString(3);
            String col4 = resultSet.getString(4);
            String col5 = resultSet.getString(5);
            System.out.println(col1 + " " + col2 + " " + col3 + " " + col4 + " " + col5);
            if (counter == 2) {
                Assert.assertTrue(col2.equalsIgnoreCase("qandahar"));
            }
            counter++;
        }
        connection.close();


    }
    @Test
    public void myTest2() throws Exception{

     Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("john2525zz@gmail.com","Trivandrum1"));
        email.setSSLOnConnect(true);
        email.setFrom("john2525zz@gmail.com");
        email.setSubject("Test Completed Email");
        email.setMsg("The test is completed for Database  ... :-)");
        email.addTo("john2525zz@gmail.com");
        email.send();
        System.out.println("Email sent");
        System.out.println("this is the changes I made");
        System.out.println("this is the changes I made on 05Jan18");

        }
}
