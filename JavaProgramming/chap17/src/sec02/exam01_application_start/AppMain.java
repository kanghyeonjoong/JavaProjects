package sec02.exam01_application_start;

import javafx.application.Application;
import javafx.stage.Stage;

// ���߻�Ŭ���� javaFx.application.Application�� ��ӹ޾� start()�޼ҵ带 �������Ѵ�.
public class AppMain extends Application {

	// start()�޼ҵ带 ������
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
