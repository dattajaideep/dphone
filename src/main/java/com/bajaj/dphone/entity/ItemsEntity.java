package com.bajaj.dphone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "items")
public class ItemsEntity {
    @Id
    @Column(name="item_id")
    private int itemId;
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "item_price")
    private int itemPrice;
    @Column(name = "item_description")
    private String itemDescription;
    @Column(name = "item_image")
    private String itemImageUrl;
    @Override
    public String toString() {
        return "ItemsEntity [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice
                + ", itemDescription=" + itemDescription + ", itemImageUrl=" + itemImageUrl + "]";
    }
    public ItemsEntity(int itemId, String itemName, int itemPrice, String itemDescription, String itemImageUrl) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemImageUrl = itemImageUrl;
    }
    public int getItemId() {
        return itemId;
    }
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public int getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
    public String getItemDescription() {
        return itemDescription;
    }
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    public String getItemImageUrl() {
        return itemImageUrl;
    }
    public void setItemImageUrl(String itemImageUrl) {
        this.itemImageUrl = itemImageUrl;
    }
    
}
