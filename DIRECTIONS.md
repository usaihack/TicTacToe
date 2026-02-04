# 📦 TicTacToe CLI Game - Installation Guide

<div align="center">

**Complete setup instructions for Linux systems**

🚀 Get up and running in minutes!

---

</div>

## 📋 Prerequisites

Before installing, ensure you have the following:

- ☕ **Java JDK** (OpenJDK 17+ recommended)
- 🌐 **wget** for downloading files

### ✅ Check Java Installation

Verify Java is installed:

```bash
java -version
```

**Expected output:** Version information (e.g., `openjdk version "17.0.x"`)

---

## 🔧 Installing Dependencies

If Java or wget are not installed, run:

```bash
sudo apt update
sudo apt install openjdk-17-jdk wget -y
```

> **Note:** This installs Java 17 and wget on Debian/Ubuntu-based systems (including Kali Linux)

---

## 🚀 Installation Steps

### Step 1: Download the Installer

```bash
wget https://github.com/yourusername/TicTacToeCLI/raw/main/install.sh
```

### Step 2: Make the Script Executable

```bash
chmod +x install.sh
```

### Step 3: Run the Installer

```bash
sudo ./install.sh
```

### 🎯 What the Installer Does:

✅ Downloads `TicTacToeCLI.jar` to `/usr/local/bin/`  
✅ Creates a launcher script called `tictactoe`  
✅ Sets executable permissions  
✅ Makes the game accessible system-wide

---

## 🎮 Running the Game

Once installation is complete, launch the game from anywhere:

```bash
tictactoe
```

**That's it!** The game will start immediately! 🎉

---

## 🗑️ Uninstallation

To remove the game from your system:

```bash
sudo rm /usr/local/bin/tictactoe
sudo rm /usr/local/bin/TicTacToeCLI.jar
```

> **Tip:** This completely removes all game files from your system.

---

## 🐛 Troubleshooting

### Issue: "Command not found" after installation

**Solution:** Try restarting your terminal or run:

```bash
source ~/.bashrc
```

### Issue: "Permission denied" error

**Solution:** Ensure you ran the installer with `sudo`:

```bash
sudo ./install.sh
```

### Issue: Java version errors

**Solution:** Update to Java 17 or higher:

```bash
sudo apt install openjdk-17-jdk -y
```

---

## 📝 Manual Installation (Alternative)

If you prefer to install manually:

1. **Download the JAR file:**

   ```bash
   wget https://github.com/yourusername/TicTacToeCLI/raw/main/TicTacToeCLI.jar
   ```

2. **Move to system directory:**

   ```bash
   sudo mv TicTacToeCLI.jar /usr/local/bin/
   ```

3. **Create launcher script:**

   ```bash
   echo '#!/bin/bash' | sudo tee /usr/local/bin/tictactoe
   echo 'java -jar /usr/local/bin/TicTacToeCLI.jar' | sudo tee -a /usr/local/bin/tictactoe
   ```

4. **Make executable:**
   ```bash
   sudo chmod +x /usr/local/bin/tictactoe
   ```

---

## 🌍 Platform Support

| Platform                 | Status                                  |
| ------------------------ | --------------------------------------- |
| 🐧 Linux (Debian/Ubuntu) | ✅ Fully Supported                      |
| 🐧 Kali Linux            | ✅ Fully Supported                      |
| 🐧 Other Linux Distros   | ✅ Should work (adjust package manager) |
| 🍎 macOS                 | ⚠️ Manual installation recommended      |
| 🪟 Windows               | ⚠️ Use WSL or manual Java execution     |

---

## 💡 Tips

- 🎨 **Best Experience:** Use a terminal with ANSI color support
- ⚡ **Quick Access:** The `tictactoe` command works from any directory
- 🔄 **Updates:** Re-run the installer to update to the latest version

---

<div align="center">

**Need help?** Open an issue on GitHub!

Happy Gaming! 🎮✨

</div>
