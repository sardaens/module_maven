package fft.wsgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan( basePackages = {"model"})
public class WsGdiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsGdiApplication.class, args);
	}

}
