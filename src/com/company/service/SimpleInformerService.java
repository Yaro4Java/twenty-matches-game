package com.company.service;

import com.company.entity.Player;

public class SimpleInformerService implements InformerService {

    @Override
    public void informAboutBeginning() {
        System.out.println("\nИгра началась!");
    }

    @Override
    public void informAboutMatchHeapState(int NumberOfMatches) {

        if (NumberOfMatches > 4) {
            System.out.println("\nНа столе " + NumberOfMatches + " спичек.");
        } else if (NumberOfMatches > 1) {
            System.out.println("\nНа столе осталось " + NumberOfMatches + " спички.");
        } else if (NumberOfMatches == 1) {
            System.out.println("\nНа столе осталась 1 спичка.");
        } else {
            System.out.println("\nВсе спички выбраны.");
        }
    }

    @Override
    public void informAboutMoveNumberAndCurrentPlayer(int moveNumber, Player currentPlayer) {
        System.out.println("Ход " + moveNumber + ". Ходит " + currentPlayer.getName() + ".");
    }

    @Override
    public void informAboutMatchesRemovedByPlayer(int NumberOfRemovedMatches, Player player) {

        if (NumberOfRemovedMatches > 4) {
            System.out.println(player.getName() + " убрал " + NumberOfRemovedMatches + " спичек.");
        } else if (NumberOfRemovedMatches > 1) {
            System.out.println(player.getName() + " убрал " + NumberOfRemovedMatches + " спички.");
        } else if (NumberOfRemovedMatches == 1) {
            System.out.println(player.getName() + " убрал 1 спичку.");
        }
    }

    @Override
    public void informAboutInvalidMove() {
        System.out.println("Некорректное значение. Попробуйте ещё раз.");
    }

    @Override
    public void informAboutGameOver() {
        System.out.println("\nИгра окончена!");
    }

    @Override
    public void informAboutWinner(Player winner) {
        System.out.println("Победил " + winner.getName() + ".");
    }
}
