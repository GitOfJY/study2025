package annotation.basic;

import java.util.Arrays;

public class ElementDataMain {
    public static void main(String[] args) {
        Class<ElementData1> annoClass = ElementData1.class;
        AnnoElement annotation = annoClass.getAnnotation(AnnoElement.class);

        String vlaue = annotation.value();
        System.out.println("value: " + vlaue);

        int count = annotation.count();
        System.out.println("count: " + count);

        String[] tags = annotation.tags();
        System.out.println("tags: " + Arrays.toString(tags));
    }
}
