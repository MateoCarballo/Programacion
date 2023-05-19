package Lombok;

import lombok.*;

/**
 * @Data Te genera todos los getter setter y to string
 * @RequiredArgsConstructor Puedes generar un constructor con los parametros que encima de el tengan la anotacion @NonNull
 *
 */
@Data
@Builder
public class Gato {

    private String name;
private float weight;
private int age;



}
