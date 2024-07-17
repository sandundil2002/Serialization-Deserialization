package lk.ijse.gdse68;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Animal implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
}
