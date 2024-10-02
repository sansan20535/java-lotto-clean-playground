package domain;

import java.util.Arrays;

public enum WinningLottosStatus {

    THREE_CORRECT_LOTTOS(3, 5000, 0, false),
    FOUR_CORRECT_LOTTOS(4, 50000, 0, false),
    FIVE_CORRECT_LOTTOS(5, 1500000, 0, false),
    FIVE_AND_BONUS_CORRECT_LOTTOS(5, 30000000, 0, true),

    SIX_CORRECT_LOTTOS(6, 2000000000, 0, false);

    private final int correctCount;
    private final int prizeMoney;
    private int lottoCount;
    private final boolean isSecondPrize;

    WinningLottosStatus(final int correctCount, final int prizeMoney, final int lottoCount, final boolean isSecondPrize) {
        this.correctCount = correctCount;
        this.prizeMoney = prizeMoney;
        this.lottoCount = lottoCount;
        this.isSecondPrize = isSecondPrize;
    }

    public int getCorrectCount() {
        return correctCount;
    }

    public int getPrizeMoney() {
        return prizeMoney;
    }

    public int getLottoCount() {
        return lottoCount;
    }

    public boolean isSecondPrize() {
        return isSecondPrize;
    }

    public void addWinnerLotto() {
        this.lottoCount += 1;
    }

    public static WinningLottosStatus of(final int correctCount, final boolean isSecondPrize) {
        return Arrays.stream(values())
                .filter(winningLottos -> winningLottos.correctCount == correctCount && winningLottos.isSecondPrize == isSecondPrize)
                .findFirst()
                .orElse(null);
    }

    //테스트 용 메소드
    public static void initialize() {
        for (WinningLottosStatus winningLottosStatus : WinningLottosStatus.values()) {
            winningLottosStatus.lottoCount = 0;
        }
    }
}
