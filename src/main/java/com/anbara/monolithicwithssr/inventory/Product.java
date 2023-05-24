package com.anbara.monolithicwithssr.inventory;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

/**
 * @author Ayoub ANBARA
 */
@Entity
@Table
public class Product {
    @Id @GeneratedValue
    private UUID id;


}
