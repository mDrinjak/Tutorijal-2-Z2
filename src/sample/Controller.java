package sample;

import javafx.event.ActionEvent;

import java.awt.*;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import org.w3c.dom.ls.LSOutput;

public class Controller {

    public TextField ulaz;
    public TextArea izlaz;

    public int sumaCifara(int x){
        int suma=0;
        while(x!=0){
            suma+=x%10;
            x=x/10;
        }
        return suma;
    }


   public void Izvrsi(ActionEvent actionEvent) {
        String s = "";
        int n= Integer.parseInt(ulaz.getText());
        for(int i=1; i<n; i++) {
            if(i % sumaCifara(i)==0){
                s+=i+" ";
            }

        }
        izlaz.setText(s);
    }
}

