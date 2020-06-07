package app;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude =  GsonAutoConfiguration.class)
@EnableAdminServer
@EnableDiscoveryClient
public class SpringBootAdminService {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminService.class, args);

    }
}
