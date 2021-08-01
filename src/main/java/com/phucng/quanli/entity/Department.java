package com.phucng.quanli.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "department")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "department_manager_id", referencedColumnName = "id",
            insertable = false, updatable = false)
    private User departmentManager;

    @OneToMany(mappedBy = "department")
    @JsonManagedReference
    private List<Team> teams;
}
