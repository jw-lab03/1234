package Bicycle;
public class MountainBike extends Bicycle {
    private int seatHeight ;
    //int startHeight;
    public MountainBike(int startHeight, int startSpeed, int startGear){ // 속도, 기어, 의자높이 설정가능한 생성자
        super(startSpeed, startGear);
        seatHeight = startHeight;
    }
    public void setHeight(int seatHeight) { // 설정한 값으로 seatHeight 설정하는 setter
        this.seatHeight = seatHeight;
    }
    @Override
    public void speedUp(int sup) { // 현 속도에서 파라미터의 % 만큼 속도 늘이기
        Speed += Speed * (0.01 * sup);
    }
    public void speedDown(int sdown){ // 설정한 파라미터 만큼 속도 줄이기
        Speed -= Speed * (0.01 * sdown);
    } // 현 속도에서 파라미터의 % 만큼 속도 줄이기
    public void draw() {
        System.out.println("속도"+" "+Speed+" "+"기어"+" "+Gear+" "+"의자 높이"+" "+seatHeight);
    }
}
                                 