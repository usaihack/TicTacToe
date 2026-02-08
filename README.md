# 🎮 TicTacToe CLI Game

<div align="center">

### ❌ ⭕ Classic Strategy Game Reimagined ⭕ ❌

**A vibrant, feature-rich Tic Tac Toe experience brought to your terminal!**

Built with ☕ **Java** | Powered by 🌈 **ANSI Colors**

---

</div>

## ✨ Features

🎯 **Multiple Game Modes**

- 👥 **Human vs Human** - Challenge your friends in classic gameplay
- 🤖 **Human vs Computer** - Test your skills against AI opponents

🎨 **Beautiful Terminal UI**

- Colorful ANSI-styled game board
- Clear, easy-to-read visual feedback
- Smooth gameplay experience

⚡ **Zero Dependencies**

- No GUI required - runs entirely in your terminal
- Lightweight and fast
- Simple installation process

---

## 🚀 Quick Start

After installation (see `DIRECTIONS.md`), launch the game with:

```bash
tictactoe
```

**That's it!** Start playing immediately! 🎉

---

## 🎯 How to Play

1. **Launch the game** using the command above
2. **Select your game mode** (Human vs Human or Human vs Computer)
3. **Make your move** by entering the position number (1-9)
4. **Win by getting three in a row** - horizontally, vertically, or diagonally!

---

## 🛠️ Installation

For detailed installation instructions, please refer to **`DIRECTIONS.md`**

> **Supported Platforms:** Linux systems (with potential cross-platform support)

---

## 🎨 Game Preview

```
  1 | 2 | 3
 -----------
  4 | 5 | 6
 -----------
  7 | 8 | 9
```

_Experience the classic 3x3 grid with colorful markers!_

---

## 🤖 AI Features

The computer opponent uses intelligent decision-making to:

- ✅ Block your winning moves
- ✅ Attempt to win when possible
- ✅ Make strategic plays

---

## 💻 Java Source Code

The core game logic is contained within a single Java file for simplicity and portability.

**[View TicTacToe.java](TicTacToe.java)**

```java
// Logic preview
public static void playHumanVsComputer(Scanner sc, char[][] board) {
    // ... game implementation ...
    if (currentPlayer == 'X') {
        // Human turn
    } else {
        // AI turn
        System.out.println(PURPLE + "Computer is thinking..." + RESET);
        // ...
    }
}
```

---

## 📋 Requirements

- ☕ **Java 11 or lower** (Critical for Kali Linux compatibility)
- 🖥️ Terminal with ANSI color support

> **Note:** This project is specifically designed to run on Kali Linux environments where newer Java versions might not be pre-installed. Please ensure you are compiling with Java 11 compatibility.

---

## 🌟 Why This TicTacToe?

| Feature               | Benefit                           |
| --------------------- | --------------------------------- |
| 🎨 Colorful UI        | Enhanced visual experience        |
| 🚀 Fast & Lightweight | Instant gameplay                  |
| 🤖 Smart AI           | Challenging opponents             |
| 💻 CLI-Based          | No bloated GUI, pure terminal fun |
| 🎯 Simple             | Easy to learn, fun to master      |

---

## 📂 Project Documents

- [**CONTRIBUTING.md**](CONTRIBUTING.md) - Guidelines for contributing to the project
- [**CODE_OF_CONDUCT.md**](CODE_OF_CONDUCT.md) - Community standards
- [**LICENSE**](LICENSE) - MIT License details

---

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

---

## 🤝 Contributing

Found a bug? Have a feature idea? Contributions are welcome!

---

<div align="center">

**Made with ❤️ and ☕**

_Enjoy the game! May the best strategist win!_ 🏆

</div>
