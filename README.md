# exercicio-matriz-agenda
Exercicio na base de matriz e lacos de repeticao para utilizacao de agenda
------------------------------------------------------
# ALGORITMO DO EXERCÍCIO

Início

     Para i de 1 ate 10 passo 1 faca
     Escreva "Nome............" leia DADO [I,1]
     Escreva "Endereco........" leia DADO [I,2]
     Escreva "Codigo postal..." leia DADO [I,3]
     Escreva "Bairro.........." leia DADO [I,4]
     Escreva "Telefone........" leia DADO [I,5]
     Fim para
     Para i de 1 ate 9 passo 1 faca
     Para j de i+1 ate 10 passos 1 faca
     Se (DADO [I,1] > DADO [j,1]) entao
     Troca de nome
     X ← DADO [I,1] 
     Dado [I,1] ← DADO [j,1]
     Dado [j,1] ← X
     Troca de endereco
     X ← DADO [I,2]

Fim


--------------------------------------------------------

![fluxograma](https://github.com/nathalysgomes/exercicio-matriz-agenda/blob/main/fluxo_matriz_agenda.png)

