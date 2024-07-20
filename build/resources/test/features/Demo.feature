# language: es
  @qa
Característica: Navegación exitosa a una página en DemoQA

@moduloElements
  Escenario 1: Interacción exitosa con el módulo Elements
    Dado que el usuario abre el navegador en la página de DemoQA
    Cuando el usuario navega a la sección Elements
    Entonces el usuario puede ver la sección  Elements

  @moduloForm
  Escenario 2: Interacción exitosa con el módulo Forms
    Dado que el usuario abre el navegador en la página de DemoQAdos
    Cuando el usuario navega a la sección Forms
    Entonces el usuario puede interactuar con los formularios de la sección Forms

  @moduloAlert
  Escenario 3: Interacción exitosa con el módulo Alerts, Frame & Windows
    Dado que el usuario abre el navegador en la página de DemoQAtres
    Cuando el usuario navega a la sección Alerts, Frame & Windows
    Entonces el usuario puede interactuar con los elementos de la sección Alerts, Frame & Windows
