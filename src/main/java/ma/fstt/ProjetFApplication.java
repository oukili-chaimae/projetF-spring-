package ma.fstt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetFApplication implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    @Autowired
    public ProjetFApplication(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProjetFApplication.class, args);
    }

    @Override
    public void run(String... args){
        customerRepository.save(new Customer("ss2131",201L, "Male", 20, 100, 80, 4));
    }
}
