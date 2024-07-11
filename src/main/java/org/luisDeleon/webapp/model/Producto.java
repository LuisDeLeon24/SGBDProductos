/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.luisDeleon.webapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author informatica
 */

@Entity
@Table(name="Productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productoid;
    private String nombreproducto;
    private String marcaProducto;
    private String descripcionProducto;
    @Column(name="precio")
    private double precioProducto;

    public Producto() {
    }

    public Producto(String nombreproducto, String marcaProducto, String descripcionProducto, double precioProducto) {
        this.nombreproducto = nombreproducto;
        this.marcaProducto = marcaProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
    }
    
    

    public Producto(long productoid, String nombreproducto, String marcaProducto, String descripcionProducto, double precioProducto) {
        this.productoid = productoid;
        this.nombreproducto = nombreproducto;
        this.marcaProducto = marcaProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
    }

    public long getProductoid() {
        return productoid;
    }

    public void setProductoid(long productoid) {
        this.productoid = productoid;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public String toString() {
        return "ProductoID: " + productoid + " Nombre: " + nombreproducto + " Marca: " + marcaProducto + " Descripcion: " + descripcionProducto + " Precio" + precioProducto;
    }
    
    
}
