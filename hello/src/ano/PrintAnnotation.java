package ano;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//여러개 적용될 수 있으면 {}로 묶기 / 하나만 적용되야하면 {} 빼고 적기
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
  String value() default "-";
  int number() default 15;
}
