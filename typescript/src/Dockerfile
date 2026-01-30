# Imagem base, com apelido para poder chamar em outro `from`, para baixar as dependencias
FROM node:22-alpine AS build

# Cria e entra na pasta `/app` dentro do BUILD da IMAGE (ou seja, so da para ver se eu fizer docker exec -it no container rodando)
WORKDIR /app

# Copia os arquivos .json para o BUILD da IMAGEM para MELHORA do CACHE do DOCKER
COPY package*.json .

# Instala dependencias e gera o `node/modules`
RUN npm ci

# Copia TODO o RESTO do projeto para `/app`
COPY . .

# Executa o script `build` que gera o /dist
# Esse e o produto final do stage build, com o JavaScript pronto, codigo compilado e sem TypeScript
RUN npm run build


# Imagem que nao possui shell, npm, bash, ou seja, e uma imagem muito menor
FROM gcr.io/distroless/nodejs22-debian12

# Cria e entra na pasta `/app` dentro do RUNTIME
WORKDIR /app

# Copia o node_modules do stage build
# Nao instala nada, apenas copia
COPY --from=build /app/node_modules node_modules

# Copia o RESULTADO do BUILD (apenas o que e necessario para rodar)
COPY --from=build /app/dist dist

# Define variaveis de ambiente (lido pelo node)
ENV PORT=3000

# Executar o artefato final
CMD ["dist/index.js"]