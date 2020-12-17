package Office_Hours.Practice_12_09_2020;

import java.text.DecimalFormat;

public class Carpet {
    public double width, length, unitPrice;
    public boolean isPersian;

    public void setInfo(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calCost(){
        DecimalFormat df = new DecimalFormat("0.00");
        double totalCost = (width*length)*unitPrice;
        if(isPersian) totalCost += 200;
        return Double.valueOf(df.format(totalCost));
    }


    public String toString() {
        return "Carpet{" +
                "width: " + width +
                ", length: " + length +
                ", unitPrice: " + unitPrice +
                ", isPersian: " + isPersian + ", Total cost: $"+ calCost()+
                '}';
    }

}
