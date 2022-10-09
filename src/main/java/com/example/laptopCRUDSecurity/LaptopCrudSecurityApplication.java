package com.example.laptopCRUDSecurity;

import com.example.laptopCRUDSecurity.entities.Laptop;
import com.example.laptopCRUDSecurity.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LaptopCrudSecurityApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(LaptopCrudSecurityApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, "MSI", "Intel");
		Laptop laptop2 = new Laptop(null, "Lenovo", "AMD");

		repository.save(laptop1);
		repository.save(laptop2);
	}

}
