package io.member;

import io.member.impl.DataMemberRepository;
import io.member.impl.FileMemberRepository;
import io.member.impl.MemoryMemberRepository;
import io.member.impl.ObjectMemberRepository;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MemberConsoleMain {
    // private static final MemberRepository repository = new MemoryMemberRepository();
    // private static final MemberRepository repository = new FileMemberRepository();
    // private static final MemberRepository repository = new DataMemberRepository();
    private static final MemberRepository repository = new ObjectMemberRepository();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.회원등록 | 2. 회원목록조회 | 3.종료");
            System.out.print("선택 : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    registerMember(scanner);
                    break;
                case 2:
                    displayMembers();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
               default:
                        System.out.println("잘못된 선택입니다.");
            }
        }
    }

    private static void registerMember(Scanner scanner) throws IOException {
        System.out.print("id 입력 : ");
        String id = scanner.nextLine();

        System.out.print("name 입력 : ");
        String name = scanner.nextLine();

        System.out.print("age 입력 : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Member member = new Member(id, name, age);
        repository.add(member);
        System.out.println("회원 등록 성공");
    }

    private static void displayMembers() {
        List<Member> memberList = repository.findAll();
        System.out.println("회원목록 : ");
        for (Member member : memberList) {
            System.out.printf("[ID : %s, NAME : %s, AGE : %d]\n", member.getId(), member.getName(), member.getAge());
        }
    }
}
