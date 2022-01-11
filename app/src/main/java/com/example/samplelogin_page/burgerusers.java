package com.example.samplelogin_page;

public class burgerusers {
    int burgerimage;
    String burgernames,burgercost;
    public burgerusers(int burgerimage,String burgercost,String burgernames)
    {
        this.burgercost=burgercost;
        this.burgerimage=burgerimage;
        this.burgernames=burgernames;
    }

    public String getBurgernames() {
        return burgernames;
    }

    public String getBurgercost() {
        return burgercost;
    }


    public void setBurgercost(String burgercost) {
        this.burgercost = burgercost;
    }

    public void setBurgernames(String burgernames) {
        this.burgernames = burgernames;
    }

    public int getBurgerimage() {
        return burgerimage;
    }

    public void setBurgerimage(int burgerimage) {
        this.burgerimage = burgerimage;
    }

}
