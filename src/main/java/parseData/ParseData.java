package parseData;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVReader;

import parseData.Player;

public class ParseData {
private static String salariesFilePath = "Salaries.csv";
    
    public static void main(String[] args) {
        ReadFile();
    }
    
    @SuppressWarnings("deprecation")
    public static void ReadFile() {
        try {
            CSVReader reader = new CSVReader(new FileReader(salariesFilePath), ',');

            ArrayList<Player> players = new ArrayList<Player>();
            String[] record = null;
            
            while ((record = reader.readNext()) != null) {
                Player player = new Player(record[0], record[1], record[3], record[2], record[4]);
                
                players.add(player);
                player.getAllStats();
            }
            
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
