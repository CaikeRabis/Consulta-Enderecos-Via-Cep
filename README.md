# 🚀 Consulta de Endereços via CEP - Java API Project

Este projeto foi desenvolvido para realizar a consulta de endereços a partir de um **CEP** utilizando a API pública **ViaCEP**. A aplicação consome dados externos e converte a resposta JSON em um objeto Java, retornando as informações completas do endereço em tempo real.

## 📋 Funcionalidades

- Consulta de endereço com base no **CEP**.
- Integração com a API pública **ViaCEP**.
- Conversão automática da resposta JSON para um objeto Java.
- Tratamento de exceções para garantir a robustez da aplicação.

## 🛠️ Tecnologias Utilizadas

- **Java 22**: Linguagem de programação principal.
- **HttpClient**: Utilizado para realizar requisições HTTP.
- **Jackson (ObjectMapper)**: Usado para converter o JSON da resposta em um objeto Java.
- **API ViaCEP**: Fonte de dados de endereço baseado no CEP.

## 🚀 Como Executar o Projeto

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina:

- **Java 22**
- **Maven** (opcional, se utilizar dependências no `pom.xml`)
- IDE de sua escolha (Eclipse, IntelliJ, etc.)

### Passo a Passo

```bash
git clone https://github.com/CaikeRabis/Consulta-Enderecos-Via-Cep.git
cd Consulta-Enderecos-Via-Cep
javac -d bin src/*.java
java -cp bin Main
```

### Exemplo de uso
- No método getEndereco(String cep), você pode fornecer qualquer CEP válido do Brasil. O sistema irá retornar as informações de endereço correspondentes.
```java
CepDTO endereco = getEndereco("01001000");
System.out.println(endereco);
```

## 🚧 Melhorias Futuras
- Adicionar testes unitários para validação dos dados retornados.
- Criar uma interface gráfica para facilitar o uso da aplicação.
- Implementar caching para otimizar buscas repetidas.
