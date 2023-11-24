package Bicycle;

public class Cycle extends Bicycle{
    private boolean isbasket;

    public Cycle (int startSpeed, int staryGear, boolean isbasket){ // 속도, 기어, 바구니 유무 설정가능한 생성자
        this.Speed = startSpeed;
        this.Gear = staryGear;
        this.isbasket = isbasket;
    }

    @Override
    public void speedUp(int sup) {
        Speed += (0.01 * sup * Speed) + 10;
    } // 현 속도에서 파라미터의 % + 10 만큼 속도 늘이기
    public void speedDown(int sdown){
        Speed -= (0.01 * sdown) + 10;
    } // 현 속도에서 파라미터의 % + 10 만큼 속도 줄이기

    public void draw() {
        System.out.println("속도"+" "+Speed+" "+"기어"+" "+Gear+" "+"바구니 유무"+" "+isbasket);
    }

}
