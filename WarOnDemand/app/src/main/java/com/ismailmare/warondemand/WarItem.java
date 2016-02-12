package com.ismailmare.warondemand;

/**
 * Created by unkno on 2016-02-11.
 */
public class WarItem {
    private String name;
    private String desc;
    private String status;
    //private Boolean returning;//if true, set to available when returned.

    public WarItem(String name, String desc) {
        this.name = name;
        this.desc = desc;
        this.status = "available";
        //this.returning = Boolean.FALSE;
    }

    public WarItem(String name) {
        this.name = name;
        this.desc = "Default Description";
        this.status = "available";
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

/*    public Boolean getReturning() {
        return returning;
    }

    public void setReturning(Boolean returning) {
        this.returning = returning;
    }*/
}