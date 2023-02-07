package com.example.dipractice;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDefinitionTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DependencyConfig.class);
        String[] beanDefinitions = ac.getBeanDefinitionNames();

        for (String bdName : beanDefinitions) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(bdName);

            if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
             System.out.println("beanDefinitionName = " + bdName +
                        ", beanDefinition = " + beanDefinition);
            }
        }
    }
}
