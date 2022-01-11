package com.example.samplelogin_page;

public class starterusers {
    int starterimage;
    String starternames,startercost;
    public starterusers(int starterimage,String starternames,String startercost)
    {
        this.startercost=startercost;
        this.starterimage=starterimage;
        this.starternames=starternames;
    }

    public String getStarternames() {
        return starternames;
    }

    public void setStarternames(String starternames) {
        this.starternames = starternames;
    }

    public String getStartercost() {
        return startercost;
    }

    public void setStartercost(String startercost) {
        this.startercost = startercost;
    }

    public int getStarterimage() {
        return starterimage;
    }

    public void setStarterimage(int starterimage) {
        this.starterimage = starterimage;
    }
}
