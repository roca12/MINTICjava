/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca12.learn.mintic.webservicesmintic.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Diego Rodriguez (roca12)
 */
@Entity
@Table(name = "universidades")
@NamedQueries({
    @NamedQuery(name = "Universidades.findAll", query = "SELECT u FROM Universidades u"),
    @NamedQuery(name = "Universidades.findById", query = "SELECT u FROM Universidades u WHERE u.id = :id"),
    @NamedQuery(name = "Universidades.findByAcronimo", query = "SELECT u FROM Universidades u WHERE u.acronimo = :acronimo"),
    @NamedQuery(name = "Universidades.findByNombre", query = "SELECT u FROM Universidades u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Universidades.findByLogourl", query = "SELECT u FROM Universidades u WHERE u.logourl = :logourl"),
    @NamedQuery(name = "Universidades.findByFechaCreacion", query = "SELECT u FROM Universidades u WHERE u.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Universidades.findByFechaModificaci\u00f3n", query = "SELECT u FROM Universidades u WHERE u.fechaModificaci\u00f3n = :fechaModificaci\u00f3n")})
public class Universidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "acronimo")
    private String acronimo;
    @Size(max = 256)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 500)
    @Column(name = "logourl")
    private String logourl;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "fecha_modificaci\u00f3n")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificación;
    @JoinColumn(name = "ciudad", referencedColumnName = "idCiudades")
    @ManyToOne
    private Ciudades ciudad;
    @JoinColumn(name = "pais", referencedColumnName = "Codigo")
    @ManyToOne
    private Paises pais;
    @OneToMany(mappedBy = "universidad")
    private Collection<Usuarios> usuariosCollection;

    public Universidades() {
    }

    public Universidades(Integer id) {
        this.id = id;
    }

    public Universidades(Integer id, String acronimo) {
        this.id = id;
        this.acronimo = acronimo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificación() {
        return fechaModificación;
    }

    public void setFechaModificación(Date fechaModificación) {
        this.fechaModificación = fechaModificación;
    }

    public Ciudades getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudades ciudad) {
        this.ciudad = ciudad;
    }

    public Paises getPais() {
        return pais;
    }

    public void setPais(Paises pais) {
        this.pais = pais;
    }

    public Collection<Usuarios> getUsuariosCollection() {
        return usuariosCollection;
    }

    public void setUsuariosCollection(Collection<Usuarios> usuariosCollection) {
        this.usuariosCollection = usuariosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Universidades)) {
            return false;
        }
        Universidades other = (Universidades) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.roca12.learn.mintic.webservicesmintic.entities.Universidades[ id=" + id + " ]";
    }
    
}
