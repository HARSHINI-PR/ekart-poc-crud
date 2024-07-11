package kart.poc.ekart_poc_crud;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/courier")
public class CourierController {
    @Autowired
    private CourierService courierService;

    @PostMapping("/")
    public Courier addCourier(@RequestBody Courier courier) {
        return courierService.addCourier(courier);
    }

    @PutMapping("/")
    public String updateItemStatus(@RequestBody Courier courier) {
        return courierService.updateItemStatus(courier);
    }

    @GetMapping("/executive/{executiveName}")
    public List<Courier> getByExecutive(@PathVariable String executiveName) {
        return courierService.getByExecutive(executiveName);
    }

    @GetMapping("/address/{receiverAddress}")
    public List<Courier> getByAddress(@PathVariable String receiverAddress) {
        return courierService.getByAddress(receiverAddress);
    }

    @GetMapping("/receiver/{receiverName}")
    public List<Courier> getByReceiver(@PathVariable String receiverName) {
        return courierService.getByReceiver(receiverName);
    }

    @GetMapping("/")
    public List<Courier> getAllCouriers() {
        return courierService.getAllCouriers();
    }
}

