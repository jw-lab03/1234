package Bicycle;
public class Bicycle {
    protected int Gear;
    protected double Speed;

    public Bicycle(){ // 기어 속도가 0 인 생성자
        Gear = 0;
        Speed = 0;
    }

    public Bicycle(int startSpeed, int startGear) { // 기어 속도를 설정할 수 있는 생성자
        Speed = startSpeed;
        Gear = startGear;
    }

    public void setSpeed(int setSpeed) { // 설정한 값으로 속도 설정하는 setter
        Speed = setSpeed;
    } // 설정한 값으로 속도 설정하는 setter

    public void speedUp(int sup) { Speed += sup; }  // 설정한 파라미터 만큼 속도 늘이기
    public void speedDown(int sdown){ Speed -= sdown; } // 설정한 파라미터 만큼 속도 줄이기
    public void gearUp(int gup) { Gear += gup; } // 설정한 파라미터 만큼 기어 늘이기
    public void gearDown(int gdown) {Gear -= gdown;}  // 설정한 파라미터 만큼 기어 줄이기
    public void draw() {
        System.out.println("속도"+" "+Speed+" "+"기어"+" "+Gear);
    }
}