package upstart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for MovePiecesToObtainString (LeetCode #2337)
 *
 * Coverage includes:
 * - Examples from problem statement
 * - Edge cases (empty strings, single character, all blanks, no blanks)
 * - Boundary conditions (pieces can't move, already in position)
 * - Data patterns (all L's, all R's, mixed pieces, different blank positions)
 * - Position variations (pieces at start, middle, end, scattered)
 */
public class MovePiecesToObtainStringTest {

    private final MovePiecesToObtainString solution = new MovePiecesToObtainString();

    // Examples from problem statement

    @Test
    public void testExample1_CanTransform() {
        String start = "_L__R__R_";
        String target = "L______RR";
        assertTrue(solution.canChange(start, target),
            "L can move left and R's can move right to reach target");
    }

    @Test
    public void testExample2_CannotTransform() {
        String start = "R_L_";
        String target = "__LR";
        assertFalse(solution.canChange(start, target),
            "R cannot move past L to reach target position");
    }

    @Test
    public void testExample3_CannotMoveRight() {
        String start = "_R";
        String target = "R_";
        assertFalse(solution.canChange(start, target),
            "R can only move right, not left");
    }

    // Edge cases

    @Test
    public void testEdgeCase_SingleBlank() {
        String start = "_";
        String target = "_";
        assertTrue(solution.canChange(start, target),
            "Single blank should match");
    }

    @Test
    public void testEdgeCase_SingleL() {
        String start = "L";
        String target = "L";
        assertTrue(solution.canChange(start, target),
            "Single L in same position should match");
    }

    @Test
    public void testEdgeCase_SingleR() {
        String start = "R";
        String target = "R";
        assertTrue(solution.canChange(start, target),
            "Single R in same position should match");
    }

    @Test
    public void testEdgeCase_AllBlanks() {
        String start = "____";
        String target = "____";
        assertTrue(solution.canChange(start, target),
            "All blanks should match");
    }

    @Test
    public void testEdgeCase_NoBlanks() {
        String start = "LR";
        String target = "LR";
        assertTrue(solution.canChange(start, target),
            "Pieces in same position with no blanks should match");
    }

    @Test
    public void testEdgeCase_DifferentPieceTypes() {
        String start = "L_";
        String target = "R_";
        assertFalse(solution.canChange(start, target),
            "Different piece types cannot transform into each other");
    }

    @Test
    public void testEdgeCase_DifferentPieceCount() {
        String start = "L__";
        String target = "LL_";
        assertFalse(solution.canChange(start, target),
            "Different number of pieces cannot match");
    }

    // L piece movement tests

    @Test
    public void testLPiece_CanMoveLeft() {
        String start = "__L";
        String target = "L__";
        assertTrue(solution.canChange(start, target),
            "L can move left when blanks are available");
    }

    @Test
    public void testLPiece_CannotMoveRight() {
        String start = "L__";
        String target = "__L";
        assertFalse(solution.canChange(start, target),
            "L cannot move right");
    }

    @Test
    public void testLPiece_MultipleLsMovingLeft() {
        String start = "_L_L_";
        String target = "LL___";
        assertTrue(solution.canChange(start, target),
            "Multiple L's can all move left");
    }

    // R piece movement tests

    @Test
    public void testRPiece_CanMoveRight() {
        String start = "R__";
        String target = "__R";
        assertTrue(solution.canChange(start, target),
            "R can move right when blanks are available");
    }

    @Test
    public void testRPiece_CannotMoveLeft() {
        String start = "__R";
        String target = "R__";
        assertFalse(solution.canChange(start, target),
            "R cannot move left");
    }

    @Test
    public void testRPiece_MultipleRsMovingRight() {
        String start = "R_R__";
        String target = "___RR";
        assertTrue(solution.canChange(start, target),
            "Multiple R's can all move right");
    }

    // Mixed pieces tests

    @Test
    public void testMixed_LandRSameOrder() {
        String start = "_L_R_";
        String target = "L___R";
        assertTrue(solution.canChange(start, target),
            "L moves left and R moves right while maintaining order");
    }

    @Test
    public void testMixed_OrderChangeImpossible() {
        String start = "LR";
        String target = "RL";
        assertFalse(solution.canChange(start, target),
            "Cannot change the order of pieces");
    }

    @Test
    public void testMixed_ComplexInvalid() {
        String start = "R_L__R_L";
        String target = "_R__LR_L";
        assertFalse(solution.canChange(start, target),
            "L cannot move right from position 2 to position 4");
    }

    @Test
    public void testMixed_PiecesBlockingEachOther() {
        String start = "R__L";
        String target = "___L";
        assertFalse(solution.canChange(start, target),
            "Cannot remove or add pieces");
    }
}