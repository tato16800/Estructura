# Empresa de Tauret
- - -
La empresa Tauret administrada por **Alejandro Castillo** Con el proposito de realizar,
mantenimiento preventivo y venta de equipos de computo.

Necesita realizar un software/api especializado para el calculo de un promedio del total
de ventas por cliente que se realizen por jornada.

El administrador necesita ingresar los siguiente datos del usuario:
* Identificacion
* Nombre
* El valor de los productos

- - -

Para el realize del software/api se requiere:
* Historia de usuario
* Caso de uso
* Diagrama del flujo del software
* Pseudocodigo del software
* Funcionamiento



- - -

#### Historia de usuario
*****

![HistoriaUsuario](/img/Historia%20de%20Usuarios.png)
*****

#### Casos de uso
*****

![CasosDeUso](/img/Casos%20de%20uso.png)
Descripcion del caso de uso
Nombre: Calcular el promedio de ventas de computador
Actores: Aministrador
Proposito: Poder promediar las ventas de computadores diarias
###### Curso Normal de eventos:
* El administrador ingresa la cantidad de clientes.
* El administrador ingresa la cedula del cliente, nombre y el valor de venta de los computadores.
* Se calcula el promedio a partir de: (∑(Computador 1,Computador 2,Computador 3) / Cantidad de computadores) / Cantidad de clientes.
* Se calcula el promedio de ventas del dia.
*****

#### Diaframa de flujo
*****
![DiagramaDeFlujo](/img/Diagrama%20de%20fluyo.png)
*****

#### Taller
*****
![Taller](/img/Taller.png)
*****
#### Funcionamiento
*****
![Procedimiento](/img/Procedimiento1.png)
*****

#### Taller Con Objetos
*****
![Objetos](/img/Objetos2.png)
*****
![Objetos2](/img/Objetos1.png)
*****

#### Funcionamiento
*****
![Procedimiento2](/img/Procedimiento2.png)

#### Pseudocodigo
*****

        Inicio

                Entero tam,com1,com2,com3,promedio,ids,i
                
                promedio <- 
                
                Imprimir "Digite el numero de clientes"
                
                Leer tam
                
                Entero ced[tam]
                
                Entero ced[comp1]
                
                Entero ced[comp2]
                
                Entero ced[comp3]
                    
                Caracter Nombres[tam]
                
                Para i=0 hasta tam, 1
                
                Imprimir "Digite su numero de cedula"
                
                Leer ids
                
                Imprimir "Digite su nombre"
                
                Leer nom
                
                Imprimir "Digite el valor del primer computador"
                
                Leer com1
                
                Imprimir "Digite el valor del segundo computador"
                
                Leer com2
                
                Imprimir "Digite el valor del tercer computador"
                
                Leer com3
                
                ced[i] <- ids
                
                nombres[i] <- nom
                
                comp1[i] <- com1
                
                comp2[i] <- com2
                
                comp3[i] <- com3
                
                promedio <- (((comp1[i] + comp2[i] + comp3[i])/3)/tam)+promedio
                
                Imprimir "El promedio de notas es: " + promedio

        Fin 
*****
