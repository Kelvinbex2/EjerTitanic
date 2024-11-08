@echo off
cd src

javac es\etg\psp\entrada\Entrada.java

javac es\etg\psp\fichero\Salida.java

javac es\etg\psp\salida\Registro.java
javac es\etg\psp\salida\RegistroConsola.java
javac es\etg\psp\salida\RegistroFactory.java
javac es\etg\psp\salida\RegistroFichero.java
javac es\etg\psp\salida\TipoRegistro.java
javac es\etg\psp\salida\RegistroFicheroTxt.java

javac es\etg\psp\barca\Barca.java
javac es\etg\psp\barca\GestorBarca.java
javac es\etg\psp\Tiempo.java
javac es\etg\psp\titanic\Titanic.java


java  es/etg/psp/titanic/Titanic
cd ..

pause