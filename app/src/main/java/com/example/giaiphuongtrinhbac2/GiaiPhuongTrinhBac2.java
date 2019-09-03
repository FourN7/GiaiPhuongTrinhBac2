package com.example.giaiphuongtrinhbac2;

public class GiaiPhuongTrinhBac2 {
    private double a,b,c;

    public GiaiPhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public String tinhtoan(){
        double x1,x2;
        String chuoi="";
        double delta=b*b-4*a*c;
        if(a==0){
            if(b==0){
                if(c==0){
                    chuoi = "Phương trình vô số nghiệm\n";}
                else chuoi="Phương trình vô nghiêm\n";
            }else {x1=-c/b; chuoi="Phuong trình có 1 nghiệm:\n X="+x1+"\n"; }
        }else if(delta>0){
            x1=(-b + Math.sqrt(delta)) / (2 * a);
            x2=(-b - Math.sqrt(delta)) / (2 * a);
            chuoi="Phương Trình có 2 nghiệm:\n"
                    +"x1="+x1+"\n"
                    +"x2="+x2+"\n";
        }else if (delta==0){
            x1=-b/(2*a);
            chuoi="Phương Trình có nghiệm kép: x="+x1+"\n";
        }else {
            chuoi="Phương trình vô nghiêm";
        }
        return chuoi;
    }

}
