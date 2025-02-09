package baseball.scene;

import baseball.game.state.GameState;
import baseball.game.state.GameStateManager;
import baseball.input.GameOverSceneInput;
import baseball.output.GameOverSceneOutput;

public class GameOverScene implements Scene {
    private final GameStateManager gameStateManager;
    private final GameOverSceneInput input;
    private final GameOverSceneOutput output;

    public GameOverScene(
            final GameStateManager gameStateManager,
            final GameOverSceneInput input,
            final GameOverSceneOutput output
    ) {
        this.gameStateManager = gameStateManager;
        this.input = input;
        this.output = output;
    }

    @Override
    public void run() {
        output.printEndMessage();

        while (gameStateManager.isInGameOver()) {
            final String userInput = input.getUserInput();
            updateFromUserInput(userInput);
        }
    }

    private void updateFromUserInput(final String userInput) {
        final GameOverCommand gameOverCommand = GameOverCommand.find(userInput);
        switch (gameOverCommand) {
            case RE_START -> gameStateManager.update(GameState.GAME);
            case EXIT -> gameStateManager.update(GameState.EXIT);
            default -> throw new IllegalArgumentException("지원하지 않는 메뉴입니다.");
        }
    }
}
