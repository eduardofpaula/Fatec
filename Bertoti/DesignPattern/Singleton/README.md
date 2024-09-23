# Design Pattern Singleton 

## Objetivo

> O padrão Singleton é um padrão de projeto de software que restringe a instanciação de uma classe a um único objeto. Este é útil quando exatamente um objeto é necessário para coordenar ações em todo o sistema. O conceito é por vezes generalizado para sistemas de controle de acesso ou módulos de software que precisam ser instanciados apenas uma vez.

## Estrutura do Padrão

> O padrão Singleton é implementado criando uma classe com um método que cria uma nova instância da classe se uma não existir. Se uma instância já existir, ele simplesmente retorna uma referência a essa instância. Para garantir que a classe tenha apenas uma instância, o construtor da classe é sempre feito privado. A classe também contém uma variável estática que mantém uma referência à instância única que foi criada.

# UML

![alt text](image.png)

