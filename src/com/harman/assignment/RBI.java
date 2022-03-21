package com.harman.assignment;

public class RBI {
    float getInterestRate(){
        return 18;
    }
}

class SBI extends RBI{
    @Override
    float getInterestRate() {
        return 18.5F;
    }
}
class Axis extends RBI{
    @Override
    float getInterestRate() {
        return 17;
    }
}


class Main extends RBI{
    public static void main(String[] args) {
        RBI ob = new RBI();
        System.out.print("The Interest Rate of RBI: ");
        System.out.println(ob.getInterestRate());
        SBI ob1 = new SBI();
        System.out.print("The Interest Rate of SBI: ");
        System.out.println(ob1.getInterestRate());
        Axis ob3 = new Axis();
        System.out.print("The Interest Rate of Axis: ");
        System.out.println(ob3.getInterestRate());

    }
}
