package net.javaguides.class_student.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "points")
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "maths")
    private float maths;

    @Column(name = "physical")
    private float physical;

    @Column(name = "chemistry")
    private float chemistry;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "student_id")
    Student student;
}
