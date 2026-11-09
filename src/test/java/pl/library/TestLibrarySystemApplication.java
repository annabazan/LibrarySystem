package pl.library;

import org.springframework.boot.SpringApplication;

public class TestLibrarySystemApplication {

	public static void main(String[] args) {
		SpringApplication.from(LibrarySystemApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
