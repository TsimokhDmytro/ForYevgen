import org.testng.annotations.Test;

public class TextRevers {

        @Test
        public void TextRevers() {
            String testStr1 = "Java it is a rpogramming language";

            String[] testStr1Splited = testStr1.split(" ");
            System.out.println(testStr1Splited[5] + "\n" + testStr1Splited[4] + "\n" + testStr1Splited[3] + "\n" + testStr1Splited[2] + "\n" + testStr1Splited[1] + "\n" + testStr1Splited[0]);
       }

        }



