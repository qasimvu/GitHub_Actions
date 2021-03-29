import org.testng.annotations.Test;


// Method OverLoading (Static)
// 1. Same Method Name
// 2. Same Class
// 3. Different Arguments

public class PrintClass {

    @Test
    void show(String a, Integer b){
        System.out.println("1");
    }

    void show(Integer a, String b){
        System.out.println("3");
    }

    public static void main (String[] args){

        PrintClass test=new PrintClass();

        test.show("b",2);
    }

}
