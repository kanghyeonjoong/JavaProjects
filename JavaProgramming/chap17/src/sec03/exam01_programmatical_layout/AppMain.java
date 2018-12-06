package sec03.exam01_programmatical_layout;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();

		hbox.setPadding(new Insets(10));
		hbox.setSpacing(10);
		
		TextField textField = new TextField();
		textField.setPrefWidth(200);
		
		Button button = new Button();
		button.setText("확인");
		
		ObservableList<Node> list = hbox.getChildren();
		list.add(textField);
		list.add(button);
		
		//Scene 객체 생성
		Scene scene = new Scene(hbox);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);//윈도우 창(Stage)에 Scene을 설정
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
