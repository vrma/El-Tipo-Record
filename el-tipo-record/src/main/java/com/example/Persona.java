package com.example;

import lombok.Builder;

/**
 * El record no es una mero atajo para crear una clase que permita crear objetos inmutables,
 * es decir, que una vez creado no se puedan modificar.
 * 
 * El record es lo mejor que existe para transportar datos, genera una estructura de datos
 * que es final, es decir, que no se puede heredar, ademas:
 * 
 * 1- Las propiedades o campos del Record entre parentesis se convierten en private final
 * por lo cual no se le pueden generar metodos setter para cambiarle el valor
 * 
 * 2- Se generan automaticamente metodos getter, pero que no llevan delante la palabra get,
 * sino el nombre de la propiedad o campo del record
 * 
 * 3- Se generan para el record los metodos toString, equals y hashCode.
 * 
 * En teoria un record no necesita de Lombok en absoluto, pero utilizar la anotacion 
 * @Builder de lombok, no facilita mucho el trabajo a la hora de instanciar un record,
 * porque no estariamos obligados a suministrar todos los parametros que el 
 * constructor espera ni tampoco tendriamos que respetar el orden
 * 
 */
@Builder
public record  Persona(
    String nombre, 
    double altura, 
    String apellido1, 
    String correo) {}
