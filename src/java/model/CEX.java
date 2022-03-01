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
public class CEX {
    private int makettypeid;
    private String name;
    private String cexname;

    public CEX() {
    }

    public CEX(int makettypeid,  String cexname ,String name) {
        this.makettypeid = makettypeid;
        this.name = name;
        this.cexname = cexname;
    }

    
    public int getMakettypeid() {
        return makettypeid;
    }

    public void setMakettypeid(int makettypeid) {
        this.makettypeid = makettypeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCexname() {
        return cexname;
    }

    public void setCexname(String cexname) {
        this.cexname = cexname;
    }

    
    
    
}
