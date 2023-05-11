# Estructura de datos
## Primer taller
#### Historia de usuario
![HistoriaUsuario](/img/Historia%20de%20Usuarios.png)

#### Casos de uso
![CasosDeUso](/img/Casos%20de%20uso.png)

#### Diaframa de flujo
![DiagramaDeFlujo](/img/Diagrama%20de%20fluyo.png)

#### Pseudocodigo

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
