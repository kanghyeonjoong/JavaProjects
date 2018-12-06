package sec02.exam03_stage_scene;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		root.setPrefWidth(350);
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);

		Label label = new Label();
		label.setText("Hello Java");
		label.setFont(new Font(50));

		Button button = new Button();
		button.setText("확인");
		button.setOnAction(event -> Platform.exit());

		// VBox의 자식으로 Label, Button 컨트롤 추가
		root.getChildren().add(label);
		root.getChildren().add(button);

		Scene scene = new Scene(root);// VBox를 루트컨테이너로 해서 Scene생성

		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
