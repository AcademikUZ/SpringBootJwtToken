package fan.company.springbootjwttoken.entity;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Outcome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Card fromCardId;

    @ManyToOne
    private Card toCardId;

    private double amount;

    private Date date;

    private double commissionAmount;


}
