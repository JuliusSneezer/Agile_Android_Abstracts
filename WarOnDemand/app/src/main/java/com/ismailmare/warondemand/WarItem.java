package com.ismailmare.warondemand;

/**
 * Created by unkno on 2016-02-11.
 */
public class WarItem {
    private String name;
    private String desc;

    //0 for Available
    //1 for bid on
    //2 for borrowed
    private int status;
    //private Boolean returning;//if true, set to available when returned.

    public WarItem(String name, String desc) {
        this.name = name;
        this.desc = desc;
        this.status = 0;
        //this.returning = Boolean.FALSE;
    }

    public WarItem(String name) {
        this.name = name;
        this.desc = "Default Description";
        this.status = 0;
        //this.returning = Boolean.FALSE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {

        this.status = status;
    }

/*    public Boolean getReturning() {
        return returning;
    }

    public void setReturning(Boolean returning) {
        this.returning = returning;
    }*/
}