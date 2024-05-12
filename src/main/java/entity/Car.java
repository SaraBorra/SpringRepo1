package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "model")
    private String modelName;

    @Column(nullable = false, name = "serialNumber")
    private long serialNumber;

    @Column(nullable = true, name = "price")
    private BigDecimal currentPrice;

}