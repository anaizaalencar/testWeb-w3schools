#language: pt

@ModalBoxes
Funcionalidade: Modal
  Como um usuario do site w3schools
  Fulano quer exibir um Modal em tela
  Para que ele consiga observar o funcionamento do Modal

  Contexto:
    Dado que Fulano tem acesso a pagina ModalBoxes

  Cenário: Modal Visivel
    Quando ele clica no botao Abrir Modal
    Então ele deve visualizar o modal em tela

  Cenário: Modal nao visivel
    E ele clica no botao Abrir Modal
    Quando ele clica no botao de fechar no canto superior a direita do modal
    Então ele deve nao mais visualizar o modal em tela
