package major;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Login extends Application{

	//public static Login loginTran =new Login();

	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		Parent root = FXMLLoader.load(getClass().getResource("/ui/Page_login.fxml"));

		//FXMLLoader root = new FXMLLoader(getClass().getResource("/ui/Page_login.fxml"));
		
	//	LoginController logincontroller = root.getController();
		 
		
		Scene scene = new Scene(((Parent) root.load()), 2000,1000);
		primaryStage.setScene(scene);
		//make these 2 to false to go with default sizing
		primaryStage.setResizable(true);
		primaryStage.setMaximized(true);
		primaryStage.setTitle("");
		primaryStage.getIcons().add(new Image("graphic/poslogorect.png"));
		primaryStage.show();
		
	}
	
	public static void main(String args[]) {
		Application.launch(args);
	}
}

