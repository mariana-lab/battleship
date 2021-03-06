package org.academiadecodigo.whiledlings.message;

import static org.academiadecodigo.whiledlings.map.Color.*;

public class Message {
    public static final String BANNER = "TERMINAL BATTELSHIP";
    public static final String WELCOME = "WELCOME MARINE! enter /help anytime to see your options";
    public static final String GENERAL_ROOM = "You are at a general room and can talk with everyone";
    // TODO: 24/10/2019 possible commands
    public static final String HELP = "here you go. The possible commands";
    public static final String PM_HELP = "Type /name message to send a pm";
    public static final String ASK_NAME = "Please insert an username:";
    public static final String ASK_COLOR = "Please select the number of a color";
    public static final String[] COLOR_OPTIONS = {ANSI_BLUE + "BLUE" + ANSI_RESET, ANSI_GREEN + "GREEN" + ANSI_RESET, ANSI_YELLOW + "YELLOW" + ANSI_RESET, ANSI_RED + "RED" + ANSI_RESET, ANSI_WHITE + "WHITE" + ANSI_RESET};
    public static final String SPECIAL_ROOM = "Welcome to room ";

    public static final String FINDING_GAME = "Finding a game where you can sink ships...";


    public static final String EMPTY = ANSI_RESET + " " + ANSI_YELLOW_BACKGROUND;
    public static final String DESTROYER = ANSI_YELLOW + " D E S T R O Y E R" + ANSI_RESET;
    public static final String DESTROYER_NUM = EMPTY + ANSI_BLACK + " 1 " + EMPTY + ANSI_BLACK + " 2 " + ANSI_RESET;

    public static final String SUBMARINE = ANSI_YELLOW + " S U B M A R I N E" + ANSI_RESET;
    public static final String SUBMARINE_NUM = DESTROYER_NUM + EMPTY + ANSI_BLACK + " 3 " + ANSI_RESET;

    public static final String CRUISER = ANSI_YELLOW + " C R U I S E R" + ANSI_RESET;
    public static final String CRUISER_NUM = SUBMARINE_NUM;

    public static final String BATTLESHIP = ANSI_YELLOW + " B A T T L E S H I P" + ANSI_RESET;
    public static final String BATTLESHIP_NUM = CRUISER_NUM + EMPTY + ANSI_BLACK + " 4 " + ANSI_RESET;

    public static final String CARRIER = ANSI_YELLOW + " C A R R I E R" + ANSI_RESET;
    public static final String CARRIER_NUM = BATTLESHIP_NUM + EMPTY + ANSI_BLACK + " 5 " + ANSI_RESET;
    // TODO: 24/10/2019 PODIUM, POINTS,...


    public static final String NAME_EXISTS_ERROR = ANSI_RED + "This username already exists" + ANSI_RESET;
    public static final String NAME_EMPTY_ERROR = ANSI_RED + "You can't have an empty username" + ANSI_RESET;
    public static final String COMMAND_NOT_FOUND_ERROR = ANSI_RED + "This command has not been found, try /help for available commands" + ANSI_RESET;

    //GAME STAGES
    public static final String GAME_WELCOME = ANSI_BLUE + "WELCOME MARINE " + ANSI_RESET;
    public static final String GAME_INFO = ANSI_BLUE + "The game will start as soon as another player joins! :)\n" + ANSI_RESET;
    public static final String OPONENT_ARRIVAL = ANSI_BLUE + " has arrived for the battle!" + ANSI_RESET;

    public static final String SETUP_INITIAL = ANSI_BLUE + "Ok, let's start to setup your map... Think wisely!" + ANSI_RESET;
    public static final String SETUP_FINAL = ANSI_BLUE + "Choices have been made, let's throw our cannon balls!" + ANSI_RESET;
    public static final String ROUNDS_INITIAL = ANSI_BLUE + "Round has started." + ANSI_RESET;
    public static final String ROUNDS_FINAL = ANSI_BLUE + "AMAZING GAME" + ANSI_RESET;
    public static final String FINAL_INITIAL = ANSI_BLUE + "Final stage!" + ANSI_RESET;
    public static final String FINAL_FINAL = ANSI_BLUE + "Presenting the stats..." + ANSI_RESET;

    //SETUP
    public static final String ASK_BOAT_DIRECTION = ANSI_YELLOW + "Chose the direction of the " + ANSI_RESET;
    public static final String ASK_BOAT_POSITION = ANSI_YELLOW + "Select the initial position for " + ANSI_RESET;
    public static final String MAP_SETUP_INTRO = ANSI_YELLOW + "Horizontal will select for the right, and the vertical for down" + ANSI_RESET;
    public static final String COMPLETION_MAP = ANSI_YELLOW + "You've completed your strategy, now it's time we wait for " + ANSI_RESET;

    //ROUNDS
    public static final String ROUNDS_START = ANSI_BLUE + "WHOOOF Here we go! Let the BATTLE BEGIN" + ANSI_RESET;
    public static final String ASK_HIT_POSITION = ANSI_BLUE + "Where do you want to hit?\n" + ANSI_RESET;
    public static final String REPEATED_POSITION_ERROR = ANSI_RED + "You've tried that location before!!" + ANSI_RESET;
    public static final String MISS = ANSI_BLUE + "You MISS!!!" + ANSI_RESET;
    public static final String HIT = ANSI_RED + "You HIT!!!!" + ANSI_RESET;


    public static final String INVALID_CELL_ERROR = ANSI_RED + "Please insert a valid position, like A2" + ANSI_RESET;
    public static final String MARKED_POSITION_ERROR = ANSI_RED + "Out of limits or overlapping boats" + ANSI_RESET;
    public static final String INVALID_MENU_ERROR = ANSI_RED + "Please select one of the options" + ANSI_RESET;

}
