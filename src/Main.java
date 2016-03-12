
import java.awt.Label;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
int status=0;
double progress=0;
	@FXML
	private javafx.scene.control.Label myLabel;
	@FXML
	private ProgressBar progressBar;


	public void buttonCheck() {
		labelCheck();
		progressCheck();
	}

	public void labelCheck() {
    myLabel.setText("" + status++);
	}
	public void progressCheck(){
    progressBar.setProgress(progress=progress+0.01);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("sampl.fxml"));
			primaryStage.setTitle("окно");
			primaryStage.setScene(new Scene(root, 300, 275));
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
