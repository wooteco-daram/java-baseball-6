package baseball;

import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;

public class BaseBallNumberGroup implements Iterable{
    private final List<Integer> baseBallNumbers;

    public BaseBallNumberGroup(List<Integer> baseBallNumbers) {
        validateSize(baseBallNumbers);
        validateDuplicate(baseBallNumbers);
        this.baseBallNumbers = baseBallNumbers;
    }

    private void validateSize(List<Integer> baseBallNumbers) {
        if (baseBallNumbers.size() != GameConstants.SIZE_RANDOM_NUMBER) {
            throw new IllegalArgumentException("숫자 야구 개수는 3개만 가능합니다.");
        }
    }

    private void validateDuplicate(List<Integer> baseBallNumbers) {
        Set<Integer> nonDuplicateNumbers = new HashSet<>(baseBallNumbers);
        if (nonDuplicateNumbers.size() != GameConstants.SIZE_RANDOM_NUMBER) {
            throw new IllegalArgumentException("숫자 야구는 서로 중복될 수 없습니다.");
        }
    }

    @Override
    public ListIterator iterator() {
        return baseBallNumbers.listIterator();
    }

    @Override
    public void forEach(Consumer action) {
        baseBallNumbers.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return baseBallNumbers.spliterator();
    }
}
