Perolas
=======

# Geração do pacote:

```
./activator universal:packageBin
```

Vai gerar o arquivo `./target/universal/perolas-X.XXX.zip`

# Instalação

Basta descompactar o arquivo zip em um diretório do servidor.

O servidor deve ter o Java instalado

# Execução

```
/path-de-instalação/perolas-X.XXX/bin/perolas
```

Para não prender o console e logar as saídas padrão e de erro pode-se usar o nohup:

```
nohup /path-de-instalação/perolas-X.XXX/bin/perolas 2>&1 > /path-de-instalação/perolas-X.XXX/logs/perolas.out &
```

## Primeira Execução

Na primeira execução é necessário criar o banco de dados.

Para isso inicie o servidor com a opção de execução do "Evolutions"

```
/path-de-instalação/perolas-X.XXX/bin/perolas -DapplyEvolutions.default=true
```

Os arquivos de dados serão criados em /path-de-instalação/perolas-X.XXX

```
/path-de-instalação/perolas-X.XXX/perolas.h2.db
/path-de-instalação/perolas-X.XXX/perolas.trace.db
```

## Mudando porta padrão

Para mudar a porta padrão, utilize a opção http.port.

```
/path-de-instalação/perolas-X.XXX/bin/perolas -Dhttp.port=<número da porta>
```

## Outras opções de execução

Verifique o help:

```
/path-de-instalação/perolas-X.XXX/bin/perolas -h
```

