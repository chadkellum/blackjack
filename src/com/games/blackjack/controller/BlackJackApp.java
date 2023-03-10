package com.games.blackjack.controller;

import com.games.blackjack.Dealer;

class BlackJackApp {

    private boolean gameOver;
    private Dealer dealer = new Dealer();

    public void execute() {
        welcome();
        promptForName();
        promptForPlayers();
        startGame();
    }

    private void startGame() {
        while (!gameOver){
            // do the rounds of BlackJack

            // gameOver = re-evaluated each time thru the loop
        }
    }

    private void promptForPlayers() {
    }

    private void promptForName() {
    }

    private void welcome() {
    }
}