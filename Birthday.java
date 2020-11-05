
package birthday;
import java.io.*;
import java.util.*;

public class Birthday {
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> arrlist = new ArrayList<String>();

        Scanner sc = new Scanner(new File("C:\\Users\\Dhanush R\\Desktop\\assignments\\session1\\Friends.csv"));
        while(sc.hasNext())
        {
          System.out.print(sc.next());
        }
        sc.close();

        FileWriter fileWriter = new FileWriter("C:\\Users\\Dhanush R\\Desktop\\assignments\\session1\\Friends.csv");

        for(int i = 0; i < name.size(); i++){
            System.out.println(fileWriter.append(name.get(i)+ " Happy Birthday  to you \n" ));
        }
        fileWriter.close();
    }
}

