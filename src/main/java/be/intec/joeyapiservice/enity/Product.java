package be.intec.joeyapiservice.enity;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Product {

    Long id;

    String title;

    }
