# Tic-Tac-Toe (Jogo da Velha) — Java Console Project

Desenvolvido por **Lucas Santos**  
Repositório: [github.com/Lukezinx/Tic-Tac-Toe](https://github.com/Lukezinx/Tic-Tac-Toe)

---

## 🎯 Sobre o Projeto

Este é um jogo da velha (Tic-Tac-Toe) implementado 100% em Java, utilizando boas práticas de programação orientada a objetos. O projeto foi criado com o objetivo de praticar:

- Organização por pacotes e classes
- Uso de `enum` para representar símbolos
- Separação clara entre lógica do jogo e entrada de dados
- Manipulação de arquivos com a API de I/O (`BufferedWriter`)
- Fluxo de controle com validações e repetição
- Projeto real para portfólio

---

## 📁 Estrutura do Projeto

```
src/
│
├── application/          → Classe `Application` (ponto de entrada)
├── game/                 → Classe `Game`, onde roda o loop principal
├── board/                → Classe `Board`, com o tabuleiro e verificação de vitória/empate
├── player/               → Classe `Player` (anteriormente Players), contendo info e lógica do jogador
├── savedgame/            → Classe `SaveGame`, responsável por salvar a partida
└── symbols/              → Enum `Symbols`, com X, O e EMPTY
```

---

## 🕹️ Como Jogar

1. Execute a aplicação (classe `Application`)
2. Digite os nomes dos dois jogadores
3. Jogue alternadamente digitando linha e coluna (0 a 2)
4. O jogo termina quando houver vitória ou empate
5. Ao fim, você pode optar por salvar o estado final da partida em um arquivo `.txt`

---

## 💾 Funcionalidade de Salvamento

- O jogo pode ser salvo após o fim da partida
- Cria um arquivo com o nome `saveGame.txt` contendo:
  - Estado do tabuleiro
  - Nome dos jogadores
  - Símbolos utilizados
  - Quem foi o último jogador

> O recurso de "carregar jogo" pode ser implementado futuramente.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- API `java.util` (`Scanner`)
- API `java.io` (`BufferedWriter`, `FileWriter`)
- Orientação a Objetos
- Lógica de jogos simples (jogo da velha)

---

## 📌 Possíveis Melhorias Futuras

- Carregar jogo salvo
- Criar menu inicial (Novo Jogo / Carregar / Sair)
- Mostrar índice de jogadas no tabuleiro
- Interface gráfica (JavaFX ou Swing)
- Conversão para aplicação web (Spring Boot)

---

## 📄 Licença

Este projeto é livre para estudo e uso acadêmico.
