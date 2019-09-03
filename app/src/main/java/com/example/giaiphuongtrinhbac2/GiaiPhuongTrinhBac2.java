package com.example.giaiphuongtrinhbac2;

public class GiaiPhuongTrinhBac2 {
    float a;
    float b;
    float c;
    float x1;
    float x2;
    float x;

    public float getX() {
        return x;
    }

    public float getX1() {
        return x1;
    }

    public float getX2() {
        return x2;
    }

    public float GiaiPhuongTrinh(float a ,float b ,float c){
        if (a==0){
            if (b==0) {
                if (c == 0) {
                    return 1;
                }else {
                    return -1;
                }
            }else{
                x=(-c/b);
                return 2;
            }
        }else {
            float delta = b * b - 4 *( a * c);
            if (delta > 0) {
                x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
                return 3;
            }
            if (delta == 0) {
                x1 = (-b / (2 * a));
                return 4;
            }
            if(delta<0)
                return -1;
        }
        return 3000;
    }
}
