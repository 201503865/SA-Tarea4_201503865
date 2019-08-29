# SA-Tarea4_201503865
 
### 201503865 Julia Argentina Sierra Herrera

## Acerca del Proyecto

Es una aplicacion donde se utiliza SOA para simular algunos de los servicios que presta Uber, en esta aplicacion solo se detalla lo siguiente:

1. Peticion de Uber por parte del cliente
2. Ubicacion del auto
3. Obtener datos del piloto para ser enviados al cliente

Los servicios fueron orquestados por medio de BPEL. Se utilizo OpenESB para realizar la orquestacion de servicios.

## Video Demostracion BPEL

https://youtu.be/3EFat95UgaM

## Arquitectura

![BPEL](https://github.com/201503865/SA_Tarea4_201503865/blob/master/arq.jpeg)

#Servicio Disponible

## Cliente

Se pide el id del cliente que solicita el viaje para encontrar su ubicacion.

### Clases
 - Clase cliente: es el nodo cliente que contiene la informacion por cliente
 
 ## Rastreo
 
 Se obtiene la ubicacion del clienta para encontrar carros que se encuentren cercanos a su zona
 
 ## Pilotos

 Se obtiene a que piloto pertenece el automovil, para obtener sus datos y ser enviados al cliente.
 
 
