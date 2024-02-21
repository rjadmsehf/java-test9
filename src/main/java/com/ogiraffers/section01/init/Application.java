package com.ogiraffers.section01.init;

public class Application {

    public static void main(String[] args) {

        /* 목표 객체 배열에 대해 이해할 수 있다. */
        /* 필기
            객체배열은 래퍼런스 변수에 대한 배열이다3
            생성한 인스턴스도 배열을 이용해서 관리하면
            동일한 타입의 여러 개 인스턴스를 각각 취급ㄱ하지 않고 연속 처리할 수 있어서 유용하낟.
            또한 반환값은(return) 1개의 값만 반환할 수 있기 떄문에
            동일한 타입의 여러 인스턴스를 반환해야 하는 경우 객체 배열을 이용할 수 있다.
         */

        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보르기니", 350);
        Car car3 = new Car("롤스로이스", 250);
        Car car4 = new Car("부가티", 400);
        Car car5 = new Car("모닝", 500);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();

        System.out.println("==============================================");

        Car[] carArray = new Car[5];

        carArray[0] = new Car("페라리", 300);
        carArray[1] = new Car("람보르기니", 350);
        carArray[2] = new Car("롤스로이스", 250);
        carArray[3] = new Car("부가티", 400);
        carArray[4] = new Car("모닝", 500);

        for (int i = 0; i < carArray.length; i++) {
            carArray[i].driveMaxSpeed();
        }

        /* 필기. 객체배열도 마찬가지로 할당동시에 초기화를 할 수 있다 */
        Car[] carArray2 = {

                new Car("페라리", 400)
               ,new Car("람보르기니", 350)
               ,new Car("롤스로이스", 250)
               ,new Car("부가티", 400)
               ,new Car("맥모닝", 500)

        };
        // 향상된 for문도 사용이 가능하다.
        for(Car c : carArray2) {
            c.driveMaxSpeed();
        }

    }


    }



