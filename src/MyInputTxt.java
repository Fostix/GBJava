import java.io.BufferedReader;
import java.io.FileReader;


public class MyInputTxt {
    static void FillArrayx(String str, int[] arr, boolean num){
        String reading = "";
        int length = str.length();
        for (int i = 1; i < length; i++) {
            if (Character.isDigit(str.charAt(i))) {
                reading += Character.toString(str.charAt(i));
            }
        }
        arr[num ? 1 : 0] = Integer.parseInt(reading);
    }

    public static int[] ReaderMethod() throws Exception {
        int[] arr = new int[2];
        BufferedReader br = new BufferedReader(new FileReader("src/input.txt"));
        String str;


        byte counter = 0;
        while (counter != 2 && (str = br.readLine()) != null) {
            int length = str.length();
            if (str.charAt(0) == 'a') {
                FillArrayx(str, arr,false);
            } else if (str.charAt(0) == 'b') {
                FillArrayx(str, arr,true);
            }
        counter++;
        }
    br.close();
    return arr;
    }
}







