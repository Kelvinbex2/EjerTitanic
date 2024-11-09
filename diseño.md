# Noma kelvin obamedo

## Analisis

  ### <b>Requisitos funcionales</b>
  - Generación de Barcas Salvavidas
  - Asignación de Pasajeros
  - Lanzamiento de Barcas
  - Simulación del Tiempo de Espera


### <b>Requisitos no funcionales</b>
- Cada barca debe liberarse de manera independiente
## Diseño Actual

``` plantuml

package es/etg/psp{
    package fichero{
        interface Salida{
           + {static} fichero: File
            + escribir(): void 
            + vaciar(): void
        }
    }

    
    package barca{
     class Barca{
        - superviviente: int
        - nombre: String
        }

    class GestorBarca {
        + Simular(): int
        + main(): void

        }
    }
  class Tiempo{
        + date : String
    }
package titanic{

  

    class Titanic{
        + ejecutar(): int
        + main: void
    }
    }

    package entrada{
        class Entrada{
        }
        
    }

    package salida{
        abstract Registro{
            + imprimir : void
        }

        class RegistroConsola extends Registro{

        }

        interface RegistroFactory{
            + elegir:Registro
        }

        class RegistroFichero extends Registro {

        }
        class RegistroFicheroTxt extends Registro {

        }
        enum TipoRegistro{
            TXT
            MD
            CONSOLA
        }

    }
}


GestorBarca .> Barca : "use"
Titanic .> GestorBarca : "lanza"
Salida .> Entrada : "use"
GestorBarca..> Tiempo : "use"
GestorBarca..> Entrada : "use"

RegistroFichero ..|> Salida
RegistroFicheroTxt ..|> Salida

GestorBarca..|> Salida 
GestorBarca..|> RegistroFactory






```

## Diseño quitando factorias y ficheros

``` plantuml


    package es/etg/psp{

        package barca{
            class Barca{

        }
        }
        

        package titanic{
            Class Titanic{

            }
        }


Titanic ..> Barca : "Lanza"
    }
```
