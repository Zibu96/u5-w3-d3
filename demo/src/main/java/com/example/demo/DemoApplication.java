package com.example.demo;

import com.example.demo.Adapter.DataSource;
import com.example.demo.Adapter.Info;
import com.example.demo.Adapter.InfoAdapter;
import com.example.demo.Adapter.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	Info info = new Info("Gino", "Paoli", LocalDate.now().minusYears(84));


		UserData user = new UserData();
		InfoAdapter infoAdapter = new InfoAdapter(info);

		System.out.println(infoAdapter.getNomeCompleto());

		user.getData(infoAdapter);

		System.out.println(user);
	}
	}
