/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author thand
 */
public class ticker {
    private String name; 
    private String price;
    private String changerate;
    private String changeprice;
    private String volume;

    public ticker(String name, String price, String changerate, String changeprice, String volume) {
        this.name = name;
        this.price = price;
        this.changerate = changerate;
        this.changeprice = changeprice;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getChangerate() {
        return changerate;
    }

    public void setChangerate(String changerate) {
        this.changerate = changerate;
    }

    public String getChangeprice() {
        return changeprice;
    }

    public void setChangeprice(String changeprice) {
        this.changeprice = changeprice;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "ticker{" + "name=" + name + ", price=" + price + ", changerate=" + changerate + ", changeprice=" + changeprice + ", volume=" + volume + '}';
    }

    
}
