package upeu.edu.pe.examen.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ordenes")
public class Ordenes {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name = "id")
private Long id;

@Column(name = "fecharorden")
@Temporal(TemporalType.DATE)
private Date fechaorden;

@Column(name = "fechasolicita")
@Temporal(TemporalType.DATE)
private Date fechasolicita;

@Column(name = "estado")
private String estado;

@ManyToOne
@JoinColumn(name = "almacenes_id", nullable = false)
private  Almacenes almacenes;

@ManyToOne
@JoinColumn(name = "formapago_id", nullable = false)
private  Formapago formapago;


@ManyToOne
@JoinColumn(name = "proveedores_id", nullable = false)
private  Proveedores proveedores;


@ManyToOne
@JoinColumn(name = "tipoorden_id", nullable = false)
private  Tipo_orden tipoorden;




}
