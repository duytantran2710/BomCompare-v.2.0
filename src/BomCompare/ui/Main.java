package BomCompare.ui;

import BomCompare.exception.ExceptionAlert;
import BomCompare.exception.TestException;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;


public class Main {
    public static void main(String [] args) {
        int x = 1;
        new JFXPanel();
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    if(x != 0) {
                        throw new TestException("Not zero");
                    }
                } catch (TestException e) {
                    ExceptionAlert.showErrorMessage(e, "Error", "Not zero", "X is not zero");
                }
            
            }
        });
        

    }
}
