package com.company.service;

import com.company.entity.Player;

public interface InformerService {

    void informAboutBeginning();

    void informAboutMatchHeapState(int NumberOfMatches);

    void informAboutMoveNumberAndCurrentPlayer(int moveNumber, Player currentPlayer);

    void informAboutMatchesRemovedByPlayer(int NumberOfRemovedMatches, Player player);

    void informAboutInvalidMove();

    void informAboutGameOver();

    void informAboutWinner(Player winner);

}
