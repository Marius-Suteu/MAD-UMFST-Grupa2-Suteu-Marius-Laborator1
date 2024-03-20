package com.example.tictactoe;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class TicTacToeService extends Service {
    public TicTacToeService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // This method must be implemented, but since we're not using bound services,
        // we can just throw UnsupportedOperationException
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
