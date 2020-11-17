1. Con la ayuda del IDE NetBeans crear un proyecto de tipo Aplicación Java, llamado
MediaNumericaArgumento, que contenga su punto de entrada en la clase Main que se
encuentra en el paquete org.japo.java.main, que llame al método launchApp de la clase
App que se encuentra en el paquete org.japo.java.app.
El programa debe de:

1. Definir las constantes NUMÉRICAS de clase N1 y N2 inicializadas con sendos
valores arbitrarios.

2. Definir un método llamado calcularMedia, que debe recibir dos argumentos
llamados n1 y n2 y devolver su media artimética, con la siguiente signatura:
public static final double calcularMedia(double n1, double n2);

3. Llamar al método calcularMedia con los argumentos correspondientes.

4. Mostrar por pantalla el proceso en el siguiente formato:

CÁLCULO MEDIA ARITMÉTICA
========================
Número 1 .........: 3.6
Número 2 .........: 7.4
---
Media aritmética .: 5.5


2. Con la ayuda del IDE NetBeans crear un proyecto de tipo Aplicación Java, llamado
EntradaNumericaArgumento, que contenga su punto de entrada en la clase Main que se
encuentra en el paquete org.japo.java.main, que llame al método launchApp de la clase
App que se encuentra en el paquete org.japo.java.app.
El programa debe de:

1. Definir la constante de clase MSG_USR inicializada con el mensaje que debe
indicar al usuario a que introduzca un número por teclado.

2. Definir la constante de clase MSG_ERR inicializada con el mensaje que debe
indicar al usuario que ha habido un error en el proceso de introducción de un
número por teclado.

3. Definir un método llamado obtenerNumero, que debe gestionar la petición al
usuario de un número y su posterior devolución, en el bien entendido de que en
caso de error se debe de repetir la petición, con la siguiente signatura:
public static final double obtenerNumero(String msgUsr, String msgErr);

4. Llamar al método obtenerNumero para acceder al número introducido por el
usuario.

5. Informar finalmente del proceso en el siguiente formato:

INTRODUCCIÓN NUMÉRICA
=====================
Introducir número ....: sirtopwe
ERROR: Entrada incorrecta
---
Introducir número ....: 6.172839
---
Número introducido ...: 6.2

INTRODUCCIÓN NUMÉRICA
=====================
Introducir número ....: 3
---
Número introducido ...: 3.0



3. Con la ayuda del IDE NetBeans crear un proyecto de tipo Aplicación Java, llamado
AnalisisRangoArgumento, que contenga su punto de entrada en la clase Main que se
encuentra en el paquete org.japo.java.main, que llame al método launchApp de la clase
App que se encuentra en el paquete org.japo.java.app.
El programa debe de:

1. Definir la constante de clase NUM inicializada con el valor correspondiente a un
número arbitrario.

2. Definir las constantes de clase MIN y MAX inicializadas con los valores
correspondientes a un rango arbitrario como por ejemplo [1..10].

3. Definir un método llamado analizarRango, que recibe un número y los límites de
un rango, y que debe de devolver un valor numérico que codifique:

• Número DENTRO del rango: 0
• Número FUERA ( Debajo ) del rango: 1
• Número FUERA ( Encima ) del rango: 2
con la siguiente signatura:
public static final int analizarRango(double num, double min, double max);

4. Llamar al método analizarRango con las constantes definidas previamente para el
número en el rango.

5. Informar del estado de pertenencia del número al rango, en el formato:

ANÁLISIS DE RANGO
=================
Número ......: -3.6
---
Mínimo ......: 1.0
Máximo ......: 10.0
---
Análisis ....: FUERA ( Abajo )

ANÁLISIS DE RANGO
=================
Número ......: 5.1
---
Mínimo ......: 1.0
Máximo ......: 10.0
---
Análisis ....: DENTRO

ANÁLISIS DE RANGO
=================
Número ......: 57.9
---
Mínimo ......: 1.0
Máximo ......: 10.0
---
Análisis ....: FUERA ( Arriba )



4. Con la ayuda del IDE NetBeans crear un proyecto de tipo Aplicación Java, llamado
ValidacionDNIArgumento, que contenga su punto de entrada en la clase Main que se
encuentra en el paquete org.japo.java.main, que llame al método launchApp de la clase
App que se encuentra en el paquete org.japo.java.app.
El programa debe de:

1. Definir la constante de clase SECUENCIA inicializada con la secuencia de letras:
public static final String SECUENCIA = "TRWAGMYFPDXBNJZSQVHLCKE";

2. Definir la constante de clase DNI_NUM inicializada con un número entero
correspondiente a un DNI arbitrario.

3. Definir la constante de clase DNI_CTR inicializada con un carácter alfabético
correspondiente a un DNI arbitrario.

4. Definir un método llamado validar, que debe analizar y devolver el estado de
correspondencia del número y la letra suministrados a un DNI correcto [true] o DNI
incorrecto [false], con la siguiente signatura:
public static final boolean validar(int num, char ctr);

5. Definir un método llamado calcular, que debe calcular y devolver la letra de
control asociada al número de DNI suministrado, con la siguiente signatura:
public static final char calcular(int num);

6. Llamar al método validar con las constantes DNI_NUM y DNI_CTR para averiguar si
se corresponden con un DNI correcto o no.

7. Mostrar el resultado del análisis por pantalla en el formato:

VALIDACIÓN DE DNI
=================
DNI ......: 12345678Z
---
Validez ..: Correcto

VALIDACIÓN DE DNI
=================
DNI ......: 12345678X
---
Validez ..: Incorrecto
