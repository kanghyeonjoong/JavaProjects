package sec04.exam01_anchorpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));

		Scene scene = new Scene(root);

		/*
		 * AnchorPane�� ����ؼ� ��Ʈ���� ��ǥ�� ��ġ�ϸ� ������ â�� �ٰų� �þ ��� ��Ʈ���� ���ġ�� �Ͼ�� �ʴ´�. ���� ������
		 * â�� ũ�⸦ ������ �� ������ Stage�� setResizable(false);�޼ҵ带 ȣ���ϴ� ���� ����.
		 */
		primaryStage.setResizable(false);
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
