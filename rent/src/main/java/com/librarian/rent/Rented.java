package com.librarian.rent;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Rented {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    public Integer id;

    public Integer bookId;
    public Integer userId;
    public LocalDateTime rentedOn;
    public LocalDateTime returnOn;
}
