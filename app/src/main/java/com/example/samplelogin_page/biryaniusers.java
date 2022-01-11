package com.example.samplelogin_page;

public class biryaniusers {
    int biryaniimage;
    public  biryaniusers(int biryaniimage,String biryaninames,String biryanicost)
    {
        this.biryanicost=biryanicost;
        this.biryaniimage=biryaniimage;
        this.biryaninames=biryaninames;
    }
    public int getBiryaniimage() {
        return biryaniimage;
    }

    public String getBiryanicost() {
        return biryanicost;
    }

    public void setBiryanicost(String biryanicost) {
        this.biryanicost = biryanicost;
    }

    public String getBiryaninames() {
        return biryaninames;
    }

    public void setBiryaninames(String biryaninames) {
        this.biryaninames = biryaninames;
    }

    public void setBiryaniimage(int biryaniimage) {
        this.biryaniimage = biryaniimage;
    }

    String biryaninames,biryanicost;

}
