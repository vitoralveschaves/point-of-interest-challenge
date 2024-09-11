<h1 align="center" style="font-weight: bold;">Desafio Point of Interest 💻</h1>

<p align="center">
    <b>Resolução do desafio <a href="https://github.com/backend-br/desafios/blob/master/points-of-interest/PROBLEM.md" target="_blank">Point of Interest do Backend Brasil<a/>.</b>
</p>

<h2 id="technologies">💻 Tecnologias</h2>

- Java
- Spring boot
- Spring Data JPA
- H2 Database

<h2 id="started">🚀 Iniciando</h2>

Tenha instalado em sua máquina as seguintes tecnologias:

- Java
- Apache Maven

<h3>Clonando projeto</h3>

```bash
git clone https://github.com/vitoralveschaves/point-of-interest-challenge
```

<h3>Iniciando</h3>

- Inicia sua aplicação com Maven
- A aplicação estará executando em http://localhost:8080

<h2 id="routes">📍 Endpoints da API</h2>
​
| route               | description                                          
|----------------------|-----------------------------------------------------
| <kbd>POST /poi</kbd>     | cadastra um novo ponto de interese [detalhes da resposta](#post-poi-detail)
| <kbd>GET /poi</kbd>     | lista todos os pontos de interesse [detalhes da resposta](#get-poi-detail)
| <kbd>GET /poi/near-me</kbd>     | lista todos os pontos de interesse próximos [detalhes da resposta](#get-poi-near-detail)

<h3 id="post-poi-detail">POST /poi</h3>

**REQUEST BODY**
```json
{
  "name": "restaurante",
  "x": 10,
  "y": 15
}
```

**RESPONSE**
```json
{
  "id": 1,
  "name": "restaurante",
  "x": 10,
  "y": 15
}
```

<h3 id="get-poi-detail">GET /poi</h3>

**RESPONSE**
```json
[
  {
    "id": 1,
    "name": "restaurante",
    "x": 10,
    "y": 15
  },
  {
    "id": 1,
    "name": "restaurante",
    "x": 10,
    "y": 15
  }
]
```
<h3 id="get-poi-near-detail">GET /poi/near-me</h3>

**REQUEST PARAMS**
```json
{
  "x": 10,
  "y": 15,
  "dMax": 10
}
```

**RESPONSE**
```json
[
  {
    "id": 1,
    "name": "restaurante",
    "x": 10,
    "y": 15
  },
  {
    "id": 1,
    "name": "restaurante",
    "x": 10,
    "y": 15
  }
]
```
