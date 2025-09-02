# Requerimientos del Sistema - Distribuidora de Alimentos

## Descripción General
Sistema de cálculo de costos de despacho para una distribuidora de alimentos que ofrece servicio de delivery según montos de compra y distancias.

## Requerimientos Funcionales

### RF01 - Registro de Vehículos
**ID:** RF01  
**Descripción:** El sistema debe permitir el registro de datos del vehículo de despacho.  
**Criterios de Aceptación:**
- Debe capturar marca del vehículo (texto)
- Debe capturar modelo del vehículo (texto)
- Debe capturar cilindrada (número entero)
- Debe capturar tipo de combustible (texto)
- Debe capturar capacidad de pasajeros (número entero)
- Debe mostrar todos los datos registrados en formato legible

### RF02 - Cálculo de Costos de Despacho
**ID:** RF02  
**Descripción:** El sistema debe calcular automáticamente el costo de despacho según las reglas de negocio.  
**Criterios de Aceptación:**
- Para compras sobre $50,000: despacho gratuito (radio 20km)
- Para compras entre $25,000-$49,999: $150 por km
- Para compras menores a $25,000: $300 por km
- Debe calcular el total a pagar (compra + despacho)

### RF03 - Gestión de Entrada de Datos
**ID:** RF03  
**Descripción:** El sistema debe manejar adecuadamente la entrada de datos del usuario.  
**Criterios de Aceptación:**
- Validación de tipos de datos (números donde corresponda)
- Manejo de excepciones en entrada numérica
- Limpieza del buffer del scanner

### RF04 - Interfaz de Usuario
**ID:** RF04  
**Descripción:** El sistema debe proporcionar una interfaz clara y amigable.  
**Criterios de Aceptación:**
- Mensajes de bienvenida y instrucciones claras
- Formato consistente en la presentación de datos
- Separación visual entre secciones diferentes

## Requerimientos No Funcionales

### RNF01 - Rendimiento
**ID:** RNF01  
**Descripción:** El sistema debe responder en tiempo real.  
**Métrica:** Tiempo de respuesta menor a 2 segundos para cualquier operación.

### RNF02 - Usabilidad
**ID:** RNF02  
**Descripción:** La interfaz debe ser intuitiva y fácil de usar.  
**Métrica:** Usuarios sin experiencia técnica deben poder usarlo con mínima capacitación.

### RNF03 - Portabilidad
**ID:** RNF03  
**Descripción:** El sistema debe ejecutarse en cualquier entorno con Java.  
**Métrica:** Compatible con Java 8 o superior.

### RNF04 - Mantenibilidad
**ID:** RNF04  
**Descripción:** El código debe estar bien documentado y estructurado.  
**Métrica:** Documentación completa de cada línea de código.

### RNF05 - Fiabilidad
**ID:** RNF05  
**Descripción:** El sistema debe manejar errores de entrada adecuadamente.  
**Métrica:** No debe crashear por entradas incorrectas del usuario.

## Reglas de Negocio

### RN01 - Política de Despacho
**Ámbito:** Cálculo de costos  
**Descripción:** 
- Compra > $50,000 → Despacho gratis (hasta 20km)
- Compra $25,000-$49,999 → $150 por km
- Compra < $25,000 → $300 por km

### RN02 - Validación de Datos
**Ámbito:** Entrada de datos  
**Descripción:** Todos los campos numéricos deben ser validados como números positivos.

## Tecnologías Requeridas

- Java Development Kit (JDK) 8 o superior
- Editor de texto o IDE para desarrollo
- Sistema de control de versiones Git
- Plataforma GitHub para documentación

## Restricciones Técnicas

- No se permite el uso de frameworks externos
- Debe compilarse y ejecutarse desde línea de comandos
- No se utiliza base de datos (datos en memoria)
- Interfaz basada en consola/texto
