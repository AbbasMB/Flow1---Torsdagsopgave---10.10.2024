package Task2;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.loadMenuData();

        for(String c : cafe.getCofeeMenu()){
            System.out.println(c);
        }
        }
    }