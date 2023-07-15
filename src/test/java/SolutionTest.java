import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void combineTest1(){
        int n = 4;
        int k = 2;
        List<List<Integer>> expected = new ArrayList<>(List.of(
                new ArrayList<>(List.of(1,2)),
                new ArrayList<>(List.of(1,3)),
                new ArrayList<>(List.of(1,4)),
                new ArrayList<>(List.of(2,3)),
                new ArrayList<>(List.of(2,4)),
                new ArrayList<>(List.of(3,4))
        ));
        List<List<Integer>> actual = new Solution().combine(n, k);

        Assertions.assertEquals(expected, actual);
    }
}
