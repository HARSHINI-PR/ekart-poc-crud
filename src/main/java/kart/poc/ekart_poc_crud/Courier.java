package kart.poc.ekart_poc_crud;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Courier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int parcelId;
    private String receiverName;
    private String parcelItemName;
    private String receiverAddress;
    private long receiverContact;
    private double itemPrice;
    private String itemStatus; // transit / delivered
    private String executiveName;
}

