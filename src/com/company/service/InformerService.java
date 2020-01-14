package com.company.service;

import com.company.entity.Player;

public interface InformerService {

    void informAboutBeginning();

    void informAboutMatchHeapState(int numberOfMatches);

    void informAboutMoveNumberAndCurrentPlayer(int moveNumber, Player currentPlayer);

    void informAboutMatchesRemovedByPlayer(int numberOfRemovedMatches, Player player);

    void informAboutInvalidMove();

    void informAboutGameOver();

    void informAboutWinner(Player winner);

}
