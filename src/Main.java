/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mali
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       lording l = new lording();
//       set lording screen visible
       l.setVisible(true);
//       sleep 5s
       Thread.sleep(5000);
       System.out.println("1");
//       close the lording screen
       l.dispose();
        
       Login login = new Login();
       login.setVisible(true);
        // TODO code application logic here
    }
    
}
