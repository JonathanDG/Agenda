# 📒 Agenda de Contactos - Proyecto de Hackathon 2

Este proyecto consiste en una **agenda de contactos** desarrollada bajo el paradigma de **Programación Orientada a Objetos (POO)**. Permite gestionar una lista de contactos, cada uno con **nombre, apellido y número telefónico**, a través de un **menú interactivo** con múltiples funciones como añadir, buscar, eliminar y mostrar contactos.

> 🛠️ Desarrollado en equipo como parte de un **hackathon**, en un entorno colaborativo por 5 integrantes.

---

## 🚀 Funcionalidades

- ➕ **Agregar contacto**: Crea un nuevo contacto ingresando nombre, apellido y número.
- 🔍 **Buscar contacto**: Permite encontrar un contacto por su nombre o apellido.
- 🗑️ **Eliminar contacto**: Borra un contacto específico por nombre.
- 📋 **Mostrar todos los contactos**: Lista todos los contactos almacenados.
- ❌ **Salir**: Termina el programa.

---

## 🧠 Enfoque de Desarrollo

Este proyecto fue construido bajo los principios de **POO**, favoreciendo la reutilización de código, encapsulamiento y claridad estructural.

### Clases Principales:

- `Contacto`:  
  Representa un contacto individual con atributos privados `nombre`, `apellido` y `telefono`.

- `Agenda`:  
  Contiene una lista de objetos `Contacto`. Incluye los métodos para gestionar la agenda:
  - `agregarContacto()`
  - `deleteContact()`
  - `buscarContacto()`
  - `mostrarContactos()`
  - `espaciosLibres()`
  - `modificarTelefono()`
  - `agendaLlena()`

- `Main` (o `Menu`):  
  Clase con el método `main` que muestra el menú interactivo y gestiona la entrada del usuario.

---

## 👥 Equipo de Desarrollo

Desarrollado en conjunto por un equipo multidisciplinario durante un hackathon:

| Nombre | Rol |
|--------|-----|
| Persona 1 | Lógica de búsqueda y eliminación |
| Persona 2 | Diseño de clases y estructura POO |
| Persona 3 | Desarrollo del menú interactivo |
| Persona 4 | Integración de funcionalidades y pruebas |
| Persona 5 | Documentación y control de versiones |

---

## 🧪 Tecnologías Utilizadas

- Lenguaje: **Java**
- Paradigma: **POO (Programación Orientada a Objetos)**
- IDE: **IntelliJ IDEA**
- Control de versiones: **Git + GitHub**
- Formato de persistencia (opcional): **Archivos .txt / serialización**

---
