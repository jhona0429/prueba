package com.jhona.contabilida.entity

import jakarta.persistence.*;
import org.hibernate.annotations.creationTimestap;
import org.hibernate.annotations.UpdateTimestamp;


@Entity 
@Table(name = "products")
public class Product{
    @id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id; 
    private String name;
    private String description;
    private Long quantity; 
    private Long price;

@column(name="stock_keeping_unit", nullable=false)
    private String sku;

    private boolean active;
    private String imageUrl;

@creationTimestap
    private LocalDateTime dateCreate;
    private LocalDateTime lastCreate;

    @UpdateTimestamp
    private LocalDateTime lastUpdated;

    public Product(){ //construcctor vacio


    }

    public Product(Long id, String name, String description, Long quantity, Long price, String sku, boolean active, String imageUrl, LocalDateTime dateCreated, LocalDateTime lastUpdated){
    this.id= id;
    this.name= name;
    this.description= description;
    this.quantity=quantity;
    this.price= price;
    this.sku=sku;
    this.active= active;
    this.imageUrl= imageUrl;
    this.dateCreated=dateCreated;
    this.lastUpdated=lastUpdated;

    }
public String getSku(){
return sku;

}
    


}