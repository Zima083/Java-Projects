package Zeema.sp.Annotation;
import java.lang.annotation.*;
@Target(value = ElementType.TYPE)

@interface MyAnno{
String name();
String Project();
String Version() default "13";
String Date() default "today";
}
@MyAnno(name="Ali",Project = "Anno")
public class AnnoDemo {
    public static void main(String[] args) {

    }
}
