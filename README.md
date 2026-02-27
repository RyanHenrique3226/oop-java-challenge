# Desafio POO – Bootcamp Java

Projeto desenvolvido como parte do desafio **“Abstraindo um Bootcamp usando Orientação a Objetos em Java”**, proposto pela **Digital Innovation One (DIO)** em parceria com a **Accenture**.

O desafio tem como foco a aplicação prática dos principais pilares da **Programação Orientada a Objetos (POO)** utilizando a linguagem **Java**.

---

## Objetivo do Projeto

Aplicar, na prática, os conceitos fundamentais da Programação Orientada a Objetos:

- **Abstração**
- **Encapsulamento**
- **Herança**
- **Polimorfismo**

Por meio da modelagem de um domínio que simula um **Bootcamp**, seus conteúdos educacionais e a progressão dos desenvolvedores participantes.

---

##  Domínio da Aplicação

O projeto simula um ambiente de aprendizado composto por:

### Bootcamp
- Possui uma lista de conteúdos (Cursos e Mentorias)
- Define data de início e término
- Gerencia os desenvolvedores inscritos

###  Conteúdo (Classe Abstrata)
- Define atributos e comportamentos comuns
- Serve como base para cursos e mentorias
- Declara o método abstrato de cálculo de XP

###  Curso
- Possui carga horária
- XP calculado com base na carga horária

###  Mentoria
- Possui data específica
- XP fixo adicional

###  Dev
- Pode se inscrever em um bootcamp
- Progredir nos conteúdos disponíveis
- Concluir conteúdos e acumular XP

---

##  Tecnologias Utilizadas

- **Java 21**
- **Paradigma de Programação Orientada a Objetos**
- **Collections (Set, LinkedHashSet, HashSet)**
- **Java Time API (LocalDate)**
- **IntelliJ IDEA**
- **Git & GitHub**

>  Embora o desafio original utilize Java 11, este projeto foi desenvolvido utilizando **Java 21**, versão LTS mais recente da linguagem.

---

##  Conceitos de POO Aplicados

### 🔹 Abstração
Utilização da classe abstrata `Conteudo` para definir um contrato comum para diferentes tipos de conteúdo.

### 🔹 Encapsulamento
Atributos privados com acesso controlado por meio de getters e setters, garantindo maior segurança e organização do código.

### 🔹 Herança
As classes `Curso` e `Mentoria` herdam de `Conteudo`, reutilizando atributos e comportamentos comuns.

### 🔹 Polimorfismo
O método `calcularXp()` é sobrescrito em cada classe concreta, permitindo comportamentos diferentes através de uma mesma referência do tipo `Conteudo`.

---

##  Execução do Projeto

O fluxo principal da aplicação ocorre na classe `Main`, onde:

1. Cursos e mentorias são criados
2. Um bootcamp é configurado com esses conteúdos
3. Desenvolvedores se inscrevem no bootcamp
4. Os desenvolvedores progridem nos conteúdos
5. O XP total é calculado com base nos conteúdos concluídos

---

##  Observações Finais

Este projeto possui fins **educacionais**, sendo voltado para a prática e consolidação dos conceitos de Programação Orientada a Objetos em Java.  
Refatorações e melhorias podem ser aplicadas para torná-lo ainda mais próximo de um cenário real de mercado.

---

##  Autor

**Ryan Henrique**  
Estudante de Análise e Desenvolvimento de Sistemas (ADS)  
Foco em Java e Programação Orientada a Objetos 
