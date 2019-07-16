package io.nuls.nulsswitch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan("io.nuls.nulsswitch.mapper")
public class NulsSwitchApplication {
	public static void main(String[] args) {
		SpringApplication.run(NulsSwitchApplication.class, args);
	}
}
