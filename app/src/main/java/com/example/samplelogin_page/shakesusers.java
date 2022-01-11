package com.example.samplelogin_page;

public class shakesusers {
    int shakesimage;
    String shakesnames,shakescost;
    public  shakesusers(int shakesimage,String shakesnames,String shakescost)
    {
        this.shakescost=shakescost;
        this.shakesnames=shakesnames;
        this.shakesimage=shakesimage;
    }

    public String getShakescost() {
        return shakescost;
    }

    public void setShakescost(String shakescost) {
        this.shakescost = shakescost;
    }

    public String getShakesnames() {
        return shakesnames;
    }

    public void setShakesnames(String shakesnames) {
        this.shakesnames = shakesnames;
    }

    public int getShakesimage() {
        return shakesimage;
    }

    public void setShakesimage(int shakesimage) {
        this.shakesimage = shakesimage;
    }
}
