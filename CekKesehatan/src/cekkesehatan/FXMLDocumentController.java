/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Bella Dwi Mardiana
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField nama;
    @FXML
    private TextField tinggi;
    @FXML
    private TextField berat;
    @FXML
    private RadioButton L;
    @FXML
    private RadioButton P;
    @FXML
    private Button editProses;
    @FXML
    private Button editReset;
    @FXML
    private TextField beratIdeal;
    @FXML
    private TextArea ta1;
    @FXML
    private TextArea ta2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        int ideal = 0;
        String ta22 = ta2.getText();
        String ta11 = null;
        String Nama = nama.getText();
        int Tinggi = Integer.parseInt(tinggi.getText());
        int Berat = Integer.parseInt(berat.getText());
        
        if(L.isSelected()){
            ideal = Tinggi - 105;
            if(ideal == Berat){
                ta11 = "ideal";
                ta22 = "Saran : \n Sip, Pertahankan Itu !";
            }
            else if(ideal > Berat){
                ta11 = "Underweight";
                ta22 = "Saran = \n1.Makan makanan yang bergizi\n2.Tingkatkan berat badan anda!";
            }
            else if(ideal < Berat){
                ta11 ="Overweight";
                ta22 = "Saran = \n1.Makan makanan yang banyak mengandung serat\n2.Rajinlah dalam berolahraga\n3.Turunkan berat badan anda!";
            }
        }
        else if(P.isSelected()){
            ideal = Tinggi - 100;
            if(ideal == Berat ){
                ta11 = "ideal";
                ta22 = "Saran = \nSip, Pertahankan itu!";
            }
             else if (ideal > Berat){
                ta11 = "Underweight";
                ta22 = "Saran = \n1.Makan makanan yang bergizi\n2.Tingkatkan berat badan anda!";
            }
            else if(ideal < Berat){
            ta11 ="Overweight";
                ta22 = "Saran =  \n1.Makan makanan yang banyak mengandung serat\n2.Rajinlah dalam berolahraga\n3.Turunkan berat badan anda!";
            }
        }
            beratIdeal.setText(""+ideal);
            ta1.setText("Nama : "+Nama+"\n Berat Badan :"+Berat+"\n Tinggi Badan : "+Tinggi+"\n Analisa :"+ta11);
            ta2.setText(ta22);
    }
    
    @FXML
    private void reset(ActionEvent event) {
        nama.setText("");
        tinggi.setText("");
        berat.setText("");
        L.setSelected(false);
        P.setSelected(false);
        ta1.setText("");
        ta2.setText("");
    }
    
}
