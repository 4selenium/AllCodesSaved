package ClassRoomWork;

import org.testng.annotations.Test;

public class ReadruntimeProperty2 {


    @Test
    public void myTest2(){
        String s= System.getProperty("URL");
        System.out.println(s);
    }


}
