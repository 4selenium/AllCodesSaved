package ClassRoomWork;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperty {

     @Test
     @Parameters("env")
    public void myTest1(String env) throws Exception{

         Properties prop = new Properties();
         if(env.equalsIgnoreCase("Stage")){
             prop.load(new FileInputStream("Config_Stage.properties"));

         }
         else
         {
             prop.load(new FileInputStream("Config_Dev.properties"));

         }
         System.out.println("URL:" + prop.getProperty("myUrl"));






     }



}
