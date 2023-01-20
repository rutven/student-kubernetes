package name.legkodymov.test.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    private String email;
}
