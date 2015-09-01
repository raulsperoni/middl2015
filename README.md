# middl2015
Repo tareas Middleware

Modulo ws-facturas: Servidor WS para una de las empresas.

http://localhost:8080/ws-1/hello

Modulo ws-entradas: Servidor con autenticacion.

http://localhost:8080/ws-2/hello

Modulo central: Spring Integration + jms

Modulo lealtad: jms


# NOTAS:

## SOBRE TOMCAT:

En la configuracion del tomcat, agregar los dos artefactos war. En cada uno configurar el context con el nombre del war.

central -> /

lealtad -> /lealtad

ws-entradas -> /ws-1

ws-facturas -> /ws-2

TOMCAT 8: http://tomcat.apache.org/download-80.cgi

## SOBRE WS:

JAX-WS libs en Tomacat/lib: https://jax-ws.java.net/2.2.10/

sun-jaxws.xml is a proprietary deployment descriptor needed when web services are deployed as a standard WAR archive on a non-Java EE5 servlet container using the SUN's reference implementation.
