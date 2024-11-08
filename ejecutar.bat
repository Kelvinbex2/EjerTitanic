@echo off
cd src

javac es\etg\psp\entrada\Entrada.java

javac es\etg\psp\fichero\Salida.java

javac es\etg\psp\salida\Registro.java
javac es\etg\psp\salida\RegistroConsola.java
javac es\etg\psp\salida\RegistroFactory.java
javac es\etg\psp\salida\RegistroFichero.java
javac es\etg\psp\salida\TipoRegistro.java
javac  es\etg\psp\Barca.java
javac  es\etg\psp\GestorBarca.java
javac es\etg\psp\Hilo.java
javac  es\etg\psp\Tiem.java
javac  es\etg\psp\Titanic.java

Rem java  es/etg/psp/Titanic
cd ..

pause