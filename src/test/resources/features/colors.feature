#language: pt

@ColorGroups
Funcionalidade: Valor hexadecimal
  Como um usuário do site w3schools
  Fulano quer validar o hexadecial de algumas cores
  Para que ele consiga assegurar que a tabela está com informações corretas

  Contexto:
    Dado que Fulano tem acesso a pagina Color Groups

  Esquema do Cenário: Valores Hexadecimais corretos
    Quando ele visualizar o nome da cor <nomeCor> na coluna Color Name
    Então ele deve visualizar o valor hexadecimal <valorHexadecimal> na coluna HEX

    Exemplos:
      |nomeCor	        |valorHexadecimal	|
      |"Black"	        |"#000000"		    |
      |"Maroon"		    |"#800000"		    |
      |"Gold"		    |"#FFD700"		    |
      |"Cyan"	    	|"#00FFFF"		    |
      |"Blue"		    |"#0000FF"		    |
      |"Silver"		    |"#C0C0C0"		    |
      |"BlueViolet"	    |"#8A2BE2"		    |

