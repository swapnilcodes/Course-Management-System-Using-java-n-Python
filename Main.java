public class Main {
    public static void main(String[] args) {
        try{
            Intro intro= new Intro();
            intro.setVisible(true);
            Thread.sleep(4000);
            intro.dispose();
            Home home= new Home();
            home.setVisible(true);
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}
