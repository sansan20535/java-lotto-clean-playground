package domain;

import java.util.List;

public class CorrectLottoNumbersCheck {

    private static final int IS_CORRECT_LOTTO_NUMBER = 1;
    private static final int IS_NOT_CORRECT_LOTTO_NUMBER = 0;

    public int checkCorrectLottoNumbers(final Lotto winningLotto, final Lotto lotto) {
        int correctCount = 0;
        for (int lottoNumber : lotto.getLottoNumber()) {
            correctCount += isContainedWinningLottoNumbers(lottoNumber, winningLotto);
        }
        return correctCount;
    }

    private int isContainedWinningLottoNumbers(final int lottoNumber, final Lotto winningLotto) {
        if (winningLotto.getLottoNumber().contains(lottoNumber)) {
            return IS_CORRECT_LOTTO_NUMBER;
        }
        return IS_NOT_CORRECT_LOTTO_NUMBER;
    }
}