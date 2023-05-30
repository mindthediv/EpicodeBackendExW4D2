package w4d2.w4d2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import componentBean.pizzeriaInit;

@SpringBootApplication
public class W4d2Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(W4d2Application.class, args);
		pizzeriaInit pizzeriaInit = new pizzeriaInit();
		pizzeriaInit.run(args);
	}

}
