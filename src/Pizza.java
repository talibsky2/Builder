// Product
enum Crust {
    thin, thick
}
enum Souse {
    ketchup, mayo
}
enum Topping{
    chicken, salami, vegetables
}
class Pizza {
    String name;
    Crust crust;
    Souse souse;
    Topping topping;
    void setName (String name){
        this.name = name;
    }
    void setCrust(Crust crust){
        this.crust = crust;
    }
    void setSouse (Souse souse){
        this.souse = souse;
    }
    void setTopping (Topping topping){
        this.topping = topping;
    }
    public String toString (){
        return "Your order: " + name + " - pizza on "+ crust + " crust, with " + souse + " and " + topping;
    }
}
