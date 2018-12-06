package sec02.exam01_application_start;

import javafx.application.Application;
import javafx.stage.Stage;

// ①추상클래스 javaFx.application.Application을 상속받아 start()메소드를 재정의한다.
public class AppMain extends Application {

	// start()메소드를 재정의
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
