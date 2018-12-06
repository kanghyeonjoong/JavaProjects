package sec03.exam03_margin_padding;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
	/*	HBox hbox = new HBox();
		hbox.setPadding(new Insets(50, 10, 10, 50));
		Button button = new Button();
		button.setPrefSize(100, 100);
   */

		HBox hbox=new HBox();
		Button button = new Button();
		button.setPrefSize(100, 100);
		HBox.setMargin(button, new Insets(10,10,50,50));//마진은 바깥 컨테이너의 setMargin()메소드를 사용한다.
		
		hbox.getChildren().add(button);

		Scene scene = new Scene(hbox);

		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
