package sec02.exam02_application_lifecycle;

import java.util.Map;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {
	public AppMain() {
		System.out.println(Thread.currentThread().getName() + ": AppMain() ȣ��");
	}

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + ":  init() ȣ��");
		Parameters parms = getParameters();
		/*
		List<String> list = parms.getRaw();
		
		for(String e : list) {
			System.out.println(e);
		}*/
		
		Map<String, String> map= parms.getNamed();
		System.out.println(map.get("ip") +", "+ map.get("port"));
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + ": start() ȣ��");
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + ":  stop() ȣ��");
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": main() ȣ��");
		launch(args);
	}
}
