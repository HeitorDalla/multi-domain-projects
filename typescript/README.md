# Aplicação Node.js com Docker (Multi-Stage Build)

Este projeto demonstra a containerização de uma aplicação **Node.js + TypeScript + Express** utilizando **Docker Multi-Stage Build**, seguindo boas práticas de **performance, segurança e organização** para ambientes de produção.

---

## 🧱 Estrutura do Projeto

```
.
├── dist/                 # Código JavaScript final (gerado no build)
│   └── index.js
├── src/                  # Código fonte TypeScript
│   └── index.ts
├── node_modules/         # Dependências (geradas no stage de build)
├── Dockerfile            # Dockerfile com multi-stage build
├── .dockerignore         # Arquivos ignorados no build do Docker
├── package.json          # Metadados e scripts do projeto
├── package-lock.json     # Lock das dependências
├── tsconfig.json         # Configuração do TypeScript
└── .gitignore
```

---

## 🚀 Sobre a Aplicação

A aplicação é um servidor **Express** simples que expõe uma rota HTTP:

- **GET /** → retorna:
  ```
  Hello from express app
  ```

A porta é definida por variável de ambiente (`PORT`).

---

## 🐳 Dockerfile — Visão Geral

O Dockerfile utiliza **Multi-Stage Build**, separando claramente o processo de **build** do ambiente de **runtime**.

---

### 🔨 Stage 1 — Build

Imagem base:
```
node:22-alpine
```

Responsabilidades:
- Instalar dependências
- Compilar o código TypeScript
- Gerar o código JavaScript final em `/dist`

Boas práticas utilizadas:
- Uso de `npm ci` para builds reproduzíveis
- Cache otimizado copiando apenas `package*.json` antes do restante do código
- Isolamento total do processo de build

Artefatos gerados:
- `node_modules`
- `dist`

---

### 🏃 Stage 2 — Runtime

Imagem base:
```
gcr.io/distroless/nodejs22-debian12
```

Características:
- Imagem extremamente leve
- Sem shell (`bash` ou `sh`)
- Sem npm
- Contém apenas o necessário para executar a aplicação

Arquivos copiados do stage de build:
- `node_modules`
- `dist`

---

## 🧠 Benefícios do Multi-Stage Build

- ✅ Imagem final menor
- ✅ Menor superfície de ataque
- ✅ Ambiente mais seguro para produção
- ✅ Separação clara entre build e runtime
- ✅ Deploy mais rápido e eficiente

---

## ▶️ Build da Imagem Docker

```bash
docker build -t express-multistage -f src/Dockerfile .
```

---

## ▶️ Executando o Container

Executando na porta padrão:

```bash
docker run -d -p 3000:3000 express-multistage
```

Executando com porta customizada:

```bash
docker run -d -e PORT=8080 -p 8080:8080 express-multistage
```

---

## 🌐 Testando a Aplicação

```bash
curl http://localhost:3000
```

Resposta esperada:

```
Hello from express app
```

---

## 🔐 Observações Importantes

- A imagem final utiliza **Distroless**, portanto:
  - Não é possível acessar o container via `docker exec -it`
- Qualquer debug deve ser feito no **stage de build**
- Ideal para ambientes de **produção**

---

## 🧪 Tecnologias Utilizadas

- Node.js 22
- Express
- TypeScript
- Docker
- Docker Multi-Stage Build
- Distroless Images (Google)

---

## 🎯 Objetivo do Projeto

Demonstrar boas práticas de containerização para aplicações Node.js, utilizando:
- Build isolado
- Runtime mínimo
- Imagens seguras e otimizadas para produção