package tasks.chapter5;

/**
 * Created by Goro on 02.08.2017.
 */
public class StringTask {
    String srt;
    String srt1 = "hello java";
    String srt2;
    StringTask(){
        srt2 = "hello android";
    }

    public static void main(String[] args) {
        StringTask st = new StringTask();
        System.out.println("st.srt = "+st.srt);
        System.out.println("st.srt1 = "+st.srt1);
        System.out.println("st.srt2 = "+st.srt2);
    }
}
