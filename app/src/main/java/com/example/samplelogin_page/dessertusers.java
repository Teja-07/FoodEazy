package com.example.samplelogin_page;

public class dessertusers {
    int dessertimage;
    String dessertnames,dessertcost;
    public dessertusers(String dessertnames,String dessertcost,int dessertimage )
    {
        this.dessertimage=dessertimage;
        this.dessertnames=dessertnames;
        this.dessertcost=dessertcost;
    }

    public String getDessertcost() {
        return dessertcost;
    }

    public void setDessertcost(String dessertcost) {
        this.dessertcost = dessertcost;
    }

    public int getDessertimage() {
        return dessertimage;
    }

    public String getDessertnames() {
        return dessertnames;
    }

    public void setDessertnames(String dessertnames) {
        this.dessertnames = dessertnames;
    }

    public void setDessertimage(int dessertimage) {
        this.dessertimage = dessertimage;
    }
}
