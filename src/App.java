import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Creates a salary class and serializes it to JSON object
 *
 * Created by V.Ivanovs on 10/07/2015.
 */
public class App {
    public static void main(String[] args) throws IOException {
        Salary salary = new Salary(1000, 200, 800);
        Gson gsonSalary = new Gson();

        String json = gsonSalary.toJson(salary);

        FileWriter fw = new FileWriter("salary.json");
        fw.write(json);
        fw.close();

        System.out.println(json);
    }
}
