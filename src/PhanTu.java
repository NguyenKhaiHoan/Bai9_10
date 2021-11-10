import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PhanTu<T> {
    public T num;

    public boolean isGreaterThan(T value) {
        if (value instanceof Integer) {
            Integer v = (Integer) value;
            if ((Integer) this.num > v) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc;
        try {
            sc = new Scanner(new File("src/input.txt"));
            while (sc.hasNext()) {
                int pt1 = sc.nextInt();
                int pt2 = sc.nextInt();

            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Collections.sort(list);
        FileWriter fw;
        try {
            fw = new FileWriter("src/output.txt");
            for (int i = 0; i < list.size(); i++ ) {
                fw.write(list.get(i));
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
