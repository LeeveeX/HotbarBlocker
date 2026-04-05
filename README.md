# HotbarBlocker

A Minecraft Spigot plugin that prevents players from changing their hotbar slots unless they have the appropriate permission.

## Features

- **Hotbar Blocking**: Blocks players from changing hotbar slots by default
- **Permission System**: Uses Spigot permissions to allow specific players to change hotbar slots
- **Lightweight**: Minimal performance impact on your server

## Installation

1. Build the plugin using Maven: `mvn clean package`
2. Copy the JAR file from `target/` to your server's `plugins/` directory
3. Restart your server

## Permissions

- `hotbarblocker.allow` - Allows the player to change hotbar slots

## Usage

Players without the `hotbarblocker.allow` permission will be unable to change their hotbar slots and will receive a message: "You cannot change your hotbar slots!"

## Version

- Version: 1.0.0
- Spigot Version: 1.20.1

## License

This plugin is open source and available on GitHub.