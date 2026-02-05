#!/bin/bash

# Check if running as root
if [[ $EUID -ne 0 ]]; then
   echo "Please run as root: sudo ./install.sh"
   exit 1
fi

# Download the JAR from GitHub to /usr/local/bin
wget -O /usr/local/bin/tictactoe.jar https://github.com/usaihack/TicTacToe/raw/main/TicTacToe.jar

# Create a small launcher script
echo -e '#!/bin/bash\njava -jar /usr/local/bin/tictactoe.jar' > /usr/local/bin/tictactoe

# Make the launcher executable
chmod +x /usr/local/bin/tictactoe

echo "Installation complete! You can now run the game with: tictactoe"
