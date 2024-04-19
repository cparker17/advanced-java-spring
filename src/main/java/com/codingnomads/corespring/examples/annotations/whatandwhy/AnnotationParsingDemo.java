/* CodingNomads (C)2024 */
package com.codingnomads.corespring.examples.annotations.whatandwhy;

import java.lang.reflect.Method;

public class AnnotationParsingDemo {
    public static void main(String[] args) {
        try {
            Class<AnnotationDemoService> annotationDemoService = AnnotationDemoService.class;
            for (Method method : annotationDemoService.getMethods()) {
                if (method.isAnnotationPresent(ModernInfo.class) & method.isAnnotationPresent(SecondaryData.class )) {
                    ModernInfo modernInfo = method.getAnnotation(ModernInfo.class);
                    System.out.println("Info Received: " + modernInfo.info());
                    SecondaryData secondaryData = method.getAnnotation(SecondaryData.class);
                    System.out.println("Date Received: " + secondaryData.data());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
