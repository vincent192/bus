package cooperation;

public class Bus {
    int passengerCount;     // 승객  수
    int busNumber;          // 버스 번호
    int busFee;             // 버스 요금
    int fuelVolume;         // 주유 량
    int busSpeed;           // 버스 속도
    int busState;           // 버스 상태


    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }



    public void showInfo() {
        if (fuelVolume<10){
        System.out.println("주유량을 확인해주세요");
    }
}