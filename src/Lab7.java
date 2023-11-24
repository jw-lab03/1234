/** A short description of the program.
 * @author Jaewon Jung
 * @ SID : 60191459
 * @assignment JAVAProgramming - 6
 * @date 20231119
 **/

import Bicycle.*;

// %만큼 속도 추가를 더 잘 표현하기 위해서 Speed 변수를 double로 선언하였습니다.
public class Lab7 {
    public static void main(String[] args) {
        Bicycle[] array = new Bicycle[3];

        array[0] = new Cycle(100, 10, true);
        array[1] = new MountainBike(10, 100, 10);
        array[2] = new ElectricalBike(100, 10, 10);

        array[0].speedUp(50); // 초기속도 100 , (100의 50%) + 10 만큼 증가 = 160 출력.
        array[1].speedUp(25); // 초기속도 100 , (100의 25%) 만큼 증가 = 125 출력.
        array[2].speedUp(7);  // 초기속도 100 , 배터리 레벨 10 * 파라미터 7%(0.07) =0.7 , 100.7 출력

        for (int i = 0; i<array.length; i++) {
            array[i].draw();
        }
    }
}