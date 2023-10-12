package com.java.assign;
class Discount {
    public double calculateDiscount(Bero Obj) {
        if (Obj instanceof SteelBero) {
            return (Obj.getPrice() * 10) / 100;
        } else if (Obj instanceof WoodenBero) {
            return (Obj.getPrice() * 15) / 100;
        } else {
            System.out.println("Invalid bero type");
            return 0;
        }
    }
}


