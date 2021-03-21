package tekwill.homework.homework2003;

public class Exercise4 {
    public static void main(String[] args) {
        int a = 7;
        int result = ++a - --a + a++ + ++a - a-- - --a - a++ + ++a;
                     //8    //7  //7+1  //8   //8-1 //7   //7+1 //8
        System.out.println(result);


    }
}
