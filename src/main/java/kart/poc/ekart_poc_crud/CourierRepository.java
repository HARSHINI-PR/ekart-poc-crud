package kart.poc.ekart_poc_crud;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CourierRepository extends JpaRepository<Courier, Integer> {
    List<Courier> findByExecutiveName(String executiveName);
    List<Courier> findByReceiverAddress(String receiverAddress);
    List<Courier> findByReceiverName(String receiverName);
}
