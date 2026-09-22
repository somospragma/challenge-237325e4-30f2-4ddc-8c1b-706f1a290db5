# Mejorando la Seguridad y Legibilidad en un Sistema Backend

El equipo de desarrollo de una plataforma de e-commerce necesita reforzar la seguridad y mejorar la legibilidad del código en su sistema backend. El sistema debe implementar mecanismos de autenticación robustos y utilizar un framework que permita escribir código eficiente y legible. El objetivo es asegurar que los datos de los usuarios estén protegidos y que el código sea fácil de mantener y escalar.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Especialista en Framework con Proficiencia en Seguridad y Legibilidad de Código |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 5-7 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Implementación de Autenticación

**Objetivo:** Implementar un mecanismo de autenticación utilizando JWT.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identifica los requisitos de seguridad para la autenticación de usuarios en el sistema.
- Diseña un flujo de autenticación que utilice JWT para proteger las rutas del backend.

**Entregable:** Mecanismo de autenticación funcional utilizando JWT.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que un JWT contiene información sobre el usuario y debe ser verificado en cada solicitud.
- Considera cómo manejar la expiración de los tokens y la renovación de los mismos.

</details>

### Fase 2: Refactorización para Mejorar la Legibilidad

**Objetivo:** Refactorizar el código existente para mejorar su legibilidad y reducir la redundancia.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Identifica áreas del código que pueden ser refactorizadas para mejorar la legibilidad.
- Aplica patrones de diseño y mejores prácticas para reducir la redundancia y mejorar la estructura del código.

**Entregable:** Código refactorizado que demuestra mejoras en legibilidad y estructura.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza patrones de diseño comunes para estructurar tu código de manera más efectiva.
- Aplica el principio DRY (Don't Repeat Yourself) para eliminar redundancias.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un JWT y por qué se utiliza en la autenticación?
- **paraQueSirve**: ¿Para qué sirve refactorizar el código en términos de legibilidad y mantenimiento?
- **comoSeUsa**: ¿Cómo se aplica un patrón de diseño para mejorar la estructura del código?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar autenticación con JWT?

## Criterios de Evaluacion

- Implementar un mecanismo de autenticación utilizando JWT.
- Refactorizar el código para mejorar la legibilidad y reducir la redundancia.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
