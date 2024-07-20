# language: es
@qa
Característica: Navegación exitosa a una página en DemoQA

 Antecedentes:
  Dado que el usuario abre el navegador en la página de DemoQA

  @moduloElements
  Esquema del escenario : Interacción exitosa con el módulo Elements
    Cuando el usuario navega a Elements seccion TextBox
    Y intectarua con los elementos de la seccion
    |fullname|email|currentAdrress|permanentAddress|
    Entonces validamos la informacion ingresada <Mensaje>
    Ejemplos:
      |fullname|email|currentAdrress|permanentAddress|mensaje|
      |Ricardo|ricardo@gmail.com|Cra 34 # 23 -34|Cra 34 # 23 -34|Name:Ricardo|

  @moduloForm
  Esquema del escenario : Interacción exitosa con el módulo Forms
    Cuando el usuario navega a la sección <seccion>
    Entonces el usuario puede interactuar con los formularios de la sección <seccion>
    Ejemplos:
      | seccion |
      | Forms   |

  @moduloAlert
  Esquema del escenario : Interacción exitosa con el módulo Alerts, Frame & Windows
    Cuando el usuario navega a la sección <seccion>
    Entonces el usuario puede interactuar con los elementos de la sección <seccion>
    Ejemplos:
      | seccion                 |
      | Alerts, Frame & Windows |