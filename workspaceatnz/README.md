"# exercicio6java12112021" 


## 1. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
Vamos criar um laço de repetição (for) com 10 voltas que irá armazenar a altura e sexo digitados pelo usuário. 
Para facilitar, criei uma mensagem pedindo o sexo (1-Mulher e 2-Homem) para evitar utilizar String e métodos para validar textos. 
Em seguida, chamamos a classe entrada para receber este valor, armazenando na variável sexo. Pedimos agora para inserir a altura, recebemos este valor e armazenamos na variável altura. Para verificar se o sexo foi de Homem ou Mulher, implementaremos um condicional if testando os valor para 1, para 2 e para 3 (exibindo mensagem de número inválido). 
Caso o sexo seja 1 (mulher), vamos atribuir um valor de +1 na variável que conta o número de mulheres (qtMulheres) através do operador ++. Caso seja homem, também atribuímos ++ para a variável (qtHomens), pois precisaremos dela na hora de calcular a média da altura dos homens, e guardamos o valor da altura na variável da somaH (que chama ela mesma somada com a altura do homem).
Agora, vamos criar mais um condicional if para verificar qual é a maior e menor altura, para isso, basta comparar se a altura digitada é maior que o valor da variável maior e, se for verdade, essa variável passará a ter o valor da altura digitada. Para saber a menor altura, a lógica é o mesmo, se a altura atual for menor que a variável menor, ela passará a ocupar o valor da variável. Agora finalizamos todas as operações do laço for, vamos calcular a média das alturas dos homens, dividindo a soma das alturas pela quantidade de homens. Por fim, é só nós exibirmos todos os valores encontrados na tela e terminamos nosso exercício.
menor=10;

## 2. Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
Vamos declarar as variáveis de quatro salários dos funcionários e da média como double e definir alguns valores para cada um dos salários. Em seguida, vamos calcular a média dos mesmos, para isso, basta somar todos os salários e dividir pela quantidade de funcionários (que serão 4). Para finalizar, é só exibir a média na tela!

## 3. Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.
Começamos declarando as variáveis como double: hp, lp, ha, la e qtd. Vamos colocar alguns valores para a dimensão da parede e do azulejo (coloquei a parede como 2.6 x 1.6 e o azulejo como 0.35 x 0.3). Em seguida, vamos calcular a quantidade de azulejos necessários, basta multiplicar as duas dimensões da parede, para descobrir a área, e dividir pela multiplicação das duas dimensões do azulejo. Vai ficar assim: qtd = (hp * lp) / (ha * la). Por fim, é só exibir a quantidade de azulejos que será necessária para cobrir toda a parede.

## 4. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A, em que as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
Vamos declarar as variáveis V, R e A como double e definir um valor qualquer para as variáveis de altura e de raio. Agora vamos escrever a fórmula, conforme dita no enunciado e, em seguida, exibir na tela uma mensagem contendo o resultado do volume encontrado.

## 5. Escreva um programa para determinar a quantidade de cavalos necessários para se levantar uma massa de m quilogramas a uma altura de h metros em t segundos. Considere cavalos = (m * h / t) / 745,6999
Para resolver este exercício, vamos declarar nossa variáveis m, h, t e cavalos como double. Como não vamos utilizar o Scanner para entrada de dados, vamos colocar alguns valores aleatórios como massa, altura e tempo. Em seguida, vamos criar a fórmula que irá calcular quantos cavalos são necessários. Cavalos será a massa multiplicada pela atura, multiplicada pelo tempo (em segundos), e tudo isso dividido pela constante 745,699.
 
