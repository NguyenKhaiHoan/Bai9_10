import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) {
        PhanTu<Integer> pt1 = new PhanTu<>(5);
        Integer pt2 = 6;
        System.out.println(pt1.isGreaterThan(pt2));
        List<Integer> list = new ArrayList<>();
        Scanner sc;
        try {
            sc = new Scanner(new File("src/Input.txt"));
            while (sc.hasNext()) {
                Integer data = sc.nextInt();
                list.add(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Collections.sort(list);
        FileWriter fw;
        try {
            fw = new FileWriter("src/Output.txt");
            for (int i = 0; i < list.size(); i++ ) {
                fw.write("" + list.get(i) + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
