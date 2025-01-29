package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {

        // 객체지향 1) 데이터 묶음
        MusicPlayerData data = new MusicPlayerData();

        // 객체지향 2) 메서드 활용
        //음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태
        showStatus(data);

        // 음악 플레이어 종료
        off(data);

        // 문제 : 데이터와 기능이 나눠져있음 > 수정하기 어려움

    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : "+data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : "+data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인 : ");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : "+data.volume);
        } else {
            System.out.println("음악 플레이어 OFF, 볼륨 : "+data.volume);
        }
    }

}
