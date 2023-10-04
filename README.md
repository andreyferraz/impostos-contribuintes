# Programa para cálculo de impostos de contribuintes físicos e jurídicos 

Programa que faz a leitura de dados de N contribuintes (N fornecido pelo usuário), os quais
podem ser pessoa física ou pessoa jurídica, e depois exibe o valor do imposto pago por cada um,
bem como o total de imposto arrecadado.

Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
seguintes:

**Pessoa física:** pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
destes gastos são abatidos no imposto.

**Exemplo:** uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
fica: (50000 * 25%) - (2000 * 50%) = 11500.00

**Pessoa jurídica:** pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
funcionários, ela paga 14% de imposto.

**Exemplo:** uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
400000 * 14% = 56000.00

### Exemplo abaixo:

![Captura de tela 2023-10-04 105608](https://github.com/andreyferraz/diagram-class-iphone/assets/60530398/74ffd090-21c5-472e-8f08-b73137f7df6a) ![Captura de tela 2023-10-04 105935](https://github.com/andreyferraz/empresa-funcionarios/assets/60530398/92701694-cb09-448b-9bf1-69e9e34bd305)

