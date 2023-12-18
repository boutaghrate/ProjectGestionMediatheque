package project.mediatheque.mediatheque.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AbonnementDTO {

    Integer id;
    String name;

    @Override
    public String toString() {
        return "AbonnementDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
