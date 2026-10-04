# Resolução exercício Beecrowd1073

## Descrição do projeto
Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.

## Como Funciona
1. O usuário insere o valor limite, armazenado na variável `num1`.
2. O código possui uma validação condicional para ajustar o limite caso o número digitado seja ímpar.
3. Uma estrutura de repetição `for` inicia no primeiro número par (`i = 2`) e percorre os valores de dois em dois (`i += 2`) até o limite determinado.
4. Dentro do laço, a função `Math.pow(i, 2)` calcula o quadrado do número atual, e o resultado é exibido de forma formatada com `System.out.printf` utilizando `%.0f` para evitar formatação científica (`1e+006`).