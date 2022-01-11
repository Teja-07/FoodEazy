package com.example.samplelogin_page;

public class pizzausers {
    int pizzaimage;
    public pizzausers(int pizzaimage,String pizzacost,String pizzanames)
    {
        this.pizzacost=pizzacost;
        this.pizzaimage=pizzaimage;
        this.pizzanames=pizzanames;
    }
    public String getPizzanames() {
        return pizzanames;
    }

    public String getPizzacost() {
        return pizzacost;
    }

    public void setPizzacost(String pizzacost) {
        this.pizzacost = pizzacost;
    }

    public void setPizzanames(String pizzanames) {
        this.pizzanames = pizzanames;
    }

    public int getPizzaimage() {
        return pizzaimage;
    }

    public void setPizzaimage(int pizzaimage) {
        this.pizzaimage = pizzaimage;
    }

    String pizzanames,pizzacost;
}
