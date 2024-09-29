package util;

import java.util.ArrayList;
import java.util.List;

public class WinningLottoNumberSeparator {

    private static final String SPLIT_CHARACTERS = ", ";

    public static List<String> separateWinningLottoNumbers(String winningLottoNumbers) {
        return new ArrayList<String>(List.of(winningLottoNumbers.split(SPLIT_CHARACTERS)));
    }
}