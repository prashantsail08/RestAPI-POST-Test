package com.restapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity: Marks this class as a JPA entity (table in database).
//Lombok annotations:
//@Data: Generates getters, setters, toString, equals, and hashCode methods.
//@AllArgsConstructor: Generates a constructor with all fields.
//@NoArgsConstructor: Generates a default constructor.

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id // Marks 'id' as the primary key.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates ID values.
	private Long id;
	private String name;
	private int age;
}
