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
    private int cexid;
    private String cexname;

    public CEX(int cexid, String cexname) {
        this.cexid = cexid;
        this.cexname = cexname;
    }

    public int getCexid() {
        return cexid;
    }

    public void setCexid(int cexid) {
        this.cexid = cexid;
    }

    public String getCexname() {
        return cexname;
    }

    public void setCexname(String cexname) {
        this.cexname = cexname;
    }
    
    
}
