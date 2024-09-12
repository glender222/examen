package upeu.edu.pe.examen.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "almacenes")
public class Almacenes {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name = "id")
private Long id;

@Column(name = "nombre")
private String nombre;

@Column(name = "direccion")
private String direccion;

@Column(name = "telefono")
private String telefono;

@Column(name = "estado")
private String estado;


@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY, mappedBy  = "almacenes")
@JsonIgnore
private Set<Ordenes>ordenes;

}
