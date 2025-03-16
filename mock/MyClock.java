import java.awt.Font;
import javax.swing.*;

public class MyClock extends JLabel implements Runnable{

    @Override
    public void run() {
        int sec = 0;
        int min = 0;
        int hour = 0;
        while(true){
            this.setFont(new Font("angsana new", Font.BOLD, 50));
            String hour_new = String.valueOf(hour);
            String min_new = String.valueOf(min);
            String sec_new = String.valueOf(sec);
            if ((String.valueOf(hour)).length() == 1){
                hour_new = "0"+ hour;
            }
            if ((String.valueOf(min)).length() == 1){
                min_new = "0"+ min;
            }
            if ((String.valueOf(sec)).length() == 1){
                sec_new = "0"+ sec;
            }
            this.setText(hour_new + " : " + min_new + " : " + sec_new );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            sec++;
            if (sec == 60){
                min++;
                sec = 0;
            }
            if (min == 60){
                hour++;
                min = 0;
            }
        }
    }
    
}
