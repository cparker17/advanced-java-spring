/* CodingNomads (C)2024 */
package com.codingnomads.springweb.springrestcontrollers.shortcutannotations.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private Boolean completed = false;
}
