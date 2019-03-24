
import static org.junit.Assert.*;
 
import org.junit.Test;
 
public class test {
    private static final int testCases[]={1,2,3,4,5,6,7,8,9,10};
    private static final String testAns[]=
        {"2 ","2 3 ","2 3 5 ","2 3 5 7 ","2 3 5 7 11 ","2 3 5 7 11 13 ",
        "2 3 5 7 11 13 17 ","2 3 5 7 11 13 17 19 ","2 3 5 7 11 13 17 19 23 ",
        "2 3 5 7 11 13 17 19 23 29 ",};
    @Test
    public void primePathCover(){
        for(int i=0;i<testCases.length;i++){
            assertEquals(testAns[i], main.getPrimes(testCases[i]));
        }
    }
}