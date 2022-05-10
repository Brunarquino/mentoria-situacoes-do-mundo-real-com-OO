# Mentoria Situações do Mundo Real com Orientação a Objetos
Mentoria da DIO situações do mundo real com programação orientada a objetos

Projeto pratico de Gerenciamneto de colaboradores:

Colaboradores
- Vendedor:
  - Atributos -> nome, documento, salario, valor da bonificação e endereço.
  
- Operador de Caixa:
  - Atributos -> nome, documento, salario e endereço.
  
- Gerente:
   - Atributos -> nome, documento, horas trabalhadas, valorHora, endereço e valor da bonificação.

Classes:
- Main (Para Execução do projeto)
- FuncionarioCLT (Superclasse de vendedor e Operador de Caixa)
- FuncionarioPJ (Superclasse de Gerente)
- Calcularbonificacao(Interface implentada em Gerente e Operador de Caixa)
- Vendedor (é subclasse de FuncionarioCLT)
- Operador de Caixa  (é subclasse de FuncionarioPJ)
- Gerente (é subclasse de FuncionarioPJ e implementa a interface Calculabinificacao)


