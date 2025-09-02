# Historias de Usuario - Sistema de Distribución de Alimentos

## Historia de Usuario 01: Registro de Vehículo de Despacho

**ID:** HU01  
**Como:** Administrador de flota  
**Quiero:** Registrar los datos del vehículo de despacho  
**Para:** Mantener un control del parque vehicular utilizado en los envíos

**Criterios de Aceptación:**
- ✓ Debe permitir ingresar marca del vehículo
- ✓ Debe permitir ingresar modelo del vehículo  
- ✓ Debe permitir ingresar cilindrada en cc
- ✓ Debe permitir ingresar tipo de combustible
- ✓ Debe permitir ingresar capacidad de pasajeros
- ✓ Debe mostrar un resumen con todos los datos ingresados

**Ejemplo:**

Usuario: Necesito registrar una camioneta Nissan NP300
Datos: Marca=Nissan, Modelo=NP300, Cilindrada=2500, Combustible=Diésel, Pasajeros=3
Sistema: Muestra resumen confirmando los datos






## Historia de Usuario 02: Cálculo de Costo de Despacho

**ID:** HU02  
**Como:** Cliente o vendedor  
**Quiero:** Calcular automáticamente el costo de despacho  
**Para:** Saber el total a pagar incluyendo el servicio de delivery

**Criterios de Aceptación:**
- ✓ Debe solicitar monto total de la compra
- ✓ Debe solicitar distancia a recorrer en km
- ✓ Debe aplicar tarifa de $0 para compras > $50,000
- ✓ Debe aplicar tarifa de $150/km para compras $25,000-$49,999
- ✓ Debe aplicar tarifa de $300/km para compras < $25,000
- ✓ Debe mostrar desglose del cálculo

**Ejemplo 1 - Compra Grande:**

Compra: $55,000
Distancia: 15km
Resultado: Despacho gratis → Total: $55,000


**Ejemplo 2 - Compra Mediana:**

Compra: $35,000
Distancia: 10km
Resultado: 10km * $150 = $1,500 → Total: $36,500


**Ejemplo 3 - Compra Pequeña:**

Compra: $15,000
Distancia: 8km
Resultado: 8km * $300 = $2,400 → Total: $17,400






## Historia de Usuario 03: Experiencia de Usuario Intuitiva

**ID:** HU03  
**Como:** Usuario del sistema  
**Quiero:** Una interfaz clara y fácil de usar  
**Para:** Realizar las operaciones sin confusiones

**Criterios de Aceptación:**
- ✓ Debe mostrar mensajes de bienvenida e instrucciones
- ✓ Debe separar visualmente las diferentes secciones
- ✓ Debe presentar los resultados de forma organizada
- ✓ Debe usar etiquetas claras para cada campo de entrada

**Ejemplo:**

Sistema: Muestra "=== SISTEMA DE DISTRIBUCIÓN ==="
Sistema: Muestra "Ingrese marca del vehículo: "
Sistema: Separa secciones con líneas de ===
Sistema: Muestra totales con formato claro






## Historia de Usuario 04: Manejo de Errores en Entrada

**ID:** HU04  
**Como:** Usuario ocasional  
**Quiero:** Que el sistema maneje adecuadamente entradas incorrectas  
**Para:** Evitar que el programa falle por errores de digitación

**Criterios de Aceptación:**
- ✓ Debe manejar entradas numéricas donde se esperan números
- ✓ Debe limpiar adecuadamente el buffer de entrada
- ✓ No debe crashear por entradas incorrectas

**Ejemplo:**

Usuario: Ingresa "abc" donde se espera un número
Sistema: Maneja la excepción y solicita nuevamente el dato






## Historia de Usuario 05: Documentación Completa

**ID:** HU05  
**Como:** Desarrollador/maintainer  
**Quiero:** Documentación completa del código  
**Para:** Facilitar el mantenimiento y futuras modificaciones

**Criterios de Aceptación:**
- ✓ Cada línea de código debe estar documentada
- ✓ Debe incluir comentarios sobre la lógica de negocio
- ✓ Debe documentar las variables y su propósito
- ✓ Debe incluir instrucciones de compilación y ejecución


------------------------------------------------------------------



## Priorización de Historias

| Prioridad | Historia ID | Descripción |
|-----------|-------------|-------------|
| Alta | HU02 | Cálculo de costo de despacho |
| Alta | HU01 | Registro de vehículo |
| Media | HU03 | Experiencia de usuario |
| Media | HU04 | Manejo de errores |
| Baja | HU05 | Documentación completa |

## Supuestos del Usuario

1. **Usuario Administrador:** Conocimiento básico de los vehículos de la flota
2. **Usuario Vendedor:** Familiarizado con montos de compra y distancias
3. **Usuario Cliente:** Sabe su dirección y distancia aproximada
4. **Contexto de Uso:** Uso interno en punto de venta o consulta telefónica

## Definición de Terminado (DoD)

Para cada historia de usuario se considera terminada cuando:
- ✓ El código implementa la funcionalidad
- ✓ Cumple todos los criterios de aceptación
- ✓ Pasa las pruebas manuales
- ✓ Está documentada en el repositorio
- ✓ Se integra correctamente al sistema principal




