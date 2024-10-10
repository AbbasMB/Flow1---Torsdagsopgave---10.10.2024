package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private final ArrayList<String> cofeeMenu = new ArrayList<>();

    public ArrayList<String> getCofeeMenu() {
        return cofeeMenu;
    }

    public void loadMenuData(){
        try {
            File file = new File("coffees.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                cofeeMenu.add(scan.nextLine());
            }
        } catch(FileNotFoundException e){
            System.out.println("File not found. Check path and filename");
        }
    }
}