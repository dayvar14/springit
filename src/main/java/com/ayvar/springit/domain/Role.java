package com.ayvar.springit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;
}
