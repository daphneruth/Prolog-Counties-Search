import org.jpl7.PrologException;
import org.jpl7.Query;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Scanner;
public class counties_search extends JFrame {
    JLabel welcome_statement,   alert_message;
    JButton proceed_word ;
    public counties_search(){
            alert_message = new JLabel("County Economic growth");
            welcome_statement = new JLabel("To proceed to console press \"OK\"");
            proceed_word = new JButton("OK");
            add(alert_message);
            add(welcome_statement);
            add(proceed_word);
            proceed_word.addActionListener(this::actionPerformed);
            setLayout(new GridLayout(4,1));
            setTitle("Counties ");
            setSize(300, 200);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void actionPerformed(ActionEvent actionEvent) {


            Query el = new Query("consult('C:/Users/User/Desktop/counties/src/country.pl')");

            System.out.println(el.hasSolution() ? "Search Counties" : "fail");
            Scanner enter = new Scanner(System.in);
            for(int i =0 ; i<10 ;i++) {
                try {

                String query = enter.nextLine();
                Query e2 = new Query(query);
                System.out.println(e2.hasSolution());

            }catch (PrologException prologException){
                System.out.println("Wrong Inputs");
            }

            }

    }
}
