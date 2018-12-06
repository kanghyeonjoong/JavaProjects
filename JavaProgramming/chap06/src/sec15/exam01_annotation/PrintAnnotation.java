package sec15.exam01_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target은 메소드에만 적용하도록 했고, @Retention은 런타임 시까지 어노테이션 정보를 유지하도록 한다.
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";

	int number() default 15;
}
