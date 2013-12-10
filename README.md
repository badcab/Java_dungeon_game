Java_dungeon_game
=================

for Java(2)


Work Flow

Starting with the main method a player is asked to selected a class and a name, an enemy object is also created at this time. The two Player objects are placed into a Game object

Inside the Game object the Player objects take turns fighting each other untill one of them is dead. While in the context of this program it will always be an Enemy and Hero type Player the Game Object can take anything that implaments the Player Interface

If the Hero returns victrorus from the Game object the program asks the user if they would like to play again. the use can play as long as they do not die.

There are two major interfaces in this program: Equipment and Player. A Player has 4 peices of Equipment: Weapon, Shield, Helm and Armor that gives them better attacking or blocking ability (or both). The Two types of Players are Enemy (computer controlled always attacks) and Hero (Human controlled, can decide what to do each turn)

Thats about it Super and Sub Classes based on two interfaces other than the Game Object and main method.
