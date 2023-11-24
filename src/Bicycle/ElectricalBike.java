package Bicycle;

public class ElectricalBike extends Bicycle{
    private double Battery;

    public ElectricalBike(int startSpeed, int startGear, int Battery) { // 속도, 기어, 배터리레벨 설정가능한 생성자
        this.Speed = startSpeed;
        this.Gear = startGear;
        this.Battery = Battery;
    }
    public void setBattery(double batterySet){
        this.Battery = batterySet;
    } // 배터리 충전 파라미터 만큼으로 설정 setter

    @Override
    public void speedUp(int sup) {
        Speed += Battery * (0.01 * sup);
    } // 배터리 레벨 * 파라미터의 % 속도 늘이기
    public void speedDown(int sdown){
        Speed -= Battery * (0.01 * sdown);
    } // 배터리 레벨 * 파라미터의 % 속도 줄이기
    public void draw() {
        System.out.println("속도"+" "+Speed+" "+"기어"+" "+Gear+" "+"배터리"+" "+Battery);
    }
}
