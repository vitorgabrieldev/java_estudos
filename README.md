# Instalação e Configuração do Java (Win)

**Este guia fornece instruções passo a passo para instalar e configurar o Java no seu sistema.**

### Passo 1: Baixar o JDK
Baixe a versão mais recente do JDK **(Java Development Kit)** a partir do site oficial da Oracle:
[Oracle JDK](https://www.oracle.com/java/technologies/downloads/#jdk22-windows)

### Passo 2: Instalar o JDK
- Execute o instalador do JDK que você baixou.
- Siga as instruções do instalador e anote o diretório de instalação (por exemplo, ```C:\Program Files\Java\jdk-22```).

### Passo 3: Configurar Variáveis de Ambiente
1. Abra o menu Iniciar e digite "**[variáveis de ambiente](https://kinsta.com/pt/base-de-conhecimento/o-que-sao-variaveis-de-ambiente/)**" e selecione "**Editar as variáveis de ambiente do sistema**".
2.  Na janela "**Propriedades do Sistema**", clique em "**Variáveis de Ambiente**".
3. Na seção "**Variáveis do sistema**", clique em "**Novo**" e adicione a variável JAVA_HOME: ```Nome da variável: JAVA_HOME```
4. Valor da variável (O diretório que você salvo anteriormente): **C:\Program Files\Java\jdk-22**
5. Encontre a variável Path na seção "**Variáveis do sistema**" e clique em "**Editar**".
6. Na janela "**Editar variável de ambiente**", clique em "**Novo**" e adicione ```%JAVA_HOME%\bin```.
7. Clique em "**OK**" para fechar todas as janelas.

### Passo 4: Verificar a Instalação
- Abra um novo terminal ou prompt de comando.
- Digite os seguintes comandos para verificar se o JDK está corretamente instalado:
``` sh
java -version
javac -version
```
Você deve ver a versão do Java instalada. Se tudo estiver correto, você configurou com sucesso o Java no seu sistema!
