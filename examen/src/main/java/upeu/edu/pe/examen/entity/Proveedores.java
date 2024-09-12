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
@Table(name = "proveedores")
public class Proveedores {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name = "id")
private Long id;

@Column(name = "ruc")
private String ruc;

@Column(name = "razonsocial")
private String razonsocial;

@Column(name = "contacto")
private String contacto;

@Column(name = "telefono")
private String telefono;

@Column(name = "estado")
private String estado;

@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY, mappedBy  = "proveedores")
@JsonIgnore
private Set<Ordenes>ordenes;

}
