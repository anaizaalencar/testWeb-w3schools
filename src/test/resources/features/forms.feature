#encoding: UTF-8
#language: pt

@HTMLForms
Funcionalidade: Envio de dados corretamente do formulario HTML
  Como um usuario do site w3schools
  Fulano quer editar o código de um formulario e acompanhar as mudancas realizadas
  Para que ele consiga validar se os dados estao sendo enviados corretamente

  Contexto:
    Dado que Fulano tem acesso a pagina HTML Forms

  Esquema do Cenário: Dados enviados corretamente
    E ele clica no botao Tente voce mesmo
    E ele preencher o campo First name com seu <nome>
    E ele preencher o campo Last name com seu <sobrenome>
    Quando ele clicar no botao Submit
    Então ele visualiza que a entrada recebida pelo formulario enviado foi texto

    Exemplos:
      | nome    | sobrenome   |
      | "Ana"   | "Alencar"   |
      | "Maria" | "Silva"     |
      | "Jose"  | "Santos"    |
