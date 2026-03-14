# Winery - Checkpoint 1 (SOAP)

Projeto de Web Service SOAP em Java 25 com Maven.

## Estrutura
- Servidor SOAP: `Publisher` (artifactId `WinerySys`)
- Cliente 1: `Consumer/WineStockClient`
- Cliente 2: `Consumer/WineOrderClient`

## Integrantes
- Abner Barbosa: 558468
- Eduardo Dallabella: 556803
- Fernando Luiz: 555201
- Heloísa Real: 554535
- Thomas de Almeida: 554812

## Como executar
1. Execute a classe `Loader` do projeto servidor.
2. Verifique os servicos publicados:
   - `http://localhost:8085/WineStockService?wsdl`
   - `http://localhost:8086/WineWarningService?wsdl`
3. Execute `ApplicationClient1` para consumir `getMenu()`.
4. Execute `ApplicationClient2` para consumir `placeOrder()` e `sendWarn()`.

## Observacoes
- Linguagem: Java 25
- Build: Maven
- Dependencia principal: `jaxws-rt`
