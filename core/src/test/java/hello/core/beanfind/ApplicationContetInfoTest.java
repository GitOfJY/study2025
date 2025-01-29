package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContetInfoTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = ac.getBean(beanDefinitionName);
            System.out.println("name = " + beanDefinitionName + " object + " + bean);
        }
    }

    @Test
    @DisplayName("애플리케이션 빈 출력하기")
    void findApplicationBean() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);

            // BeanDefinition.ROLE_APPLICATION
            if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = ac.getBean(beanDefinitionName);
                System.out.println("name = " + beanDefinitionName + " object + " + bean);
            }

            /*
            * name = appConfig object + hello.core.AppConfig$$SpringCGLIB$$0@13330ac6
            * name = memberService object + hello.core.member.MemberServiceImpl@539d019
            * name = memberRepository object + hello.core.member.MemoryMemberRepository@39a2bb97
            * name = orderService object + hello.core.order.OrderServiceImpl@3ad2e17
            * name = discountPolicy object + hello.core.discount.RateDiscountPolicy@8c3619e
            * */

            // ROLE_INFRASTRUCTURE (스프린 내부)
            if (beanDefinition.getRole() == BeanDefinition.ROLE_INFRASTRUCTURE) {
                Object bean = ac.getBean(beanDefinitionName);
                System.out.println("name = " + beanDefinitionName + " object + " + bean);
            }

            /*
            * name = org.springframework.context.annotation.internalConfigurationAnnotationProcessor object + org.springframework.context.annotation.ConfigurationClassPostProcessor@38aa816f
            * name = org.springframework.context.annotation.internalAutowiredAnnotationProcessor object + org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor@53f6fd09
            * name = org.springframework.context.annotation.internalCommonAnnotationProcessor object + org.springframework.context.annotation.CommonAnnotationBeanPostProcessor@6bffbc6d
            * name = org.springframework.context.event.internalEventListenerProcessor object + org.springframework.context.event.EventListenerMethodProcessor@1b84f475
            * name = org.springframework.context.event.internalEventListenerFactory object + org.springframework.context.event.DefaultEventListenerFactory@7749bf93
            * */

        }
    }
}
