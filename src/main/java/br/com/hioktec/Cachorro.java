package br.com.hioktec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Exemplo de criação de annotation
@Target(ElementType.FIELD) // aplicavel somente em campo (field)
@Retention(RetentionPolicy.RUNTIME)
@Autowired
@Qualifier("cachorro")
public @interface Cachorro {
}
