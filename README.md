# 📦 Projeto Express com Docker

Este projeto é uma API em **Node.js com Express**, empacotada e executada utilizando **Docker**. O objetivo é **aprender os conceitos básicos de Docker**, como criação de imagens, uso de Dockerfile e execução de containers.

---

## 🧱 Estrutura do Projeto

```
express-app/
├── src/
│   └── index.js        # Código principal da aplicação Express
├── .gitignore          # Arquivos/pastas ignorados pelo Git
├── Dockerfile          # Receita para construir a imagem Docker
├── package.json        # Dependências e scripts do projeto
├── package-lock.json   # Versões exatas das dependências
```

---

## 🚀 Sobre a Aplicação

A aplicação é uma **API REST simples** que:

- Responde `Hello World` na rota raiz (`/`)
- Permite **registrar usuários** em memória
- Permite **listar usuários registrados**

⚠️ Os dados são armazenados **em memória**, ou seja, são perdidos sempre que o container é reiniciado.

---

## 🌐 Rotas Disponíveis

### `GET /`
Retorna uma mensagem simples para teste.

**Resposta:**
```
Hello World!
```

---

### `GET /users`
Lista todos os usuários registrados.

**Resposta exemplo:**
```json
{
  "users": ["user1", "user2"]
}
```

---

### `POST /users`
Registra um novo usuário.

**Body (JSON):**
```json
{
  "userId": "user1"
}
```

**Respostas possíveis:**
- `201 Created` → Usuário registrado
- `400 Bad Request` → `userId` ausente ou já existente

---

## 🐳 Dockerfile – Explicação Linha a Linha

```dockerfile
FROM node:22
```
Utiliza a imagem oficial do Node.js versão 22 como base.

---

```dockerfile
WORKDIR /app
```
Define `/app` como diretório de trabalho dentro do container.

---

```dockerfile
COPY package.json package-lock.json ./
```
Copia os arquivos de dependências para o container.

> Boa prática: copiar primeiro para aproveitar o cache do Docker.

---

```dockerfile
RUN npm ci
```
Instala as dependências exatamente como definidas no `package-lock.json`.

---

```dockerfile
COPY src/index.js index.js
```
Copia o código da aplicação para dentro do container.

---

```dockerfile
EXPOSE 3000
```
Documenta que a aplicação escuta na porta **3000**.

---

```dockerfile
CMD ["node", "index.js"]
```
Comando executado quando o container inicia.

---

## 🛠️ Como Buildar a Imagem Docker

No diretório raiz do projeto:

```bash
docker build -t express-app .
```

- `-t express-app` → nome da imagem
- `.` → contexto de build (diretório atual)

---

## ▶️ Como Rodar o Container

```bash
docker run -p 3000:3000 express-app
```

- Porta **3000 do host** → Porta **3000 do container**

Acesse no navegador ou via curl:

```
http://localhost:3000
```

---

## 🧪 Testando com curl

### Criar usuário
```bash
curl -X POST http://localhost:3000/users \
  -H "Content-Type: application/json" \
  -d '{"userId":"user1"}'
```

### Listar usuários
```bash
curl http://localhost:3000/users
```

---

## 📚 Conceitos de Docker Aprendidos

✔️ Criar um Dockerfile
✔️ Buildar imagens
✔️ Executar containers
✔️ Expor portas
✔️ Usar imagens oficiais
✔️ Isolar ambiente de execução

---

## 🔮 Próximos Passos (Evolução)

Sugestões para evoluir o projeto:

- Adicionar `nodemon` para ambiente de desenvolvimento
- Criar um `.dockerignore`
- Usar `docker-compose`
- Persistir dados com banco de dados (MongoDB/Postgres)
- Criar variáveis de ambiente (`ENV`)
- Separar rotas e controllers

---

## ✅ Conclusão

Este projeto serve como **base sólida para entender Docker com Node.js**, focando em simplicidade e clareza. Ideal para quem está começando com containers 🚀

