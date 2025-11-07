package hellojpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-h2-demo");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            // 생성
            /*
            Member member = new Member();
            member.setId(1L);
            member.setName("Jack");
            em.persist(member);
            */

            // 조회
            /*
            Member findMember = em.find(Member.class, 1L);
            System.out.println("findMember.id = " + findMember.getId());
            System.out.println("findMember.name = " + findMember.getName());
            */
            List<Member> result = em.createQuery("select m from Member m", Member.class).getResultList();
            for (Member member : result) {
                System.out.println("member.name = " + member.getName());
            }

            // 수정
            // findMember.setName("JackUpdate");

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
