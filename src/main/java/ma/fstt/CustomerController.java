package ma.fstt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/")
    List<Customer> index(){
        return customerRepository.findAll();
    }

    @PostMapping("/")
    public Customer createCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }


}
