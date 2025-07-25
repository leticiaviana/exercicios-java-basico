Escreva um código onde temos o controle de banho de um petshop, a maquina de banhos dos pets deve ter as seguintes operações:
Dar banho no pet;
Abastecer com água;
Abastecer com shampoo;
verificar nivel de água;
verificar nivel de shampoo;
verificar se tem pet no banho;
colocar pet na maquina;
retirar pet da máquina;
limpar maquina.
Siga as seguintes regras para implementação

A maquina de banho deve permitir somente 1 pet por vez;
Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
Se o pet for retirado da maquina sem estar limpo será necessário limpar a máquina para permitir a entrada de outro pet;
A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado;
## Requisitos da Máquina de Banho de Pets

Implemente uma classe que simule o funcionamento de uma máquina de banho para pets em um petshop, seguindo as regras abaixo:

### Funcionalidades

- **Dar banho no pet:** Realiza o banho, consumindo recursos.
- **Abastecer com água:** Adiciona 2 litros de água por operação, até o máximo de 30 litros.
- **Abastecer com shampoo:** Adiciona 2 litros de shampoo por operação, até o máximo de 10 litros.
- **Verificar nível de água:** Exibe a quantidade atual de água.
- **Verificar nível de shampoo:** Exibe a quantidade atual de shampoo.
- **Verificar se há pet no banho:** Informa se há um pet na máquina.
- **Colocar pet na máquina:** Permite inserir um pet, se a máquina estiver vazia.
- **Retirar pet da máquina:** Remove o pet, verificando se está limpo.
- **Limpar máquina:** Limpa a máquina, consumindo recursos.

### Regras de Negócio

- Apenas **um pet por vez** pode estar na máquina.
- Cada banho consome **10 litros de água** e **2 litros de shampoo**.
- Capacidade máxima: **30 litros de água** e **10 litros de shampoo**.
- Se o pet for retirado sem estar limpo, é **obrigatório limpar a máquina** antes de inserir outro pet.
- A limpeza consome **3 litros de água** e **1 litro de shampoo**.
- O abastecimento adiciona **2 litros** por vez, respeitando o limite máximo.

---

## Exemplo de Uso

```java
PetWashMachine maquina = new PetWashMachine();
maquina.abastecerAgua();
maquina.abastecerShampoo();
maquina.colocarPet();
maquina.darBanho();
maquina.retirarPet();
```

---

## Dicas

- Implemente verificações para garantir que os recursos não ultrapassem a capacidade máxima.
- Garanta que não seja possível inserir um novo pet sem limpar a máquina, caso o anterior tenha saído sujo.
- Utilize métodos para cada operação descrita acima.

---

## Objetivo

Pratique conceitos de **abstração**, **encapsulamento** e **controle de estado** em Java, simulando um sistema realista de controle de recursos e operações.