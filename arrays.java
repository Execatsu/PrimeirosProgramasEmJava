import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        String[] paises = {"BRASIL", "RUSSIA", "INDIA", "CHINA"};
        System.out.println(paises[0]); //"BRASIL"
        System.out.println(Arrays.toString(paises));
        int position = Arrays.binarySearch(paises, "BRASIL");
        System.out.println(position);

        String[][] duasdim = {{"Carlos", "M", "SP"},{"Lindiane", "F", "SP"}};
        System.out.println(duasdim[0][0]);
    }
}
