package kart.poc.ekart_poc_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourierService {
    @Autowired
    private CourierRepository courierRepository;

    public Courier addCourier(Courier courier) {
        return courierRepository.save(courier);
    }

    public String updateItemStatus(Courier courier) {
        Courier existingCourier = courierRepository.findById(courier.getParcelId()).orElse(null);
        if (existingCourier != null) {
            existingCourier.setItemStatus(courier.getItemStatus());
            courierRepository.save(existingCourier);
            return "Courier status updated for " + courier.getParcelId();
        }
        return "Courier not found for " + courier.getParcelId();
    }

    public List<Courier> getByExecutive(String executiveName) {
        return courierRepository.findByExecutiveName(executiveName);
    }

    public List<Courier> getByAddress(String receiverAddress) {
        return courierRepository.findByReceiverAddress(receiverAddress);
    }

    public List<Courier> getByReceiver(String receiverName) {
        return courierRepository.findByReceiverName(receiverName);
    }

    public List<Courier> getAllCouriers() {
        return courierRepository.findAll();
    }
}

