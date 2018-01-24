import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * Created by juliu on 24.01.2018.
 */
public class add_evalue_to_generated_org_pairs {
    public static void main(String[] args) {
        HashSet<String> outmap = new HashSet<>(314317188);
        String filename = args[0];
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                line = line.replace("\n", "");
                String[] fields = line.split("\t");
                outmap.add(fields[0]+fields[1]);
                outmap.add(fields[0]+fields[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String filename2 = args[0];
        try {
            FileReader fr = new FileReader(filename2);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                line = line.replace("\n", "");
                String[] fields = line.split("\t");
                String[] firstFieldFields = fields[0].split("_");
                String protname = firstFieldFields[2]+ "_" + firstFieldFields[3];
                if(outmap.contains(protname + fields[1])){

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
