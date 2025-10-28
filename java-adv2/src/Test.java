import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        /*
people = [40,60,40,60], limit = 100
people = [45,55,55,45], limit = 100
people = [40,55,55,45], limit = 100
people = [30,70,30,70], limit = 100
people = [60,40,50,40], limit = 100
        *
        *
        * */
        // 구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없고, 무게 제한도 있습니다
        int[] people = {70, 50, 80, 50, 30, 10, 10};
        // 5050 / 7030 / 8010 / 10
        int limit = 100;

        System.out.println(test(people, limit));
    }

    public static int test(int[] people, int limit) {
        int answer = 0;

        Integer[] boxed = Arrays.stream(people).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, Comparator.reverseOrder());
        int passenger = 0;
        int cnt = 0;

        for (int i=0; i<people.length; i++) {
            if (boxed[i] != 0) {
                passenger += boxed[i];
                boxed[i] = 0;
                cnt ++;

                if (passenger > limit) {
                    answer ++;
                    passenger = 0;
                    cnt = 0;
                } else {
                    for (int j=i+1; j<people.length; j++){
                            passenger += boxed[j];
                            cnt ++;

                            if (passenger == limit) {
                                boxed[j] = 0;
                                break;
                            } else if (passenger > limit) {
                                passenger -= boxed[j];
                                cnt --;
                            } else {
                                boxed[j] = 0;
                                cnt++;
                            }

                            if (passenger > limit || cnt == 2) {
                                break;
                            }
                        }
                    }
                    answer ++;
                    passenger = 0;
                    cnt = 0;
                }
        }
        return answer;
    }

    /*
    public static int test(int[] people, int limit) {
        int answer = 0;

        Integer[] boxed = Arrays.stream(people).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, Comparator.reverseOrder());
        int passenger = 0;
        int cnt = 0;

        for (int i=0; i<people.length; i++) {
            System.out.println("=============" + i + "=============");
            System.out.println("boxed[i] : " + boxed[i]);
            System.out.println("passenger: " + passenger + "kg");
            System.out.println("answer: " + answer);
            System.out.println("cnt: " + cnt);

            if (boxed[i] != 0) {
                passenger += boxed[i];
                boxed[i] = 0;
                cnt ++;
                System.out.println();

                if (passenger > limit) {
                    System.out.println("1. passenger > limit");
                    answer ++;
                    passenger = 0;
                    cnt = 0;
                } else {
                    System.out.println("2. passenger > limit");
                    for (int j=i+1; j<people.length; j++){
                        System.out.println("boxed[j] : " + boxed[j]);
                        System.out.println("cnt : " + cnt);

                        passenger += boxed[j];
                        cnt++;

                        if (passenger == limit) {
                            System.out.println("3. passenger == limit");
                            boxed[j] = 0;
                            break;
                        } else if (passenger > limit) {
                            System.out.println("4. passenger > limit");
                            passenger -= boxed[j];
                            cnt--;
                        } else {
                            System.out.println("5. passenger > limit");
                            boxed[j] = 0;
                        }

                        System.out.println("== 끝 ==");
                        System.out.println("cnt : " + cnt);
                        System.out.println("passenger : " + passenger);

                        if (cnt == 2 || passenger == limit) {
                            System.out.println("??????????");
                            break;
                        }
                    }
                    answer ++;
                    passenger = 0;
                    cnt = 0;
                }
            }

        }
        return answer;
    }*/

//    public static int test(int[] people, int limit) {
//        int answer = 0;
//
//        Integer[] boxed = Arrays.stream(people).boxed().toArray(Integer[]::new);
//        Arrays.sort(boxed, Comparator.reverseOrder());
//        int passenger = 0;
//
//        for (int i=0; i<people.length; i++) {
//            System.out.println("=============" + i + "=============");
//            System.out.println("boxed[i] : " + boxed[i]);
//            System.out.println("passenger: " + passenger + "kg");
//            System.out.println("answer: " + answer);
//
//            if (boxed[i] != passenger) {
//                passenger += boxed[i];
//                boxed[i] = 0;
//
//                if (passenger > limit) {
//                    System.out.println("1. passenger > limit");
//                    answer ++;
//                    passenger = 0;
//                } else {
//                    System.out.println("2. passenger < limit");
//                    for (int j=i+1; j<people.length; j++){
//                        System.out.println("boxed[j] : " + j + " " + boxed[j]);
//                        System.out.println("passenger: " + passenger + "kg");
//                        System.out.println("answer: " + answer);
//                        passenger += boxed[j];
//                        if (passenger == limit) {
//                            System.out.println("passenger == limit");
//                            boxed[j] = 0;
//                            break;
//                        } else if (passenger > limit) {
//                            System.out.println("passenger > limit");
//                            passenger -= boxed[j];
//                        } else {
//                            System.out.println("passenger < limit");
//                            boxed[j] = 0;
//                        }
//                    }
//                    answer ++;
//                    passenger = 0;
//                }
//            }
//
//            System.out.println();
//            System.out.println();
//        }
//        return answer;
//    }
}
