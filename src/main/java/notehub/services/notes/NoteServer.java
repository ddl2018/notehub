package notehub.services.notes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NoteServer {
	public static void main(String[] a) {
		System.setProperty("spring.config.name","note-server");
		SpringApplication.run(NoteServer.class, a);
	}
}