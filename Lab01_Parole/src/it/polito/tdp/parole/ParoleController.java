package it.polito.tdp.parole;

/**
 * Sample Skeleton for 'Parole.fxml' Controller Class
 */


import it.polito.tdp.parole.model.*;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ParoleController {
	
	Parole elenco;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader
    
    @FXML
    private Button btnReset;

    @FXML // fx:id="btnInserisci"
    private Button btnInserisci; // Value injected by FXMLLoader
    
    @FXML
    private TextField textTempo;

    @FXML
    private Button btnCancella;
    
    
    @FXML
    void doCancella(ActionEvent event) {
    	long tempoiniziale=System.nanoTime();
    	String tmp=txtResult.getSelectedText();
    	elenco.deleteParola(tmp);
    	txtResult.clear();
    	for( String p:  elenco.getElenco())
    	{
    		txtResult.appendText(p+"\n");
    	}
    	long tempofinale=System.nanoTime();
    	String tempo=String.valueOf(tempofinale-tempoiniziale);
    	textTempo.setText(tempo);
    }

    @FXML
    void doInsert(ActionEvent event) {
    	long tempoiniziale=System.nanoTime();
    	String tmp=txtParola.getText();
    	if(tmp.length()==0)
    		return;
    	elenco.addParola(tmp);
    	txtResult.clear();
    	for( String p: elenco.getElenco())
    	{
    		txtResult.appendText(p+"\n");
    	}
    	txtParola.clear();
    	long tempofinale=System.nanoTime();
    	String tempo=String.valueOf(tempofinale-tempoiniziale);
    	textTempo.setText(tempo);
    }
    
    @FXML
    void doReset(ActionEvent event) {
    	long tempoiniziale=System.nanoTime();
    	elenco.reset();
    	txtResult.clear();
    	txtParola.clear();
    	long tempofinale=System.nanoTime();
    	String tempo=String.valueOf(tempofinale-tempoiniziale);
    	textTempo.setText(tempo);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Parole.fxml'.";
        assert textTempo != null : "fx:id=\"textTempo\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Parole.fxml'.";

        elenco = new Parole();
        
    }
}
